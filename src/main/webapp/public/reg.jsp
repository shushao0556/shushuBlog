<%@ page import="com.evshou.entity.BlogUsers" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" media="all">
    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
    <title>注册页</title>
</head>
<body>
<%
    String path = request.getContextPath();
    BlogUsers users1 = (BlogUsers) session.getAttribute("users");
    if (users1 != null) {
        if(users1.getStatus()==0)response.sendRedirect(path+"/user/");
        else if(users1.getStatus()==1) response.sendRedirect(path+"/admin/index.jsp");
    }
%>
<div class="layui-container">
    <fieldset class="layui-elem-field">
        <legend>注册表单</legend>
    </fieldset>
    <div class="layui-row">
        <form method="post" class="layui-form layui-form-pane" action="${pageContext.request.contextPath}/reg">
            <div class="layui-form-item" pane>
                <label class="layui-form-label">用户名</label>
                <div class="layui-input-block">
                    <input type="text" name="username" required lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item" pane>
                <label class="layui-form-label">密码</label>
                <div class="layui-input-block">
                    <input type="password" name="password" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item" pane>
                <label class="layui-form-label">真实姓名</label>
                <div class="layui-input-block">
                    <input type="text" name="rolename" required lay-verify="required" placeholder="请输入真实姓名" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item" pane>
                <label class="layui-form-label">性别</label>
                <div class="layui-input-block">
                    <input type="radio" name="sex" value="男" title="男" checked>
                    <input type="radio" name="sex" value="女" title="女">
                </div>
            </div>
            <div class="layui-form-item" pane>
                <label class="layui-form-label">邮箱</label>
                <div class="layui-input-block">
                    <input type="email" name="email" required lay-verify="required" placeholder="请输入邮箱" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item" pane>
                <label class="layui-form-label">手机号</label>
                <div class="layui-input-block">
                    <input type="text" name="mobile" required lay-verify="required" placeholder="请输入手机号" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item" pane>
                <label class="layui-form-label">验证码</label>
                <div class="layui-input-block">
                    <input type="text" name="vcode" required lay-verify="required" placeholder="请输入验证码" autocomplete="off" class="layui-input">
                    <img src="${pageContext.request.contextPath}/vc" alt="">
                </div>
            </div>
            <div class="layui-form-item">
                <div class="layui-input-block">
                    <button class="layui-btn" lay-submit lay-filter="formDemo">注册</button>
                    <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                </div>
            </div>
            <script>
                //Demo
                layui.use('form', function(){
                    var form = layui.form;

                    //监听提交
                    form.on('submit(formDemo)', function(data){
                        layer.msg(JSON.stringify(data.field));
                        return true;
                    });
                });
            </script>
        </form>
    </div>
</div>
</body>
</html>
