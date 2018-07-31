<%--
  Created by IntelliJ IDEA.
  User: Xiaoliu
  Date: 2018/7/17
  Time: 13:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<el-header style="height: 50px" id="header">
    <el-row>
        <el-col :span="5">
            <div style="min-height: 50px;border-radius: 5px;">
                <a href="#" class="navbar-link">租车管理系统</a>
            </div>
        </el-col>
        <el-col :span="2" :offset="15" v-if="user != null">
            <div style="min-height: 50px;border-radius: 5px; text-align: center; padding-top: 14px">
                <span style="font-weight: bold">${user.username}</span>
            </div>
        </el-col>
        <el-col :span="2">
            <div style="min-height: 50px;border-radius: 5px;">
                <a href="${pageContext.request.contextPath}/logout" class="navbar-link">注销</a>
            </div>
        </el-col>
    </el-row>
</el-header>
