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

	<form action="<%=request.getContextPath()%>/question/paper"
		method="post">

		<c:forEach items="${questions1}" var="question">


			<h3>${question.questionDTO.questionName}</h3>
			<table>
			
					<c:forEach items="${question.questionDTO.optionEntites}"
						var="option">

						<tr>

							<td>${option.optionLabel}</td>
							<td><input type="radio" name="givenAnswer"
								value=${option.optionTitle } /></td>

						</tr>

					</c:forEach>			
			</table>
		</c:forEach>

		<div style="display: none">
			<c:forEach items="${questions}" var="questions2">


				<h3>${question.questionDTO.questionName}</h3>
				<table>
					<c:forEach items="${question.questionDTO.optionEntites}"
						var="option">

						<tr>
							<td>${option.optionLabel}</td>
							<td><input type="radio" name="givenAnswer">${option.optionTitle}</input></td>
						</tr>

					</c:forEach>
				</table>
			</c:forEach>

		</div>

	</form>
</body>
</html>