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

	<form action="<%=request.getContextPath()%>/answerScript/list"
		method="get">



		<center>
			<h1>Answer Script List</h1>
			<table border="5" id="lists">
				<tr>
					<td>Id</td>
					<td>Given Answer</td>
					<td>Set No</td>
					<td>Question ID</td>
					<td>Participant ID</td>
					<td>Active Status</td>
					<td>Date Time</td>
				</tr>

				<c:forEach items="${lists}" var="list">
					<tr>
						<td>${list.answerScriptId}</td>
						<td>${list.givenAnswer}</td>
						<td>${list.setNo}</td>
						<td>${list.questionEntity.questionName}</td>
						<td>${list.participantEntity.participantName}</td>
						<td>${list.activeStatus}</td>
						<td>${list.dateTime}</td>
					</tr>
				</c:forEach>
			</table>

			<button type="submit">Database Table</button>

		</center>

	</form>
	
	<a href="<%=request.getContextPath() %>/answerscript/view/list" >	Answer Script	</a>
	
</body>
</html>