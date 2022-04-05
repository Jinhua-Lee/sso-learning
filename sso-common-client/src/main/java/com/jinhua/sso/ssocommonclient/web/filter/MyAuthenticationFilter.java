package com.jinhua.sso.ssocommonclient.web.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

/**
 * 统一认证过滤器
 * 1. 拦截登录请求，
 *
 * @author Jinhua
 * @version 1.0
 * @date 2022/4/2 16:12
 */
@WebFilter(filterName = "myAuthenticationFilter", urlPatterns = "/login")
public class MyAuthenticationFilter extends HttpFilter {

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        String user = req.getParameter("user");
        String password = req.getParameter("password");

        // 1. 用户名为空，则登录失败
        if (user == null || user.isEmpty() || password == null || password.isEmpty()) {
            res.sendRedirect("index.jsp");
            return;
        }

        // 2. 设置Cookie
        res.addCookie(new Cookie("user", user));

        super.doFilter(req, res, chain);
    }
}
