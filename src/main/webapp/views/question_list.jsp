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

	<form action="<%=request.getContextPath()%>/question/list" method="get">
		<center>
			<h1>Question List</h1>



			<table border="5" id="lists">
				<tr>
					<td>Question Id</td>
					<td>Question Name</td>
					<td>Question Set No</td>
					<td>Answer</td>
					
				</tr>

				<c:forEach items="${questions}" var="question">
					<tr>
						<td>${question.questionId}</td>
						<td>${question.questionName}</td>
						<td>${question.questionSetNo}</td>	
						<td>${question.questionAnswer}</td>	
																					
					</tr>
				</c:forEach>
			</table>

			<button type="submit">Database Table</button>

			<td>
				<button type="button" class="btn btn-outline-primary">
					<a href="question.jsp">Insert Question </a>
				</button>
			</td>
		</center>







	</form>







</body>
</html>