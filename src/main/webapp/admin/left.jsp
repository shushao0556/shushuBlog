<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" media="all">
    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
    <title>管理员首页</title>
</head>
<body>
	<div class="layui-side layui-bg-black">
		<div class="layui-side-scroll">
			<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
			<ul class="layui-nav layui-nav-tree" lay-shrink="all" lay-filter="test">
				<li class="layui-nav-item layui-nav-itemed">
					<a class="" href="javascript:;">文章管理</a>
					<dl class="layui-nav-child">
						<dd><a href="javascript:;">所有文章</a></dd>
						<dd><a href="javascript:;">写文章</a></dd>
						<dd><a href="javascript:;">分类目录</a></dd>
						<dd><a href="javascript:;">评论管理</a></dd>
					</dl>
				</li>
				<li class="layui-nav-item">
					<a href="javascript:;">外观</a>
					<dl class="layui-nav-child">
						<dd><a href="javascript:;">主题</a></dd>
						<dd><a href="javascript:;">编辑主题</a></dd>
						<dd><a href="javascript:;">超链接</a></dd>
					</dl>
				</li>
				<li class="layui-nav-item">
					<a href="javascript:;">用户管理</a>
					<dl class="layui-nav-child">
						<dd><a href="javascript:;">所有用户</a></dd>
						<dd><a href="javascript:;">添加用户</a></dd>
						<dd><a href="javascript:;">我的个人资料</a></dd>
					</dl>
				</li>
				<li class="layui-nav-item"><a href="javascript:;">设置</a></li>
				<li class="layui-nav-item"><a href="javascript:;">友情链接</a></li>
			</ul>
		</div>
	</div>
</body>
</html>