package com.jinhua.sso.ssocommonclient.web.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 统一登出过滤器
 *
 * @author Jinhua
 * @version 1.0
 * @date 2022/4/2 16:14
 */
@WebFilter(filterName = "mySingleSignOutFilter", urlPatterns = "/logout")
public class MySingleSignOutFilter extends HttpFilter {

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        super.doFilter(req, res, chain);
    }
}
