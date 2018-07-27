<%--
  Created by IntelliJ IDEA.
  User: Xiaoliu
  Date: 2018/7/20
  Time: 9:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>已租出车辆管理 - 租车管理系统</title>
    <jsp:include page="js_css.jsp"/>
    <style>
        .row{
            margin: 15px;
        }
        #mapContainer{
            width: 100%;
            height: 100%;
            margin: 0;
        }
        #outer-box{
            height:80%;
            padding-right:260px;
        }
        #panel{
            position:absolute;
            top:80px;
            right:10px;
            width:260px;
            z-index:999;
        }
        #car-list{
            margin:0;
            padding:0;
        }
        #car-list li{
            background:#eee;
            margin:10px 0;
            list-style:none;
            padding:10px;
            cursor:pointer;
        }
        #car-list li p{
            margin:5px;
        }
        #car-list li.selected{
            background:#2aabd2;
            color:#fff;
        }
        .selected .amap-marker-label{
            background:#2aabd2;
            color:#fff;
            border-color:#ccc;
        }
        #panel h3{
            margin:10px 0;
        }
        #panel dd{
            margin:5px 5px;
        }
        #panel dl{
            margin:7px 0;
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
                        <h1 class="h2">已租出车辆管理</h1>
                        <div class="btn-toolbar mb-2 mb-md-0">
                            <div class="btn-group mr-2">
                                <button class="btn btn-sm btn-outline-secondary">切换显示模式</button>
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
                    <div>
                        <div id="outer-box">
                            <div id="mapContainer" tabindex="0"></div>
                            <div id="panel">
                                <div id="listTitle">
                                    <h4>租出车辆</h4>
                                </div>
                                <ul id="car-list"></ul>
                            </div>
                        </div>

                    </div>
                </el-main>
            </el-container>
        </el-row>
    </el-container>
</div>
    <jsp:include page="footer.jsp"/>
<script src="https://webapi.amap.com/maps?v=1.4.8&key=ec6c5c2047ad8f404100f030755d33ce"></script>
<%--UI 组件库--%>
<script src="//webapi.amap.com/ui/1.0/main.js?v=1.0.11"></script>
<script type="text/javascript" src="https://webapi.amap.com/demos/js/liteToolbar.js"></script>
<script src="${pageContext.request.contextPath}/static/js/map.js"></script>
</body>
</html>