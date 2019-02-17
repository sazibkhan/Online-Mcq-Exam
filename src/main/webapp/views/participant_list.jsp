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

	<form action="<%=request.getContextPath()%>/participant/list"
		method="get">
		<center>
			<h1>participant List</h1>

			<table border="5" id="lists">
				<tr>
					<td>participant Id</td>
					<td>participant Roll</td>
					<td>Active Status</td>
					<td>Date Time</td>
				</tr>

				<c:forEach items="${participants}" var="participant">
					<tr>
						<td>${participant.participantId}</td>
						<td>${participant.participantRoll}</td>
						<td>${participant.activeStatus}</td>
						<td>${participant.dateTime}</td>
					</tr>
				</c:forEach>
			</table>

			<button type="submit">Database Table</button>


			<td>
				<button type="button" class="btn btn-outline-primary">
					<a href="participant.jsp">Insert Participant </a>
				</button>
			</td>
		</center>

	</form>







</body>
</html>