<%--
  Created by IntelliJ IDEA.
  User: nkxd
  Date: 2018/7/27
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/car/api_v1/add_car" method="post" enctype="multipart/form-data">
        汽车租金:<input type="text" name="rentFee"><br/>
        汽车颜色:<input type="text" name="color"><br/>
        汽车品牌:<input type="text" name="brand"><br/>
        车牌号:<input type="text" name="plateNumber"><br/>
        选择图片:<input type="file" name="files"><br/>
        选择图片:<input type="file" name="files">
        <input type="submit" value="提交">
    </form>
</body>
</html>
