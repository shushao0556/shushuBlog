<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" media="all">
    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
    <title>管理员首页</title>
</head>
<body>
	<div class="layui-header">
		<div class="layui-logo" style="color: #5FB878;" >舒舒博客后台</div>
		<!-- 头部区域（可配合layui已有的水平导航） -->
		<ul class="layui-nav layui-layout-left">
			<li class="layui-nav-item">
				<a href="javascript:;">控制台</a>
			</li>
			<li class="layui-nav-item">
				<a href="javascript:;">发布文章</a>
			</li>
			<li class="layui-nav-item">
				<a href="javascript:;">用户管理</a>
			</li>
			<li class="layui-nav-item">
				<a href="javascript:;">其它系统</a>
				<dl class="layui-nav-child">
					<dd><a href="">邮件管理</a></dd>
					<dd><a href="">消息管理</a></dd>
					<dd><a href="">授权管理</a></dd>
				</dl>
			</li>
		</ul>
		<ul class="layui-nav layui-layout-right">
			<li class="layui-nav-item">
				<a href="javascript:;">
					<img src="http://t.cn/RCzsdCq" class="layui-nav-img">
					贤心
				</a>
				<dl class="layui-nav-child">
					<dd><a href="updatePassword.jsp">修改密码</a></dd>
					<dd><a href="javascript:;">安全设置</a></dd>
				</dl>
			</li>
			<li class="layui-nav-item">
				<a href="${pageContext.request.contextPath}/logout">退了</a>
			</li>
		</ul>
	</div>
</body>
</html>