<%--
  Created by IntelliJ IDEA.
  User: nkxd
  Date: 2018/7/23
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <style type="text/css">
        body, html {width: 100%;height: 100%;margin:0;font-family:"微软雅黑";}
        #allmap{width:100%;height:800px;}
        p{margin-left:5px; font-size:14px;}
    </style>
    <script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=7KCkGZ5Tbzq5rg0ChZKG4HrVQvAhPU1C"></script>
    <title>租车管理系统</title>
    <jsp:include page="../js_css.jsp"/>
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container-fluid">
    <div class="row">
        <jsp:include page="sidebar.jsp"/>
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4" id="mainWindow">
            <div class="row">
                <form class=" col-md-8 form-inline">
                    <label for="queryDiv">吉州区全区租赁车辆订单</label>
                    <div class="input-group" id="queryDiv">
                        <span class="input-group-addon">订单查询:</span>
                        <input type="text" class="form-control" placeholder="CarNumber">
                    </div>
                </form>

                <div class="col-md-4">
                    <a type="button" href="${pageContext.request.contextPath}/police/car_manage" class="btn btn-primary">地图视角</a>
                </div>
            </div>
            <hr/>
            <div>
                <table class="table table-hover" style="text-align: center">
                    <tr>
                        <td>订单编号</td>
                        <td>租车人</td>
                        <td>车辆颜色</td>
                        <td>车辆型号</td>
                        <td>车牌号码</td>
                        <td>订单状态</td>
                        <td>GPS位置查看</td>
                    </tr>
                    <tr>
                        <td>4578001</td>
                        <td>令狐冲</td>
                        <td>白色</td>
                        <td>奥迪A80923</td>
                        <td>京N88963</td>
                        <td>出租中</td>
                        <td><button type="button" onclick="javascrtpt:window.location.href='http://localhost:63342/demo/car/carManager.html'" class="btn btn-info">查看</button></td>
                    </tr>
                    <tr>
                        <td>4578001</td>
                        <td>令狐冲</td>
                        <td>白色</td>
                        <td>奥迪A80923</td>
                        <td>京N88963</td>
                        <td>已完成</td>
                        <td><button type="button" onclick="javascrtpt:window.location.href='http://localhost:63342/demo/car/carManager.html'" class="btn btn-info">查看</button></td>
                    </tr>
                    <tr>
                        <td>4578001</td>
                        <td>令狐冲</td>
                        <td>白色</td>
                        <td>奥迪A80923</td>
                        <td>京N88963</td>
                        <td>出租中</td>
                        <td><button type="button" onclick="javascrtpt:window.location.href='http://localhost:63342/demo/car/carManager.html'" class="btn btn-info">查看</button></td>
                    </tr>
                    <tr>
                        <td>4578001</td>
                        <td>令狐冲</td>
                        <td>白色</td>
                        <td>奥迪A80923</td>
                        <td>京N88963</td>
                        <td>已完成</td>
                        <td><button type="button" onclick="javascrtpt:window.location.href='http://localhost:63342/demo/car/carManager.html'" class="btn btn-info">查看</button></td>
                    </tr>
                    <tr>
                        <td>4578001</td>
                        <td>令狐冲</td>
                        <td>白色</td>
                        <td>奥迪A80923</td>
                        <td>京N88963</td>
                        <td>出租中</td>
                        <td><button type="button" onclick="javascrtpt:window.location.href='http://localhost:63342/demo/car/carManager.html'" class="btn btn-info">查看</button></td>
                    </tr>
                </table>
            </div>
        </main>
    </div>
</div>

</body>
</html>

