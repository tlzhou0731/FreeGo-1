<%--
  Created by IntelliJ IDEA.
  User: 李旺旺
  DateTime: 2021/4/9 19:46
  Description: 头部
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<header id="header">
    <div class="top_banner">
        <img src="images/top_banner.jpg" alt="">
    </div>

    <div class="shortcut">
        <%--未登录状态--%>
        <div id="login_out" class="login_out">
            <a href="login.jsp">登录</a>
            <a href="register.jsp">注册</a>
        </div>
        <%--登录状态--%>
        <div id="login" class="login">
            <span id="span_userName"></span>
            <a href="myFavorite.jsp" class="collection">我的收藏</a>
            <a href="javascript:location.href='user/exit;'">退出</a>
            <a id="cancelAccount">注销账号</a>
        </div>
    </div>
    
    <div class="header_wrap" style="display: none">
        <div class="topbar">
            <div class="logo">
                <img src="images/logo.png" alt="">
            </div>

            <div class="search">
                <input name="" id="search_input" type="text" placeholder="请输入搜索内容" class="search_input" autocomplete="off">
                <a href="javascript:void(0);" id="search-button" class="search-button">搜索</a>
            </div>

        </div>
    </div>
</header>

<div class="navitem">
    <ul id="category" class="nav">
        <!--<li class="nav-active"><a href="index.html">首页</a></li>
        <li><a href="route_list.html">门票</a></li>
        <li><a href="route_list.html">酒店</a></li>
        <li><a href="route_list.html">香港车票</a></li>
        <li><a href="route_list.html">出境游</a></li>
        <li><a href="route_list.html">国内游</a></li>
        <li><a href="route_list.html">港澳游</a></li>
        <li><a href="route_list.html">抱团定制</a></li>
        <li><a href="route_list.html">全球自由行</a></li>
        <li><a href="favoriterank.html">收藏排行榜</a></li>-->
    </ul>
</div>

