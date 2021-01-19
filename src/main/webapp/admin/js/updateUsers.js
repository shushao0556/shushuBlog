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
    form.on('submit(formUpdateUsers)', function(data){
        layer.msg(JSON.stringify(data.field));
        return true;
    });
});
layui.use('element', function(){
    var element = layui.element;

});