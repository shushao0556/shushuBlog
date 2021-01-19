<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="layui-side layui-bg-black">
	<div class="layui-side-scroll">
		<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
		<ul class="layui-nav layui-nav-tree" lay-shrink="all" lay-filter="test">
			<li class="layui-nav-item"><%-- layui-nav-itemed"--%>
				<a class="" href="javascript:;">文章管理</a>
				<dl class="layui-nav-child">
					<dd><a href="edit.jsp">所有文章</a></dd>
					<dd><a href="post-new.jsp">写文章</a></dd>
					<dd><a href="${pageContext.request.contextPath}/admin/category">分类目录</a></dd>
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
					<dd><a href="${pageContext.request.contextPath}/admin/getAll">所有用户</a></dd>
					<dd><a href="${pageContext.request.contextPath}/admin/addUsers.jsp">添加用户</a></dd>
					<dd><a href="javascript:;">我的个人资料</a></dd>
				</dl>
			</li>
			<li class="layui-nav-item"><a href="${pageContext.request.contextPath}/admin/config.jsp">设置</a></li>
			<li class="layui-nav-item"><a href="javascript:;">友情链接</a></li>
		</ul>
	</div>
</div>