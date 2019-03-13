<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12.03.2019
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Download</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/downloadPDF" method="get">
    <input type="hidden" name="typeContent" value="application/pdf">
    <button>Downland file PDF</button>
</form>
<form action="${pageContext.request.contextPath}/downloadIMG" method="get">
    <input type="hidden" name="typeContent" value="image/jpg">
    <button>Downland file JPG</button>
</form>
</body>
</html>
