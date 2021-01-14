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
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@WebServlet(name = "getAllUsersServlet",value = "/admin/getAll")
public class getAllUsersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pageNums = request.getParameter("pageNums");
        String pageSize = request.getParameter("pageSize");
        Pages pages=new Pages();
        if (pageNums != null) {
            pages.setPageNums(Integer.parseInt(pageNums));
        }
        if (pageSize != null) {
            pages.setPageSize(Integer.parseInt(pageSize));
        }
        PagesMapper pm=new PagesImpl();
        PageInfo<BlogUsers> allUsers = pm.getAllUsers(pages);
        List<BlogUsers> list = allUsers.getList();
        request.setAttribute("allUsers",allUsers);
        request.getRequestDispatcher("/admin/getAll.jsp").forward(request,response);
    }
}
