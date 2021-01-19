package com.evshou.web;

import com.evshou.entity.BlogUsers;
import com.evshou.mapper.BlogUsersMapper;
import com.evshou.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "queryUsersServlet",value = "/admin/qu")
public class queryUsersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");

        SqlSession ss = MybatisUtils.getSqlSession();
        BlogUsersMapper mapper = ss.getMapper(BlogUsersMapper.class);
        BlogUsers users = mapper.selectByPrimaryKey(Long.valueOf(id));
        request.setAttribute("users",users);
        request.getRequestDispatcher("/admin/updateUsers.jsp").forward(request,response);
    }
}
