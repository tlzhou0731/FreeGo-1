<%@ page import="domain.ScenicInfo" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: Macro
  Date: 2021/4/18
  Time: 14:29
  Describe:
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/popper.js/1.15.0/umd/popper.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <style>
        /* Make the image fully responsive */
        .carousel-inner img {
            width: 100%;
            height: 100%;
        }
    </style>
    <title> 景点主界面 </title>
</head>

<body>
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
    <%
        List<ScenicInfo> scenicInfoList = null;
        scenicInfoList = (List<ScenicInfo>)request.getAttribute("scenicInfoList");%>
    <div id="scenicCarousel1" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#scenicCarousel1" data-slide-to="0" class="active"></li>
            <li data-target="#scenicCarousel1" data-slide-to="1"></li>
            <li data-target="#scenicCarousel1" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="images/scenic_show_1.jpg" class="d-block w-100" alt="First slide">
            </div>
            <div class="carousel-item">
                <img src="images/scenic_show_2.jpg" class="d-block w-100" alt="second slide">
            </div>
            <div class="carousel-item">
                <img src="images/scenic_show_3.jpg" class="d-block w-100" alt="third slide">
            </div>
        </div>
        <a class="carousel-control-prev" href="#scenicCarousel1" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#scenicCarousel1" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>


    <div>
        <%if(scenicInfoList != null){
            for (int i = 0;i < scenicInfoList.size();i++){%>
                <tr>
                    <td><input type="checkbox"></td>
                    <td><%=scenicInfoList.get(i).getProvince()%></td>
                    <td><%=scenicInfoList.get(i).getScenicAddress()%></td>
                    <br>
                </tr>
        <%}}else{%>
        <h1>没值</h1>
        <%}%>
    </div>

</body>

</html>
