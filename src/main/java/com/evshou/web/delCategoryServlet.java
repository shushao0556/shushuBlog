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
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "delCategoryServlet",value = "/admin/delCategory")
public class delCategoryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();

        String categoryId = request.getParameter("categoryId");
        SqlSession ss = MybatisUtils.getSqlSession();
        BlogPostsCategoryMapper mapper = ss.getMapper(BlogPostsCategoryMapper.class);
        int i;
        try{
            i=mapper.deleteByPrimaryKey(Long.valueOf(categoryId));
            if(i>0) {
                ss.commit();
                response.sendRedirect(request.getContextPath()+"/admin/category");
            }
        }catch (Exception e){
            writer.println("删除失败,事务回滚");
            ss.rollback();
        }

    }
}
