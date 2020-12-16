<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Hello
    <c:set var="today" value="28-03-2018"/>
    <c:out value="${today}" />
    <fmt:parseDate value="${today}" var="parsedDate" pattern="dd-MM-yyyy"/>
    <p>Parsed Date: <c:out value="${parsedDate}" /></p>
</body>
</html>
