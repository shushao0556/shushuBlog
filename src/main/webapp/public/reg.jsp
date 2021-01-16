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
					<label class="layui-form-label">真实姓名</label>
					<div class="layui-input-inline">
						<input type="text" name="rolename" required lay-verify="required|rolename" placeholder="请输入真实姓名" autocomplete="off" class="layui-input">
					</div>
					<div class="layui-form-mid layui-word-aux"><a style="color: #FF0000;">必填项</a></div>
				</div>
				<div class="layui-form-item" pane>
					<label class="layui-form-label">性别</label>
					<div class="layui-input-inline">
						<input type="radio" name="sex" value="男" title="男" checked>
						<input type="radio" name="sex" value="女" title="女">
					</div>
				</div>
				<div class="layui-form-item" pane>
					<label class="layui-form-label">邮箱</label>
					<div class="layui-input-inline">
						<input type="email" lay-verType="tips" name="email" required lay-verify="required|email" placeholder="请输入邮箱" autocomplete="off" class="layui-input">
					</div>
					<div class="layui-form-mid layui-word-aux"><a style="color: #FF0000;">必填项</a></div>
				</div>
				<div class="layui-form-item" pane>
					<label class="layui-form-label">手机号</label>
					<div class="layui-input-inline">
						<input type="text" name="mobile" lay-verType="tips" required lay-verify="required|phone" placeholder="请输入手机号" autocomplete="off" class="layui-input">
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
					<div class="layui-input-block">
						<button class="layui-btn" lay-submit lay-filter="formDemo">注册</button>
						<button type="reset" class="layui-btn layui-btn-primary">重置</button>
					</div>
				</div>
				<script>
					//Demo
					layui.use('form', function(){
						var form = layui.form;
						form.verify({
							username: function(value, item){ //value：表单的值、item：表单的DOM对象
								if(value.length<7){
									return '用户名长度不能小于7位';
								}
								if(!new RegExp("^[a-zA-Z0-9_\u4e00-\u9fa5\\s·]+$").test(value)){
									return '用户名不能有特殊字符';
								}
								if(/(^\_)|(\__)|(\_+$)/.test(value)){
									return '用户名首尾不能出现下划线\'_\'';
								}
								if(/^\d+\d+\d$/.test(value)){
									return '用户名不能全为数字';
								}

								//如果不想自动弹出默认提示框，可以直接返回 true，这时你可以通过其他任意方式提示（v2.5.7 新增）
								if(value === 'xxx'){
									alert('用户名不能为敏感词');
									return true;
								}
							}

							//我们既支持上述函数式的方式，也支持下述数组的形式
							//数组的两个值分别代表：[正则匹配、匹配不符时的提示文字]
							,password: [
								/^[\S]{6,12}$/
								,'密码必须6到12位，且不能出现空格'
							] ,rolename:function(value, item){
								if(value.length<1||value.length>4){
									return '真实姓名不正确';
								}
							}
							,vcode: function(value, item){
								if(value.length!=4){
									return '验证码不正确';
								}
							}
						});

						//监听提交
						form.on('submit(formDemo)', function(data){
							layer.msg(JSON.stringify(data.field));
							return false;
						});
					});
				</script>
			</form>
		</div>
	</div>
</body>
</html>
