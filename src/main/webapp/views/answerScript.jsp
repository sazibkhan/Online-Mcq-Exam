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
	<form action="<%=request.getContextPath()%>/answerScript/save"
		method="post">

		<center>
			<h1>Answer Script</h1>
			<table>
			
			<tr>
					<td>Set No :</td>
					<td>
					<select name="setNo">
						<option label="A" value="A"/>	
						<option label="B" value="B"/>	
						<option label="C" value="C"/>
						<option label="D" value="D"/>					
						</select>
					
					<!-- <input type="text" name="setNo" /> --></td>
				</tr>
			
			
			<tr>
					<td><label class="col-ms-2 control-label"> Question :</label></td>
					<td>
						<select name="questionId">
							<c:forEach items="${questions}" var="question">
								<option value="${question.questionId}">${question.questionName}</option>
							</c:forEach>
						</select>
				</td>	
			</tr>	
<%-- 
				<div class="form-group">
					<label class="col-ms-2 control-label"> Participant :</label>
					<div class="col-sm-4">
						<select name="participantId">
							<c:forEach items="${participantDTOList}" var="participant">
								<option value="${participant.participantId}">${participant.participantName}</option>
							</c:forEach>
						</select>
					</div>
				</div> --%>
				
								

				<tr>
					<td>Answer :</td>
					<td>
					<select name="givenAnswer">
						<option label="A" value="A"/>	
						<option label="B" value="B"/>	
						<option label="C" value="C"/>
						<option label="D" value="D"/>					
					</select>
					
					<!-- <input type="text" name="givenAnswer" /> --></td>
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