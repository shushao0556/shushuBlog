package com.evshou.web;

import com.evshou.entity.BlogUsers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "adminServlet",value = "/admin/")
public class adminServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        HttpSession session = request.getSession();
        PrintWriter writer = response.getWriter();
        String path = request.getContextPath();
        BlogUsers users = (BlogUsers) session.getAttribute("users");
        if (users != null) {
            if(users.getStatus()==0)response.sendRedirect(path+"/user/index.jsp");
            else if(users.getStatus()!=1) writer.println("非法访问!");
            else response.sendRedirect(path+"/admin/index.jsp");
        }else response.sendRedirect(path+"/public/login.jsp");
    }
}
