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

        .car-name {
            font-size: 18px;
            color: #60606c;
            line-height: 26px;
        }

        .car-info {
            font-size: 13px;
            color: #999;
        }

        .car-price {
            color: #fabe00;
            font-size: 18px;
            line-height: 26px;
        }

        td {
            text-align: center;
            vertical-align: middle;
            height: 50px;
        }
    </style>
    <script>
        let ws;
        if (window.WebSocket) {
            let host = "ws://127.0.0.1:8888";
            ws = new WebSocket(host);
            ws.onopen = function sOpen() {
                console.log('connect success!')
            };
            ws.onerror = function sError(e) {
                console.log("error " + e)
            };
            ws.onclose = function sClose() {
                ws.close()
            }
        } else {
            alert("你的浏览器不支持WebSocket,请使用Chrome或FireFox!")
        }
    </script>
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
                                <el-step title="填写其他信息"></el-step>
                            </el-steps>
                        </div>
                        <div class="order-body" style="min-width: 600px">
                            <transition name="el-zoom-in-top">
                                <el-row :gutter="10" id="step-0" v-show="active === 0">
                                    <el-col :span="12" v-for="(car,index) in cars" :item="car" :key="car.carId" :index="index">
                                        <el-card :body-style="{ padding: '0px' }">
                                            <img v-if="car.images.length !== 0" :src="car.images[0].path"
                                                 :title="car.images[0].title" class="image">
                                            <div style="padding: 14px;">
                                                <span class="car-name">{{ car.type }}</span>
                                                <span style="float: right"><span
                                                        class="car-price">￥{{ car.rentFee }}</span>/日均</span>
                                                <div class="bottom clearfix">
                                                    <time class="car-info">{{ car.desc }}</time>
                                                    <span>
                                                        <el-button type="text" class="button">
                                                            查看详情
                                                        </el-button>
                                                        <el-button @click="orderCarID(index)" type="text" class="button">
                                                            选择该车
                                                        </el-button>
                                                    </span>
                                                </div>
                                            </div>
                                        </el-card>
                                    </el-col>
                                </el-row>
                            </transition>
                            <transition name="el-zoom-in-top">
                                <el-row id="step-1" v-show="active === 1">
                                    <div>
                                        <el-radio v-model="disCountPackageId" :label="0" border
                                                  style="width: 100%">
                                            不使用优惠套餐<span style="float: right">优惠金额 <span style="color: #f0ad4e">0</span>元</span>
                                        </el-radio>
                                    </div>
                                    <div v-for="p in disCountPackages">
                                        <el-radio v-model="disCountPackageId" :label="p.disCountPackageId"
                                                  border style="width: 100%">
                                            每天优惠租金 {{ p.disCountFee }} 元, 持续 {{ p.day }} 天 (最低租用 {{p.day}} 天)
                                            <span style="float: right">优惠金额 <span style="color: #f0ad4e">{{p.disCountFee * p.day}}</span>元</span>
                                        </el-radio>
                                    </div>
                                </el-row>
                            </transition>
                            <transition name="el-zoom-in-top">
                                <el-row id="step-2" v-show="active === 2">
                                    <el-form :model="orderForm" ref="orderForm" :rules="rules" label-position="left" label-width="80px" id="myOrder">
                                        <el-row>
                                            <el-col :span="12">
                                                <el-form-item label="租车日期" required>
                                                    <el-date-picker
                                                            v-model="rentLong"
                                                            type="daterange"
                                                            format="yyyy 年 MM 月 dd 日"
                                                            value-format="yyyy-MM-dd"
                                                            range-separator="-"
                                                            :picker-options="pickerOptions1"
                                                            start-placeholder="提车日期"
                                                            end-placeholder="还车日期">
                                                    </el-date-picker>
                                                </el-form-item>
                                            </el-col>
                                            <el-col :span="12">
                                                <el-form-item label="租车天数">
                                                    <el-input placeholder="输入租车天数" v-model="rentDay"></el-input>
                                                </el-form-item>
                                            </el-col>
                                        </el-row>
                                        <el-form-item label="优惠金额">
                                            <el-input placeholder="给该客户额外的优惠金额" v-model="orderForm.extraDerate" style="width: 200px"></el-input>
                                        </el-form-item>
                                        <el-form-item label="联系方式" prop="phone" required>
                                            <el-input name="phone" placeholder="请输入联系方式" v-model="orderForm.phone"></el-input>
                                        </el-form-item>
                                        <el-form-item label="基本信息">
                                            <el-col :span="6">
                                                <el-form-item prop="idCard.name">
                                                    <el-input v-model="orderForm.idCard.name" name="idCard.name" placeholder="姓名"></el-input>
                                                </el-form-item>
                                            </el-col>
                                            <el-col :span="3" :offset="1">
                                                <el-form-item prop="idCard.sex">
                                                    <el-input v-model="orderForm.idCard.sex" name="idCard.sex" placeholder="性别"></el-input>
                                                </el-form-item>
                                            </el-col>
                                            <el-col :span="3" :offset="1">
                                                <el-form-item prop="idCard.folk">
                                                    <el-input v-model="orderForm.idCard.folk" name="idCard.folk" placeholder="民族"></el-input>
                                                </el-form-item>
                                            </el-col>
                                            <el-col :span="8" :offset="1">
                                                <el-form-item prop="idCard.birthday">
                                                    <el-date-picker placeholder="生日"
                                                                    format="yyyy 年 MM 月 dd 日"
                                                                    value-format="yyyy-MM-dd"
                                                                    v-model="orderForm.idCard.birthday"
                                                                    name="idCard.birthday">
                                                    </el-date-picker>
                                                </el-form-item>
                                            </el-col>
                                        </el-form-item>
                                        <el-form-item label="身份证号" prop="idCard.idNumber">
                                            <el-input placeholder="身份证号" v-model="orderForm.idCard.idNumber" name="idCard.idNumber"></el-input>
                                        </el-form-item>
                                        <el-form-item label="家庭住址" prop="idCard.address">
                                            <el-input placeholder="家庭住址" v-model="orderForm.idCard.address" name="idCard.address"></el-input>
                                        </el-form-item>
                                        <el-form-item label="签发机关" prop="idCard.agency">
                                            <el-input placeholder="签发机关" v-model="orderForm.idCard.agency" name="idCard.agency"></el-input>
                                        </el-form-item>
                                        <el-form-item label="有效期限" required>
                                            <el-col :span="7">
                                                <el-form-item prop="idCard.expireStart">
                                                    <el-date-picker placeholder="起始日期"
                                                                    format="yyyy 年 MM 月 dd 日"
                                                                    value-format="yyyy-MM-dd"
                                                                    v-model="orderForm.idCard.expireStart"
                                                                    name="idCard.expireStart">
                                                    </el-date-picker>
                                                </el-form-item>
                                            </el-col>
                                            <el-col :span="1">至</el-col>
                                            <el-col :span="7">
                                                <el-form-item prop="idCard.expireEnd">
                                                    <el-input placeholder="失效日期" v-model="orderForm.idCard.expireEnd" name="idCard.expireEnd"></el-input>
                                                </el-form-item>
                                            </el-col>
                                        </el-form-item>
                                    </el-form>
                                </el-row>
                            </transition>
                        </div>
                        <div class="order-submit">
                            <el-button @click="pre" v-if="active > 0">上一步</el-button>
                            <el-button @click="next" v-if="active < 2">下一步</el-button>
                            <el-button @click="readCard" v-if="active === 2">读取身份证</el-button>
                            <el-button type="primary" @click="submit('orderForm')" v-if="active === 2">提交</el-button>
                            <span v-if="active === 2" style="position:fixed;bottom: 20px;right: 20px">预计租金 <span class="car-price">{{ fee }}</span> 元(只含车辆租金)</span>
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
