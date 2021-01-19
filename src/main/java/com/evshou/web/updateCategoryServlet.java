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
import java.util.List;

@WebServlet(name = "updateCategoryServlet",value = "/admin/updateCategory")
public class updateCategoryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String category_name = request.getParameter("category_name");
        PrintWriter writer = response.getWriter();
        String path = request.getContextPath();
        HttpSession session = request.getSession();

        SqlSession ss = MybatisUtils.getSqlSession();
        BlogPostsCategoryMapper mapper = ss.getMapper(BlogPostsCategoryMapper.class);
        BlogPostsCategory category1 = (BlogPostsCategory) session.getAttribute("category");
        List<BlogPostsCategory> allCategory = mapper.getAllCategory();
        BlogPostsCategory b=new BlogPostsCategory();
        int i;
        try{
            for (BlogPostsCategory category : allCategory) {
                if(category_name.equals(category.getCategoryName())) throw new NullPointerException();
            }
            b.setCategoryId(category1.getCategoryId());
            b.setCategoryName(category_name);
            i=mapper.updateByPrimaryKeySelective(b);
            if(i>0){
                ss.commit();
                response.sendRedirect(path+"/admin/category");
            }
        }catch (Exception e){
            writer.println("修改失败,事务回滚");
            ss.rollback();
        }

    }
}
