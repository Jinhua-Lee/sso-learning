package com.jinhua.sso.ssocommonclient.web.servlet;


import com.jinhua.sso.ssocommonclient.util.ServletUtil;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登出功能
 *
 * @author Jinhua
 * @version 1.0
 * @date 2022/4/2 14:33
 */
@Slf4j
@WebServlet(name = "logoutServlet", urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 清空session中的信息
        req.getSession().invalidate();
        ServletUtil.checkSessionUser(req);
        // 回到登录界面
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
