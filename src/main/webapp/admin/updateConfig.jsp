<%@ page import="java.io.File" %>
<%@ page import="java.util.Properties" %>
<%@ page import="java.io.InputStream" %>
<%@ page import="java.io.BufferedReader" %>
<%@ page import="java.io.InputStreamReader" %>
<%@ page import="java.nio.charset.StandardCharsets" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" media="all">
    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
    <title>管理员首页</title>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <jsp:include page="header.jsp"/>
    <jsp:include page="left.jsp"/>

    <div class="layui-body">
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
            <legend>网站设置</legend>
        </fieldset>
        <div class="layui-row">
            <form method="post" class="layui-form layui-form-pane" action="${pageContext.request.contextPath}/admin/updateConfig">
                <div class="layui-form-item" pane>
                    <label class="layui-form-label">${requestScope.bo.optionsName}</label>
                    <div class="layui-input-inline">
                        <input type="text" value="${requestScope.bo.optionsValue}" lay-verType="tips" name="webTitle" required lay-verify="required" placeholder="请输入网站标题" autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux"><a style="color: #FF0000;">必填项</a></div>
                </div>
                <div class="layui-form-item" pane>
                    <label class="layui-form-label">${requestScope.bo2.optionsValue}</label>
                    <div class="layui-input-inline">
                        <input type="text" value="${requestScope.bo2.optionsValue}" lay-verType="tips" name="webTitle2" required lay-verify="required" placeholder="请输入网站标题" autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux"><a style="color: #FF0000;">必填项</a></div>
                </div>
                <div class="layui-form-item" pane>
                    <label class="layui-form-label">${requestScope.bo3.optionsValue}</label>
                    <div class="layui-input-inline">
                        <input type="text" value="${requestScope.bo3.optionsValue}" lay-verType="tips" name="webUrl" required lay-verify="required" placeholder="请输入网站地址" autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux"><a style="color: #FF0000;">必填项</a></div>
                </div>
                <div class="layui-form-item" pane>
                    <label class="layui-form-label">${requestScope.bo4.optionsValue}</label>
                    <div class="layui-input-inline">
                        <input type="email" value="${requestScope.bo4.optionsValue}" lay-verType="tips" name="web_email" required lay-verify="required" placeholder="请输入邮箱" autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux"><a style="color: #FF0000;">必填项</a></div>
                </div>
                <div class="layui-form-item">
                    <div class="layui-input-block">
                        <button class="layui-btn" lay-submit lay-filter="formConfig">保存</button>
                        <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                    </div>
                </div>
            </form>
            <script>
                layui.use('form', function(){
                    var form = layui.form;

                    //监听提交
                    form.on('submit(formConfig)', function(data){
                        layer.msg(JSON.stringify(data.field));
                        return true;
                    });
                });
            </script>
        </div>
    </div>

    <jsp:include page="footer.jsp"/>
</div>
<script>
    //JavaScript代码区域
    layui.use('element', function () {
        var element = layui.element;

    });
</script>
</body>
</html>
