<%@ page import="com.evshou.entity.BlogUsers" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" media="all">
    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
    <title>登录页</title>
</head>
<body>
<%
    String path = request.getContextPath();
    BlogUsers users1 = (BlogUsers) session.getAttribute("users");
    if (users1 != null) {
        if(users1.getStatus()==0)response.sendRedirect(path+"/user/index.jsp");
        else if(users1.getStatus()==1) response.sendRedirect(path+"/admin/index.jsp");
    }
%>
<div class="layui-container">
	<fieldset class="layui-elem-field">
		<legend>登录表单</legend>
	</fieldset>
	<div class="layui-row">
		<form method="post" class="layui-form layui-form-pane" action="${pageContext.request.contextPath}/login">
			<div class="layui-form-item" pane>
				<label class="layui-form-label">用户名</label>
				<div class="layui-input-inline">
					<input type="text" lay-verType="tips" name="username" required lay-verify="required|username" placeholder="请输入用户名" autocomplete="off" class="layui-input">
				</div>
				<div class="layui-form-mid layui-word-aux"><a style="color: #FF0000;">必填项</a></div>
			</div>
			<div class="layui-form-item" pane>
				<label class="layui-form-label">密码</label>
				<div class="layui-input-inline">
					<input type="password" lay-verType="tips" name="password" required lay-verify="required|password" placeholder="请输入密码" autocomplete="off" class="layui-input">
				</div>
				<div class="layui-form-mid layui-word-aux"><a style="color: #FF0000;">必填项</a></div>
			</div>
			<div class="layui-form-item" pane>
				<label class="layui-form-label">验证码</label>
				<div class="layui-input-inline">
					<input type="text" name="vcode" required lay-verify="required|vcode" placeholder="请输入验证码" autocomplete="off" class="layui-input">
					<img src="${pageContext.request.contextPath}/vc" alt="">
				</div>
				<div class="layui-form-mid layui-word-aux"><a style="color: #FF0000;">必填项</a></div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">记住我</label>
				<div class="layui-input-block">
					<input type="checkbox" name="readme" lay-skin="switch" lay-text="ON|OFF">
				</div>
				<div class="layui-form-mid layui-word-aux">
					如果是OFF则不保存用户信息，需要每次进行登录操作 <br> 否则选择ON
				</div>
			</div>
			<div class="layui-form-item">
				<div class="layui-input-block">
					<button class="layui-btn" lay-submit lay-filter="formDemo">登录</button>
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
