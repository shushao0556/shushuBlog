package com.evshou.web;

import cn.dsna.util.images.ValidateCode;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet(name = "vcServlet",value = "/vc")
public class vcServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ValidateCode code=new ValidateCode(220,50,4,0);
        String code1 = code.getCode();
        HttpSession session = request.getSession();
        session.setAttribute("code",code);
        code.write(response.getOutputStream());
    }
}
