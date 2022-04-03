package com.jinhua.sso.ssocommonclient.web.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 编码过滤器
 *
 * @author Jinhua-Lee
 * @version 1.0
 * @date 2022/4/4 2:26
 */
@WebFilter(filterName = "encoding-filter", urlPatterns = "/*")
public class EncodingFilter extends HttpFilter {

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain)
            throws IOException, ServletException {
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html; charset=UTF-8");
        chain.doFilter(req, res);
    }
}
