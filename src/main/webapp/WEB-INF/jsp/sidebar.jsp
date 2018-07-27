<%--
  Created by IntelliJ IDEA.
  User: Xiaoliu
  Date: 2018/7/17
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<el-aside width="200px" id="aside">
    <el-menu>
        <el-menu-item index="1">
            <a href="${pageContext.request.contextPath}/index">
                <i class="el-icon-view"></i><span slot="title">系统总览</span>
            </a>
        </el-menu-item>
        <el-submenu index="2">
            <template slot="title"><i class="el-icon-star-off"></i>车辆管理</template>
            <el-menu-item index="2-1">
                <a href="${pageContext.request.contextPath}/car_info">
                    <span>车辆信息管理</span>
                </a>
            </el-menu-item>
            <el-menu-item index="2-2">
                <a href="${pageContext.request.contextPath}/car_location">
                    <span>租出车辆管理</span>
                </a>
            </el-menu-item>
            <el-menu-item index="2-3">
                <a href="${pageContext.request.contextPath}/car_fee">
                    <span>租金设置</span>
                </a>
            </el-menu-item>
            <el-menu-item index="2-4">
                <a href="${pageContext.request.contextPath}/car_fee_discount">
                    <span>优惠方案</span>
                </a>
            </el-menu-item>
        </el-submenu>
        <el-submenu index="3">
            <template slot="title"><i class="el-icon-location"></i>车辆服务</template>
            <el-menu-item index="3-1">
                <a href="${pageContext.request.contextPath}/carservice_insurance">
                    <span>车辆保险管理</span>
                </a>
            </el-menu-item>
            <el-menu-item index="3-2">
                <a href="${pageContext.request.contextPath}/carservice_repair">
                    <span>车辆维修管理</span>
                </a>
            </el-menu-item>
            <el-menu-item index="3-3">
                <a href="${pageContext.request.contextPath}/carservice_maintenance">
                    <span>车辆保养管理</span>
                </a>
            </el-menu-item>
            <el-menu-item index="3-4">
                <a href="${pageContext.request.contextPath}/carservice_peccancy">
                    <span>车辆违章管理</span>
                </a>
            </el-menu-item>
        </el-submenu>
        <el-submenu index="4">
            <template slot="title"><i class="el-icon-service"></i>客户管理</template>
            <el-menu-item index="4-1">
                <a href="${pageContext.request.contextPath}/user_man">
                    <span>客户信息</span>
                </a>
            </el-menu-item>
            <el-menu-item index="4-2">
                <a href="${pageContext.request.contextPath}/user_notice">
                    <span>提醒服务</span>
                </a>
            </el-menu-item>
        </el-submenu>
        <el-menu-item index="5">
            <a href="${pageContext.request.contextPath}/order_man">
                <i class="el-icon-view"></i><span slot="title">订单管理</span>
            </a>
        </el-menu-item>
        <el-submenu index="6">
            <template slot="title"><i class="el-icon-setting"></i>运营管理</template>
            <el-menu-item index="6-1">
                <a href="${pageContext.request.contextPath}/statistics_month">
                    <span>经营月报表</span>
                </a>
            </el-menu-item>
            <el-menu-item index="6-2">
                <a href="${pageContext.request.contextPath}/statistics_repaire">
                    <span>维修费用统计</span>
                </a>
            </el-menu-item>
        </el-submenu>
    </el-menu>
</el-aside>
