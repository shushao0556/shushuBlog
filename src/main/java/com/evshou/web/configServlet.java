package com.evshou.web;

import com.evshou.entity.BlogOptions;
import com.evshou.mapper.BlogOptionsMapper;
import com.evshou.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "configServlet",value = "/admin/config")
public class configServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        SqlSession ss = MybatisUtils.getSqlSession();

        BlogOptionsMapper mapper = ss.getMapper(BlogOptionsMapper.class);
        BlogOptions bo = mapper.selectByPrimaryKey(1);
        session.setAttribute("bo",bo);
        request.getRequestDispatcher("/admin/config.jsp").forward(request,response);
    }
}
