package com.jinhua.sso.ssocommonclient.web.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author Jinhua
 * @version 1.0
 * @date 2022/4/2 18:22
 */
public class MySingleSignOutHttpSessionListener implements HttpSessionListener {
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSessionListener.super.sessionDestroyed(se);
    }
}
