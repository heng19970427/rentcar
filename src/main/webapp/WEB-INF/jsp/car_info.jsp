<%--
  Created by IntelliJ IDEA.
  User: Xiaoliu
  Date: 2018/7/17
  Time: 13:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>车辆信息管理 - 租车管理系统</title>
    <jsp:include page="js_css.jsp"/>
    <style>
        .row{
            margin: 15px;
        }
    </style>
</head>
<body>
<div id="app">
    <el-container>
        <jsp:include page="header.jsp"/>
        <el-row>
            <el-container>
                <jsp:include page="sidebar.jsp"/>
                <el-main id="mainWindow">
                    <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
                        <h1 class="h2">车辆信息管理</h1>
                        <div class="btn-toolbar mb-2 mb-md-0">
                            <div class="btn-group mr-2">
                                <button class="btn btn-sm btn-outline-secondary">增加车辆</button>
                            </div>
                            <div class="dropdown">
                                <button class="btn btn-outline-secondary dropdown-toggle" type="button" id="carMenu" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <span data-feather="bookmark"></span>
                                    车型选择
                                </button>
                                <div class="dropdown-menu" aria-labelledby="carMenu">
                                    <a href="#" class="dropdown-item">全部</a>
                                    <a href="#" class="dropdown-item">SUV</a>
                                    <a href="#" class="dropdown-item">超跑</a>
                                    <a href="#" class="dropdown-item">卡车</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-4">
                            <div class="card">
                                <img class="card-img-top" src="${pageContext.request.contextPath}/static/img/aventador.jpg" alt="兰博基尼">
                                <div class="card-body">
                                    <h5 class="card-title">Aventador S</h5>
                                    <p class="card-text">自动/7 | 乘坐两人 | 油耗464g/km</p>
                                    <a href="#" class="card-link">详细信息设置</a>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="card">
                                <img class="card-img-top" src="${pageContext.request.contextPath}/static/img/aventador.jpg" alt="兰博基尼">
                                <div class="card-body">
                                    <h5 class="card-title">Aventador S</h5>
                                    <p class="card-text">自动/7 | 乘坐两人 | 油耗464g/km</p>
                                    <a href="#" class="card-link">详细信息设置</a>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="card">
                                <img class="card-img-top" src="${pageContext.request.contextPath}/static/img/aventador.jpg" alt="兰博基尼">
                                <div class="card-body">
                                    <h5 class="card-title">Aventador S</h5>
                                    <p class="card-text">自动/7 | 乘坐两人 | 油耗464g/km</p>
                                    <a href="#" class="card-link">详细信息设置</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-4">
                            <div class="card">
                                <img class="card-img-top" src="${pageContext.request.contextPath}/static/img/aventador.jpg" alt="兰博基尼">
                                <div class="card-body">
                                    <h5 class="card-title">Aventador S</h5>
                                    <p class="card-text">自动/7 | 乘坐两人 | 油耗464g/km</p>
                                    <a href="#" class="card-link">详细信息设置</a>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="card">
                                <img class="card-img-top" src="${pageContext.request.contextPath}/static/img/aventador.jpg" alt="兰博基尼">
                                <div class="card-body">
                                    <h5 class="card-title">Aventador S</h5>
                                    <p class="card-text">自动/7 | 乘坐两人 | 油耗464g/km</p>
                                    <a href="#" class="card-link">详细信息设置</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </el-main>
            </el-container>
        </el-row>
    </el-container>
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>

