<%--
  Created by IntelliJ IDEA.
  User: 李旺旺
  DateTime: 2021/4/9 14:40
  Description: 用户注册页面
  Description: 用户注册页面
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>注册</title>
    <link rel="stylesheet" type="text/css" href="css/common.css">
    <link rel="stylesheet" href="css/register.css">
    <%--导入jQuery--%>
    <script src="js/jquery-3.3.1.js"></script>

    <script>
        //校验用户名,单词长度：1~30位
        function checkUserName() {
            //1.获取用户名
            var userName = $("#userName").val();
            //2.定义正则表达式
            var reg_userName = /^\w{1,20}$/;
            //3.判断并给出提示，不合法加一个红色边框
            var flag = reg_userName.test(userName);
            if (flag) {
                $("#userName").css("border", "");
            } else {
                $("#userName").css("border", "1px solid red");
            }
            return flag;
        }

        //校验密码
        function checkPassword() {
            //1.获取密码
            var password = $("#password").val();
            //2.定义正则
            var reg_password = /^\w{8,20}$/;
            //3.判断并给出提示，不合法加一个红色边框
            var flag = reg_password.test(password);
            if (flag) {
                $("#password").css("border", "")
            } else {
                $("#password").css("border", "1px solid red");
            }
            return flag;
        }

        //校验邮箱
        function checkEmail(){
            //1.获取邮箱
            var email = $("#userEmail").val();
            //2.定义正则		itcast@163.com
            var reg_email = /^\w+@\w+\.\w+$/;
            //3.判断并给出提示，不合法加一个红色边框
            var flag = reg_email.test(email);
            if(flag){
                $("#userEmail").css("border","");
            }else{
                $("#userEmail").css("border","1px solid red");
            }
            return flag;
        }

        //校验手机号
        function checkTelephone(){
            //1.获取手机号
            var phone = $("#userTele").val();
            //2.定义正则
            var reg_phone = /^1[3456789]\d{9}$/;
            //3.判断并给出提示，不合法加一个红色边框
            var flag = reg_phone.test(phone);
            if (flag){
                $("#userTele").css("border","");
                return true;
            } else {
                $("#userTele").css("border","1px solid red");
                return false;
            }
        }

        //校验验证码，为空，加一个红色边框
        function checkCode(){
            var check = $("#check").val();
            if (check != ""){
                $("#check").css("border","");
                return true;
            } else {
                $("#check").css("border","1px solid red");
                return false;
            }
        }

        //当表单提交时，调用所有校验方法
        $(function () {
            $("#registerForm").submit(function () {
                var flag = checkUserName() && checkPassword() && checkEmail() && checkTelephone() && checkCode();
                if (flag) {
                    //校验通过，发送sjax请求，提交表单的数据， userName=zhangsan&passowrd=123
                    $.post("user/register", $(this).serialize(), function (data) {
                        //处理服务器响应数据 data {flag:true,errorMsg:"注册失败"}
                        if (data.flag) {
                            Location.href="registerOk.jsp";
                        } else {
                            $("#errorMsg").html(data.errorMsg);
                        }
                    });
                }
                //如果这个方法没有返回值，或者返回false表单不提交
                return false;
            });
        });

    </script>

</head>

<body>

    <div class="rg_layout">
        <div class="rg_form clearfix">

            <div class="rg_form_left">
                <p>新用户注册</p>
                <p>USER REGISTER</p>
            </div>

            <div class="rg_form_center">
                <div id="errorMgs" style="color: red;text-align: center"></div>
                <%--注册表单--%>
                <form id="registerForm" action="user">
                    <%--提交处理请求的标识符--%>
                    <input type="hidden" name="action" value="register">
                    <table style="margin-top: 25px;">

                        <tr>
                            <td class="td_left">
                                <label for="userName">昵称</label>
                            </td>
                            <td class="td_right">
                                <input type="text" id="userName" placeholder="请输入昵称">
                            </td>
                        </tr>

                        <tr>
                            <td class="td_left">
                                <label for="password">密码</label>
                            </td>
                            <td class="td_right">
                                <input type="text" id="password" placeholder="请输入密码(8~20位)">
                            </td>
                        </tr>

                        <tr>
                            <td class="td_left">
                                <label for="userEmail">Email</label>
                            </td>
                            <td class="td_right">
                                <input type="text" id="userEmail" placeholder="请输入邮箱">
                            </td>
                        </tr>

                        <tr>
                            <td class="td_left">
                                <label for="userTele">手机号</label>
                            </td>
                            <td class="td_right">
                                <input type="text" id="userTele" placeholder="请输入手机号">
                            </td>
                        </tr>

                        <tr>
                            <td class="td_left">
                                <label for="userSex">性别</label>
                            </td>
                            <td class="td_right gender">
                                <input type="radio" id="userSex" name="sex" value="男" checked> 男
                                <input type="radio" name="userSex" value="女" style="margin-left: 15px"> 女
                            </td>
                        </tr>

                        <tr>
                            <td class="td_left">
                                <label for="check">验证码</label>
                            </td>
                            <td class="td_right check">
                                <input type="text" id="check" name="check" class="check">
                                <img src="checkCode" height="32px" alt="" onclick="changeCheckCode(this)">
                                <script type="text/javascript">
                                    //图片点击事件
                                    function changeCheckCode(img) {
                                        img.src="checkCode?"+new Date().getTime();
                                    }
                                </script>
                            </td>
                        </tr>

                        <tr>
                            <td class="td_left">
                            </td>
                            <td class="td_right check">
                                <input type="submit" class="submit" value="注册">
                                <span id="msg" style="color: red;"></span>
                            </td>
                        </tr>

                    </table>
                </form>
            </div>

            <div class="rg_form_right">
                <p>
                    已有账号？
                    <a href="login.html">立即登录</a>
                </p>
            </div>

        </div>
    </div>

</body>
</html>
