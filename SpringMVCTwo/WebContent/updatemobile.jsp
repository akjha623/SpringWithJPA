<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="u" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<u:form action="mobileupdate" method="post" modelAttribute="uu">
Mobile Id:<u:input path="mobId"/><br>
Mobile Price:<u:input path="mobPrice"/><br>
<input type="submit" value="Update Mobile">

</u:form>
</body>
</html>