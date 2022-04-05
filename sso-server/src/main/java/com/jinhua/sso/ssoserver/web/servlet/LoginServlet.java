package com.jinhua.sso.ssoserver.web.servlet;

import com.jinhua.sso.ssoserver.util.ServletUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * SSO 统一登录处理
 *
 * @author Jinhua-Lee
 */
@WebServlet(name = "loginServlet", value = "/login")
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
