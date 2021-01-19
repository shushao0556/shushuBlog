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

@WebServlet(name = "updateUsersServlet",value = "/admin/updateUsers")
public class updateUsersServlet extends HttpServlet {
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

        String id = request.getParameter("id");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String rolename = request.getParameter("rolename");
        String sex = request.getParameter("sex");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String status = request.getParameter("status");
        String vcode = request.getParameter("vcode");
        ValidateCode code = (ValidateCode) session.getAttribute("code");
        if(!vcode.equalsIgnoreCase(code.getCode())){
            writer.println("验证码有误，重新输入");
            return;
        }

        SqlSession ss = MybatisUtils.getSqlSession();
        BlogUsersMapper um = ss.getMapper(BlogUsersMapper.class);
        BlogUsers users=new BlogUsers(Long.valueOf(id),username,password,rolename,sex,email,mobile,null,Integer.parseInt(status));
        int i;
        try{
            i=um.updateByPrimaryKeySelective(users);
            session.setAttribute("users",users);
            if(i>0){
                ss.commit();
                response.sendRedirect(path+"/admin/getAll");
            }

        }catch (Exception e){
            writer.println("修改失败,事务回滚");
            ss.rollback();
        }
    }
}
