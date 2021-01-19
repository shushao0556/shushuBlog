package com.evshou.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.evshou.entity.BlogPosts;
import com.evshou.entity.BlogPostsCategory;
import com.evshou.mapper.BlogPostsMapper;
import com.evshou.util.DruidUtils;
import com.evshou.util.MybatisUtils;
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

@WebServlet(name = "getAllPostsServlet",value = "/admin/posts")
public class getAllPostsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        SqlSession ss = MybatisUtils.getSqlSession();
        PrintWriter writer = response.getWriter();

        BlogPostsMapper mapper = ss.getMapper(BlogPostsMapper.class);
        QueryRunner qr=new QueryRunner(DruidUtils.getDataSource());
        Long size = null;
        try{
            size=qr.query("select count(category_id) from blog_posts_category",new ScalarHandler<>());
        }catch (Exception e){}
        String sizes=String.valueOf(size);

        List<BlogPosts> allPosts = mapper.getAllPosts();

        String s = JSON.toJSONString(allPosts, SerializerFeature.PrettyFormat);
        String str="{\n" +
                "  \"code\": 0,\n" +
                "  \"msg\": \"\",\n" +
                "  \"count\": ,\n" +
                "  \"data\": "+s+"\n" +
                "} ";
        writer.println(s);
    }
}
