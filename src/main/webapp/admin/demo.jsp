<%@ page import="java.util.Properties" %>
<%@ page import="java.util.ResourceBundle" %>
<%@ page import="java.io.*" %>
<%@ page import="java.nio.charset.StandardCharsets" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/17
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String filepro="webConfig.properties";
    InputStream in=request.getSession().getServletContext().getResourceAsStream(filepro);
    BufferedReader reader=new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
    Properties pro=new Properties();
    try{
        pro.load(reader);
    }catch (Exception e){e.printStackTrace();}
    request.setAttribute("pro",pro); %>
webTitle : ${pro.webTitle} <br>
webTitle2 : ${pro.webTitle2} <br>
webUrl : ${pro.webUrl} <br>
web_email : ${pro.web_email} <br>
</body>
</html>
