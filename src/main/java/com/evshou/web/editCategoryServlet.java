package com.evshou.web;

import com.evshou.entity.BlogPostsCategory;
import com.evshou.mapper.BlogPostsCategoryMapper;
import com.evshou.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "editCategoryServlet",value = "/admin/editCategory")
public class editCategoryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String categoryId = request.getParameter("categoryId");

        SqlSession ss = MybatisUtils.getSqlSession();
        BlogPostsCategoryMapper mapper = ss.getMapper(BlogPostsCategoryMapper.class);
        BlogPostsCategory category = mapper.selectByPrimaryKey(Long.valueOf(categoryId));
        session.setAttribute("category",category);
        request.getRequestDispatcher("/admin/editCategory.jsp").forward(request,response);
    }
}
