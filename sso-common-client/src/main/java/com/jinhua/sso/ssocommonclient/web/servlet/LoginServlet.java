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
 * 登录Servlet模拟
 *
 * @author Jinhua
 * @version 1.0
 * @date 2022/4/2 14:31
 */
@Slf4j
@WebServlet(name = "loginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtil.outputRemoteInfo(req);
        String user = req.getParameter("user");
        String password = req.getParameter("password");
        if (user != null && password != null
                && !user.isEmpty() && !password.isEmpty()) {
            req.getSession().setAttribute("userAttr", user);
            req.getSession().setAttribute("passwordAttr", password);
            ServletUtil.checkSessionUser(req);
            req.getRequestDispatcher("success.jsp").forward(req, resp);
        } else {
            ServletUtil.checkSessionUser(req);
            resp.sendRedirect("index.jsp");
        }
    }

}
