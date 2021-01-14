package com.evshou.web;

import com.evshou.entity.BlogUsers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "logoutServlet",value = "/logout")
public class logoutServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        BlogUsers users = (BlogUsers) session.getAttribute("users");
        if (users != null) {
            session.removeAttribute("users");
            session.invalidate();
        }else{
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    String name = cookie.getName();
                    if(name.equals("userinfo")){
                        cookie.setMaxAge(0);
                    }
                }
            }
        }
        request.getRequestDispatcher("/public/login.jsp").forward(request,response);
    }
}
