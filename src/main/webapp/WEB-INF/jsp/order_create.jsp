<%--
  Created by IntelliJ IDEA.
  User: Xiaoliu
  Date: 2018/7/21
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单管理 - 租车管理系统</title>
    <jsp:include page="js_css.jsp"/>
    <script>
        let ws;
        let cardinfos;
        if (window.WebSocket) {
            let host = "ws://127.0.0.1:8888";
            ws = new WebSocket(host);
            ws.onopen = sOpen;
            ws.onerror = sError;
            ws.onmessage = sMessage;
            ws.onclose = sClose;
        } else {
            alert("你的浏览器不支持WebSocket,请使用Chrome或FireFox!")
        }

        function sOpen() {
            console.log('connect success!');
        }

        function sError(e) {
            console.log("error " + e);
        }

        function sMessage(msg) {
            console.log('server says:' + msg.data);
            let json = JSON.parse(msg.data);
            let act = json['act'];
            let data = json['data'];
            if (act === 'init') {
                if (data) {
                    console.log("初始化成功!");
                    auth();
                } else {
                    alert("请检查驱动及设备是否安装好!并刷新页面");
                }
            } else if (act === 'auth') {
                if (data) {
                    read();
                } else {
                    alert("请放置身份证, 若已放置请拿起重放!");
                }
            } else if (act === 'read') {
                if (data === false) {
                    alert("读取身份证失败!");
                } else {
                    cardinfos = decodeURIComponent(data);
                    fillIDCardInfos(cardinfos);
                }
            }
            console.log(json);
        }

        function sClose(e) {
            console.log("connect closed:" + e.code);
        }

        function init() {
            ws.send("init")
        }

        function auth() {
            ws.send("auth")
        }

        function read() {
            ws.send("read")
        }

        function Close() {
            ws.close();
        }

        function readCard() {
            init();
        }

        function fillIDCardInfos(data) {
            let infos = data.split(',');
            let name = infos[0];
            let sex = infos[1];
            let folk = infos[2];
            let birthday = infos[3];
            let IDnum = infos[4];
            let address = infos[5];
            let agency = infos[6];
            let expireStart = infos[7];
            let expireEnd = infos[8];
            $('#id-name').val(name);
            $('#id-sex').val(sex);
            $('#id-folk').val(folk);
            $('#id-birthday').val(birthday);
            $('#id-idnum').val(IDnum);
            $('#id-address').val(address);
            $('#id-agency').val(agency);
            $('#id-expireStart').val(expireStart);
            $('#id-expireEnd').val(expireEnd);
        }
    </script>
    <style>
        .order-container {
            width: 100%;
        }

        .order-step-container {
            min-height: 70px;
        }

        .fixed {
            position: relative;
            top: 0;
            left: 0;
            z-index: 11;
        }

        .order-submit {
            position: fixed;
            bottom: 20px;
            width: 100%;
            z-index: 11;
        }

        .step-list {
            display: block;
            list-style: disc;
            -webkit-margin-before: 1em;
            -webkit-margin-after: 1em;
            -webkit-margin-start: 0px;
            -webkit-margin-end: 0px;
            -webkit-padding-start: 40px;
        }

        .order-header-step li {
            display: inline-block;
            font-size: 16px;
            font-weight: 700;
            line-height: 36px;
            border-bottom: 2px solid #fff;
            margin-right: 30px;
            padding-left: 20px;
            padding-right: 20px;
        }

        .order-header-step li.curr {
            border-bottom: 2px solid #00a4ff;
        }

        li {
            list-style: none;
            display: list-item;
            text-align: -webkit-match-parent;
        }

        body {
            min-width: 770px;
        }

        .image {
            width: auto;
            display: block;
            height: 200px;
            overflow: hidden;
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
                    <div class="order-container" id="order-step">
                        <div class="order-step-container fixed">
                            <el-steps :active="active" finish-status="success">
                                <el-step title="选择车辆"></el-step>
                                <el-step title="选择优惠套餐"></el-step>
                                <el-step title="填写基本信息"></el-step>
                                <el-step title="核对信息"></el-step>
                            </el-steps>
                        </div>
                        <div class="order-body">
                            <el-row :gutter="10" id="step-0" v-show="active === 0">
                                <el-col :span="12" v-for="(car,index) in cars" :item="car" :key="car.carId" :index="index">
                                    <el-card>
                                        <img :src="car.images[0].path" class="image">
                                        <div>
                                            <span>{{ car.type }} </span>
                                            <span>{{ car.desc }}</span>
                                            <span>{{ car.fuelType }}</span>
                                            <div class="bottom clearfix">
                                                <el-button>查看详情</el-button>
                                                <el-button @click="orderCarID(index)" :data-carid="car.carId">选择该车
                                                </el-button>
                                            </div>
                                        </div>
                                    </el-card>
                                </el-col>
                            </el-row>
                            <el-row id="step-1" v-show="active === 1">
                                选择优惠套餐
                            </el-row>
                            <el-form>
                                <el-row id="step-2" v-show="active === 2">
                                    填写基本信息
                                </el-row>
                                <el-row id="step-3" v-show="active === 3">
                                    核对信息
                                </el-row>
                            </el-form>
                        </div>
                        <div class="order-submit">
                            <el-button @click="pre" v-if="active > 0">上一步</el-button>
                            <el-button @click="next" v-if="active < 3">下一步</el-button>
                            <el-button @click="submit" v-if="active == 3">提交</el-button>
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
