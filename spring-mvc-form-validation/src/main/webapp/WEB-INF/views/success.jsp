<%--
  Created by IntelliJ IDEA.
  User: Lin ZHANG
  Date: 2017/11/3
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Student Enrollment Detail Confirmation</title>
    <link href="<c:url value='/static/css/custom.css' />" rel="stylesheet"></link>
</head>
<body>
<div class="success">
    Confirmation message : ${success}
    <br>
    We have also sent you a confirmation mail to your email address : ${student.email}.
</div>
</body>
</html>
