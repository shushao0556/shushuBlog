package com.evshou.web;

import com.evshou.entity.BlogUsers;
import com.evshou.mapper.BlogUsersMapper;
import com.evshou.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "updateAdminPWDServlet",value = "/admin/updatePWD")
public class updateAdminPWDServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String oldPassWord = request.getParameter("oldPassWord");
        String newpassword = request.getParameter("newpassword");
        String newpassword2 = request.getParameter("newpassword2");

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        HttpSession session = request.getSession();
        BlogUsers users = (BlogUsers) session.getAttribute("users");
        PrintWriter writer = response.getWriter();
        String path = request.getContextPath();

        if(!users.getPassword().equals(oldPassWord)){
            writer.println("旧密码有误，请重新输入");
            return;
        }else if(oldPassWord.equals(newpassword)){
            writer.println("原密码与旧密码一致，请修改");
            return;
        }else if(!newpassword.equals(newpassword2)){
            writer.println("新密码不一致，请修改");
            return;
        }

        SqlSession ss = MybatisUtils.getSqlSession();
        BlogUsersMapper um = ss.getMapper(BlogUsersMapper.class);
        int i;
        try{
            users.setPassword(newpassword);
            i=um.updateByPrimaryKeySelective(users);
            if(i>0){
                ss.commit();
                session.removeAttribute("users");
                session.invalidate();
                Cookie[] cookies = request.getCookies();
                for (Cookie cookie : cookies) {
                    cookie.setMaxAge(0);
                }
                writer.println("修改成功,事务提交,请重新<a href="+path+"/public/login.jsp>登录</a>");
            }
        }catch (Exception e){
            writer.println("修改失败,事务回滚");
            ss.rollback();
        }
    }
}
