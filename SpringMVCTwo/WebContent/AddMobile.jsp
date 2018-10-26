<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="fo" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>

<table>

<fo:form action="adddata" method="post" modelAttribute="my">    <!--or can write commandName in pace of modelAttribute-->

<tr>
<td>Mobile ID</td>
<td><fo:input path="mobId"></fo:input>
<td><fo:errors path="mobId"></fo:errors></td>
</tr>

<tr>
<td>Mobile Name</td>
<td><fo:input path="mobName"></fo:input>
<td><fo:errors path="mobName"></fo:errors></td>
</tr>

<tr>
<td>Mobile Price</td>
<td><fo:input path="mobPrice"></fo:input>
</tr>

<tr>
<td>Mobile Category</td>
<td><fo:select path="mobCategory" items="${catg}"></fo:select>
</tr>

<tr>
<td>Online</td>
<td><fo:radiobutton path="mobOnline" value="YES"/>Yes</td>
<td><fo:radiobutton path="mobOnline" value="NO"/>No</td>
</tr>

<tr>
<td><input type="submit" value="Add Mobile"></td>
</tr>

</fo:form>

</table>
</body>


</html>