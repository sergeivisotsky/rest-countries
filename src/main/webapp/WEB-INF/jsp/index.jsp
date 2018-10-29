<%--
  ~ Copyright (c) 2018 Sergei Visotsky
  --%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Countries taken from REST API</title>
</head>
<body>
<h1>Motherland: </h1>
<div>Name: ${countryName}</div>
<div>Region: ${region}</div>
<div>Subregion: ${subregion}</div>
<div>Alpha 2 code: ${alphaTwoCode}</div>
<div>Alpha 3 code: ${alphaThreeCode}</div>

<h1>Other countries: </h1>
<c:forEach items="${countries}" var="country">
    <div>Name: ${country.countryName}</div>
    <div>Region: ${country.region}</div>
    <div>Subregion: ${country.subregion}</div>
    <div>Alpha 2 code: ${country.alphaTwoCode}</div>
    <div>Alpha 3 code: ${country.alphaThreeCode}</div>
    <br>
</c:forEach>
</body>
</html>
