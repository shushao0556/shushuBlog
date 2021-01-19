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
import java.io.IOException;

@WebServlet(name = "addConfigServlet",value = "/admin/addConfig")
public class addConfigServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String webTitle = request.getParameter("webTitle");
        String webTitle2 = request.getParameter("webTitle2");
        String webUrl = request.getParameter("webUrl");
        String web_email = request.getParameter("webEmail");

        SqlSession ss = MybatisUtils.getSqlSession();
        BlogOptionsMapper mapper = ss.getMapper(BlogOptionsMapper.class);
        mapper.insertSelective(new BlogOptions(null,webTitle,webTitle2,webUrl,web_email));
        ss.commit();
        response.sendRedirect(request.getContextPath()+"/admin/config.jsp");
    }
}
