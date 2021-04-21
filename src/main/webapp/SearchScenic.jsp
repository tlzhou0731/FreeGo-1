<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  Author: Macro
  Date: 2021/4/21
  Time: 11:06
  Describe:
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>主界面</title>

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    <![endif]-->

    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>

    <%--&lt;%&ndash;    bootstr select&ndash;%&gt;--%>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-select@1.13.9/dist/css/bootstrap-select.min.css">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap-select@1.13.9/dist/js/bootstrap-select.min.js"></script>

    <!-- (Optional) Latest compiled and minified JavaScript translation files -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap-select@1.13.9/dist/js/i18n/defaults-*.min.js"></script>


</head>
<body>
<h1>多选框</h1>
<script type="text/javascript">
    var choosesum = [];
    var ss = "jsSS";

    // $(window).on('load', function () {
    //     $('#dateChoose').selectpicker({
    //         'selectedText': 'cat'
    //     });
    // });

    function getDates() {
        var val = "", staffs = [],dates = [];
        //循环的取出插件选择的元素(通过是否添加了selected类名判断)
        for (var i = 0; i < $("li.selected").length; i++) {
            val = $("li.selected").eq(i).find(".text").text();
            if (val != '') {
                staffs.push(val);
                dates.push(val);
            }
        }
        choosesum = staffs;
    }

    function getAdds() {
        var val = "", staffs = [], adds = [];
        //循环的取出插件选择的元素(通过是否添加了selected类名判断)
        for (var i = 0; i < $("li.selected").length; i++) {
            val = $("li.selected").eq(i).find(".text").text();
            if (val != '') {
                staffs.push(val);
                adds.push(val)
            }
        }
        choosesum = staffs;
    }

    function getThemes() {
        var val = "", staffs = [], themes = [];
        //循环的取出插件选择的元素(通过是否添加了selected类名判断)
        for (var i = 0; i < $("li.selected").length; i++) {
            val = $("li.selected").eq(i).find(".text").text();
            if (val != '') {
                staffs.push(val);
                themes.push(val);
            }
        }
        choosesum = staffs;
    }

    function showChoose(){
        console.log(choosesum);
    }

</script>

<%
    List<String> scenicThemeList = null;
    scenicThemeList = (List<String>)request.getAttribute("scenicThemeList");%>

<div class="btn-toolbar" role="toolbar" aria-label="...">
    <div class="btn-group" role="group" aria-label="...">
        <div class="btn-group" role="group" aria-label="...">
            <button id="b1" type="button" class="btn btn-default">1</button>
            <button type="button" class="btn btn-default">2</button>
            <button type="button" class="btn btn-default">3</button>
        </div>
    </div>
    <div class="btn-group" role="group" aria-label="...">
        <div class="btn-group" role="group" aria-label="...">
            <button type="button" class="btn btn-default">4</button>
            <button type="button" class="btn btn-default">5</button>
            <button type="button" class="btn btn-default">6</button>
            <button type="button" class="btn btn-default">7</button>
        </div>
    </div>

</div>


<div>
    <select class="selectpicker" multiple data-live-search="true">
        <option value="1">广东省</option>
        <option value="2">广西省</option>
        <option value="3">福建省</option>
        <option value="4">湖南省</option>
        <option value="5">山东省</option>
    </select>
</div>

<div>
    <form class="navbar-form navbar-left" action="/ScenicServlet?&methodName=findScenicInfo" method="post">
        <div>
            <div>
                时间
            </div>
            <select id="'dateChoose" name="dateChoose" class="form-control selectpicker"
                    data-width="80%" data-live-search="true"
                    multiple data-max-options="5" onchange="getDates(this)" >
                <option value="1">1月</option>
                <option value="2">2月</option>
                <option value="3">3月</option>
                <option value="4">4月</option>
                <option value="5">5月</option>
                <option value="6">6月</option>
                <option value="7">7月</option>
                <option value="8">8月</option>
                <option value="9">9月</option>
                <option value="10">10月</option>
                <option value="11">11月</option>
                <option value="12">12月</option>
            </select>
            <div>
                地点
            </div>
            <select id="'addChoose" name="addChoose" class="form-control selectpicker"
                    data-width="80%" data-live-search="true"
                    multiple data-max-options="5" onchange="getAdds(this)" >
                <optgroup label="广东省">
                    <option value="1">广州市</option>
                    <option value="2">深圳市</option>
                    <option value="3">珠海市</option>
                </optgroup>
                <optgroup label="广西">
                    <option value="1">南宁市</option>
                    <option value="2">柳州</option>
                    <option value="3">桂林市</option>
                </optgroup>
                <optgroup label="山东">
                    <option value="1">烟台</option>
                    <option value="2">青岛</option>
                    <option value="3">济南</option>
                </optgroup>
            </select>

            <div>
                主题
            </div>
            <select id="'themeChoose" name="themeChoose" class="form-control selectpicker"
                    data-width="80%" data-live-search="true"
                    multiple data-max-options="5"  onchange="getThemes(this)" >
                <%if(scenicThemeList != null){
                    for (int i = 0;i < scenicThemeList.size();i++){%>
                    <option value=<%=scenicThemeList.get(i)%>><%=scenicThemeList.get(i)%></option>
                <%}}else{%>
                <option value="空">空</option>
                <%}%>
<%--                <option value="草原">草原</option>--%>
<%--                <option value="星空">星空</option>--%>
<%--                <option value="赏花">赏花</option>--%>
<%--                <option value="雪景">雪景</option>--%>
<%--                <option value="海岛">海岛</option>--%>
<%--                <option value="极限运动">极限运动</option>--%>
<%--                <option value="滑雪">滑雪</option>--%>
<%--                <option value="温泉">温泉</option>--%>
<%--                <option value="避暑">避暑</option>--%>
<%--                <option value="自驾">自驾</option>--%>
<%--                <option value="游轮">游轮</option>--%>
<%--                <option value="父母">父母</option>--%>

            </select>
        </div>

        <div class="form-group">
            <input id="searchText" name="searchText" type="text" class="form-control" placeholder="">
        </div>
        <button id="btn-show" type="button" class="btn btn-default" onclick="showChoose()">显示</button>
        <button id="btn-search" type="submit" class="btn btn-default">搜索</button>
    </form>
</div>
<div>
    <%if(scenicThemeList != null){
        for (int i = 0;i < scenicThemeList.size();i++){%>
    <tr>
        <td><input type="checkbox"></td>
        <td><%=scenicThemeList.get(i)%></td>
        <br>
    </tr>
    <%}}else{%>
    <h1>没值</h1>
    <%}%>
</div>




</body>
</html>
