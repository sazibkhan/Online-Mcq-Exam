<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="<%=request.getContextPath()%>/question/paper"	method="post">
	
	<c:forEach items="${questions}" var="question">
	
	<div>
	<h3>${question.questionEntity.questionName}</h3>
	
	
	<tr>

	<input type="radio" name = "givenAnswer" value = ${question.optionLabel}/>

	</tr>
	
	
	
	
	</div>
	
	
	</c:forEach>


	</form>
</body>
</html>