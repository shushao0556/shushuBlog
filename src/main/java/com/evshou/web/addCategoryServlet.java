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
import java.io.PrintWriter;

@WebServlet(name = "addCategoryServlet",value = "/admin/addCategory")
public class addCategoryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        HttpSession session = request.getSession();
        String path = request.getContextPath();

        String category_name = request.getParameter("category_name");
        String del = request.getParameter("del");

        SqlSession ss = MybatisUtils.getSqlSession();
        BlogPostsCategoryMapper mapper = ss.getMapper(BlogPostsCategoryMapper.class);
        BlogPostsCategory cg=new BlogPostsCategory(null,category_name);
        int i;
        int d;
        try{
            i=mapper.insertSelective(cg);
            if(i>0){
                ss.commit();
                response.sendRedirect(path+"/admin/category.jsp");
            }
        }catch (Exception e){
            writer.println("分类名称已存在或添加失败,事务回滚");
            ss.rollback();
        }
    }
}
