package com.evshou.web;

import com.evshou.entity.BlogUsers;
import com.evshou.entity.Pages;
import com.evshou.mapper.BlogUsersMapper;
import com.evshou.mapper.PagesImpl;
import com.evshou.mapper.PagesMapper;
import com.evshou.util.MybatisUtils;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UsersServlet",value = "/admin/users")
public class UsersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SqlSession ss = MybatisUtils.getSqlSession();
        BlogUsersMapper um = ss.getMapper(BlogUsersMapper.class);
        List<BlogUsers> allUsers = um.getAllUsers();
        HttpSession session = request.getSession();
        session.setAttribute("allUsers",allUsers);
        request.getRequestDispatcher("/public/login.jsp").forward(request,response);
    }
}
