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
    <style>
        .row {
            margin: 15px;
        }
    </style>
    <script>
        let ws;
        let cardinfos;
        if (window.WebSocket) {
            let host = "ws://127.0.0.1:8888";
            ws = new WebSocket(host);
            ws.onopen = sOpen;
            ws.onerror = sError;
            ws.onmessage= sMessage;
            ws.onclose= sClose;
        }else {
            alert("你的浏览器不支持WebSocket,请使用Chrome或FireFox!")
        }

        function sOpen(){
            console.log('connect success!');
        }
        function sError(e){
            console.log("error " + e);
        }
        function sMessage(msg){
            console.log('server says:' + msg.data);
            let json = JSON.parse(msg.data);
            let act = json['act'];
            let data = json['data'];
            if (act === 'init') {
                if (data){
                    console.log("初始化成功!");
                    auth();
                }else {
                    alert("请检查驱动及设备是否安装好!并刷新页面");
                }
            }else if (act === 'auth') {
                if (data) {
                    read();
                }else {
                    alert("请放置身份证, 若已放置请拿起重放!");
                }
            }else if (act === 'read') {
                if (data === false) {
                    alert("读取身份证失败!");
                }else {
                    cardinfos = decodeURIComponent(data);
                    fillIDCardInfos(cardinfos);
                }
            }
            console.log(json);
        }
        function sClose(e){
            console.log("connect closed:" + e.code);
        }
        function init() {
            ws.send("init")
        }
        function auth(){
            ws.send("auth")
        }
        function read() {
            ws.send("read")
        }
        function Close(){
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
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container-fluid">
    <div class="row">
        <jsp:include page="sidebar.jsp"/>
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4" id="mainWindow">
            <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
                <h1 class="h2">订单管理</h1>
                <div class="btn-toolbar mb-2 mb-md-0">
                    <div class="btn-group mr-2">
                        <button class="btn btn-sm btn-outline-secondary">打印订单</button>
                        <button class="btn btn-sm btn-outline-secondary">打印身份证</button>
                    </div>
                </div>
            </div>
            <div class="row">
                <form id="order-create">
                    <div class="form-row">
                        <div class="form-group col-md-4">
                            <label for="user-name-label">姓名</label>
                            <input type="text" name="name" id="user-name-label" class="form-control"
                                   placeholder="姓名">
                        </div>
                        <div class="form-group col-md-4">
                            <label for="sex">性别</label>
                            <div class="form-control" id="sex">
                                <div class="custom-control custom-radio custom-control-inline">
                                    <input type="radio" id="sex1" name="sex" class="custom-control-input">
                                    <label class="custom-control-label" for="sex1">男</label>
                                </div>
                                <div class="custom-control custom-radio custom-control-inline">
                                    <input type="radio" id="sex2" name="sex" class="custom-control-input">
                                    <label class="custom-control-label" for="sex2">女</label>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group col-md-4">
                            <label for="IDCardNum">身份证号码</label>
                            <input type="text" name="IDCardNum" id="IDCardNum" class="form-control"
                                   placeholder="身份证号码">
                        </div>
                        <div class="form-group col-md-4">
                            <label for="driveCardNum">驾驶证号码</label>
                            <input type="text" name="IDCardNum" id="driveCardNum" class="form-control"
                                   placeholder="驾驶证号码">
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group col-md-4">
                            <label for="carModel">车辆</label>
                            <select name="carModel" id="carModel" class="form-control">
                                <option value="" selected>请选择车辆</option>
                                <option value="1001">奥迪A6 赣D22222</option>
                                <option value="1002">奥迪A8 赣D22223</option>
                            </select>
                        </div>
                        <div class="form-group col-md-4">
                            <label for="feePlan">租金方案</label>
                            <select name="feePlan" id="feePlan" class="form-control">
                                <option value="" selected>请选择方案</option>
                                <option value="1">方案1</option>
                                <option value="2">方案2</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-row" style="width: 1000px">
                        <fieldset class="form-group">
                            <legend>身份证</legend>
                            <div class="form-group">
                                <label for="id-name">姓名</label>
                                <input type="text" name="IDCard.name" id="id-name" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="id-sex">性别</label>
                                <input type="text" name="IDCard.sex" id="id-sex" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="id-folk">民族</label>
                                <input type="text" name="IDCard.folk" id="id-folk" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="id-address">民族</label>
                                <input type="text" name="IDCard.address" id="id-address" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="id-birthday">生日</label>
                                <input type="text" name="IDCard.birthday" id="id-birthday" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="id-idnum">身份证号码</label>
                                <input type="text" name="IDCard.IDnum" id="id-idnum" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="id-agency">签发机关</label>
                                <input type="text" name="IDCard.agency" id="id-agency" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="id-expireStart">有效日期</label>
                                <input type="text" name="IDCard.expireStart" id="id-expireStart" class="form-control" placeholder="起始日期">
                                -
                                <input type="text" name="IDCard.expireEnd" id="id-expireEnd" class="form-control" placeholder="终止日期">
                            </div>
                            <div class="custom-file">
                                <input type="file" class="custom-file-input" id="IDCard1">
                                <label class="custom-file-label" for="IDCard1">身份证正面</label>
                            </div>
                            <div class="custom-file">
                                <input type="file" class="custom-file-input" id="IDCard2">
                                <label class="custom-file-label" for="IDCard2">身份证反面</label>
                            </div>
                            <button type="button" class="btn btn-primary" onclick="readCard()">读取身份证</button>
                        </fieldset>
                    </div>
                    <div class="form-row" style="width: 1000px">
                        <fieldset class="form-group">
                            <legend>驾驶证</legend>
                            <div class="custom-file">
                                <input type="file" class="custom-file-input" id="driveCard">
                                <label class="custom-file-label" for="driveCard">驾驶证</label>
                            </div>
                        </fieldset>
                    </div>
                    <button type="submit" class="btn btn-primary">创建</button>
                </form>
            </div>
        </main>
    </div>
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>
