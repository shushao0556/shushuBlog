package com.evshou.web;

import cn.dsna.util.images.ValidateCode;
import com.evshou.entity.BlogUsers;
import com.evshou.mapper.BlogUsersMapper;
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
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "regServlet",value = "/reg")
public class regServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        PrintWriter writer = response.getWriter();
        String path = request.getContextPath();
        HttpSession session = request.getSession();

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String rolename = request.getParameter("rolename");
        String sex = request.getParameter("sex");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String vcode = request.getParameter("vcode");
        ValidateCode code = (ValidateCode) session.getAttribute("code");
        if(!vcode.equalsIgnoreCase(code.getCode())){
            writer.println("验证码有误，重新输入");
            return;
        }
        Date date;
        date=new Date(System.currentTimeMillis());
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date registered=null ;
        try{
            registered=sdf.parse(sdf.format(date));
        } catch (Exception ignored){ignored.printStackTrace();}

        SqlSession ss = MybatisUtils.getSqlSession();
        BlogUsersMapper um = ss.getMapper(BlogUsersMapper.class);
        BlogUsers users=new BlogUsers(username,password,rolename,sex,email,mobile,registered,0);
        int i;
        try{
            i=um.insertSelective(users);
            session.setAttribute("users",users);
            if(i>0) writer.println("注册成功,事务提交,返回<a href="+path+"/public/login.jsp>登录</a>");
            ss.commit();
        }catch (Exception e){
            writer.println("注册失败,事务回滚,重新<a href="+path+"/public/login.jsp>注册</a>");
            ss.rollback();
        }
        request.getRequestDispatcher("/public/login.jsp").forward(request,response);
    }
}
