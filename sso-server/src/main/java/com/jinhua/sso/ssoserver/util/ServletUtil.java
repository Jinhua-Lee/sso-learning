package com.jinhua.sso.ssoserver.util;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @author Jinhua
 * @version 1.0
 * @date 2022/4/2 15:58
 */
@Slf4j
public class ServletUtil {

    public static void checkSessionUser(HttpServletRequest req) {
        String userAttr = (String) req.getSession().getAttribute("userAttr");
        String passwordAttr = (String) req.getSession().getAttribute("passwordAttr");

        log.info("======= check session user start =======");
        log.info("sessionUser = {}", userAttr);
        log.info("sessionPassword = {}", passwordAttr);
        log.info("======= check session user end =======");
    }

    public static void outputRemoteInfo(HttpServletRequest req) {
        log.info("======= request info start =======");
        log.info("context path = {}", req.getContextPath());
        log.info("remote User = {}", req.getRemoteUser());
        log.info("remote Host = {}", req.getRemoteHost());
        log.info("remote Port = {}", req.getRemotePort());
        log.info("remote Address = {}", req.getRemoteAddr());
        log.info("======= request info end =======");
    }

    public static void outputCookieInfo(HttpServletRequest req) {
        log.info("======= cookie info start =======");

        for (Cookie cookie : req.getCookies()) {
            log.info("cookie: name = {}, value = {}", cookie.getName(), cookie.getValue());
        }

        log.info("======= request info end =======");
    }
}
