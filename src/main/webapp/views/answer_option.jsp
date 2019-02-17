<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Answer Option</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/answer-Option/save" method="post">
	
	<center>
			<h1>Question Option</h1>
			<table>
				
				<div class="form-group">
					<label class="col-ms-2 control-label"> Question :</label>
					<div class="col-sm-4">
						<select name="questionId">
							<c:forEach items="${questionDTOs}" var="question">
							<option value="${question.questionId}">${question.questionName}</option>
						</c:forEach>
						</select>
					</div>
				</div>
				
				
				
				
				<tr>
					<td>Option Label :</td>
					<td><input type="text" name="optionLabel" />
				</tr>

				<tr>
					<td>Option Title :</td>
					<td><input type="text" name="optionTitle" />
				</tr>

				<tr>
					<td colspan="2"><center>
							<input type="submit" value="Save" />
						</center></td>
				</tr>
			</table>
		</center>
	
	
	
	</form>





</body>
</html>