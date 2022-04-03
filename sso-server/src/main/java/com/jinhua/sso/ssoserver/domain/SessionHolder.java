package com.jinhua.sso.ssoserver.domain;

import javax.servlet.http.HttpSession;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 作为Session的管理中心
 *
 * @author Jinhua
 * @version 1.0
 * @date 2022/4/2 18:25
 */
public class SessionHolder {

    public static Map<String, HttpSession> sessionMap = new ConcurrentHashMap<>();
}
