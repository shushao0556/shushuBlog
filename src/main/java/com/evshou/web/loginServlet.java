package com.evshou.web;

import cn.dsna.util.images.ValidateCode;
import com.evshou.entity.BlogUsers;
import com.evshou.mapper.BlogUsersMapper;
import com.evshou.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "loginServlet",value = "/login")
public class loginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        HttpSession session = request.getSession();

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String vcode = request.getParameter("vcode");
        String readme = request.getParameter("readme");

        PrintWriter writer = response.getWriter();
        String path = request.getContextPath();
        ValidateCode code = (ValidateCode) session.getAttribute("code");
        if(!vcode.equalsIgnoreCase(code.getCode())){
            writer.println("验证码有误，重新输入");
            return;
        }

        SqlSession ss = MybatisUtils.getSqlSession();
        BlogUsersMapper mapper = ss.getMapper(BlogUsersMapper.class);
        BlogUsers users = mapper.checkLogin(username, password);
        BlogUsers users1 = (BlogUsers) session.getAttribute("users");
        if(users!=null){
            if(users.getStatus()==0)response.sendRedirect(path+"/user/index.jsp");
            else if(users.getStatus()==1) response.sendRedirect(path+"/admin/index.jsp");
            else if(users.getStatus()!=1) writer.println("非法访问!");
            if(users1!=null) {
                if(users1.getStatus()==0)response.sendRedirect(path+"/user/index.jsp");
                else if(users1.getStatus()==1) response.sendRedirect(path+"/admin/index.jsp");
                else if(users1.getStatus()!=1) writer.println("非法访问!");
            }
            if(readme!=null){
                session.setAttribute("users",users);
                Cookie cookie=new Cookie("userinfo",username+"#"+password);
                cookie.setPath("/");
                cookie.setMaxAge(60*60*24*7);
                response.addCookie(cookie);
            }
        }else{
            writer.println("登录失败,请重新<a href="+path+"/public/login.jsp>登录</a>");
        }
    }
}
