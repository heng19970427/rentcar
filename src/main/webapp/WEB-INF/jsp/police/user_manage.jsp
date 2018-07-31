<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">
<head>
    <title>租车管理系统</title>
    <jsp:include page="../js_css.jsp"/>
    <style>
        body, html {
            font-family: "微软雅黑", sans-serif;
        }
    </style>
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container-fluid">
    <div class="row">
        <jsp:include page="sidebar.jsp"/>
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4" id="mainWindow">
            <div class="row">
                <form class=" col-md-8 form-inline">
                    <div class="input-group">
                        <span class="input-group-addon">商家搜索:</span>
                        <input type="text" class="form-control" placeholder="Username">
                    </div>
                </form>

                <div class="col-md-4">
                    <button type="button" class="btn btn-primary">添加用户</button>
                </div>
            </div>
            <hr/>
            <div>
                <table class="table table-hover" style="text-align: center">
                    <tr>
                        <td>ID</td>
                        <td>姓名</td>
                        <td>地址</td>
                        <td>当前出租车辆</td>
                        <td colspan="2">操作</td>
                    </tr>
                    <tr>
                        <td>0071</td>
                        <td>张先生</td>
                        <td>井冈山大道32号店铺</td>
                        <td>5</td>
                        <td><button type="button" class="btn btn-info">详情</button></td>
                        <td><button type="button" class="btn btn-danger">删除</button></td>
                    </tr>
                    <tr>
                        <td>0071</td>
                        <td>张先生</td>
                        <td>井冈山大道32号店铺</td>
                        <td>5</td>
                        <td><button type="button" class="btn btn-info">详情</button></td>
                        <td><button type="button" class="btn btn-danger">删除</button></td>
                    </tr>
                    <tr>
                        <td>0071</td>
                        <td>张先生</td>
                        <td>井冈山大道32号店铺</td>
                        <td>5</td>
                        <td><button type="button" class="btn btn-info">详情</button></td>
                        <td><button type="button" class="btn btn-danger">删除</button></td>
                    </tr>
                    <tr>
                        <td>0071</td>
                        <td>张先生</td>
                        <td>井冈山大道32号店铺</td>
                        <td>5</td>
                        <td><button type="button" class="btn btn-info">详情</button></td>
                        <td><button type="button" class="btn btn-danger">删除</button></td>
                    </tr>
                </table>
            </div>
        </main>
    </div>
</div>
</body>
</html>
