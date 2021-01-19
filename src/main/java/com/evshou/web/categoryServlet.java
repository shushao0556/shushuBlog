package com.evshou.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.evshou.entity.BlogPostsCategory;
import com.evshou.entity.BlogUsers;
import com.evshou.entity.Pages;
import com.evshou.mapper.BlogPostsCategoryMapper;
import com.evshou.mapper.PagesImpl;
import com.evshou.mapper.PagesMapper;
import com.evshou.util.DruidUtils;
import com.evshou.util.MybatisUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;
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

@WebServlet(name = "categoryServlet",value = "/admin/category")
public class categoryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        String pageNums = request.getParameter("pageNum");
        String pageSize = request.getParameter("pageSize");
        Pages pages=new Pages();
        if (pageNums != null) {
            pages.setPageNums(Integer.parseInt(pageNums));
        }
        if (pageSize != null) {
            pages.setPageSize(Integer.parseInt(pageSize));
        }
        PagesMapper pm=new PagesImpl();
        PageInfo<BlogPostsCategory> allPostsCategory = pm.getAllPostsCategory(pages);

        QueryRunner qr=new QueryRunner(DruidUtils.getDataSource());
        Object size=null;
        try{
            size=qr.query("select count(category_id) from blog_posts_category",new ScalarHandler<>());
        }catch (Exception ignored){}
        session.setAttribute("size",size);

        SqlSession ss = MybatisUtils.getSqlSession();
        BlogPostsCategoryMapper mapper = ss.getMapper(BlogPostsCategoryMapper.class);
        List<BlogPostsCategory> allCategory = mapper.getAllCategory();

        session.setAttribute("allPostsCategory",allPostsCategory);
        session.setAttribute("allCategory",allCategory);
        request.getRequestDispatcher("/admin/category.jsp").forward(request,response);
    }
}
