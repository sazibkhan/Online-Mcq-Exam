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


	<form action="<%=request.getContextPath()%>/mcqtest/home" method="post">

		<center>
			<h1>Home Page</h1>
			<table>

				<td>
					<button type="button" class="btn btn-outline-primary">
						<a href="userLogin.jsp">Login </a>
					</button>
				</td>

				<tr>
					<!-- <td>
						<button type="button" class="btn btn-outline-primary">
							<a href="views/question.jsp">Question </a>
						</button>
					</td> -->
					<td>
						<button type="button" class="btn btn-outline-primary">
							<a href="views/question_list.jsp">Question List </a>
						</button>
					</td>
				</tr>
				
		
				<tr>
					<!-- <td>
						<button type="button" class="btn btn-outline-primary">
							<a href="views/participant.jsp">Participant</a>
						</button>
					</td> -->
					<td>
						<button type="button" class="btn btn-outline-primary">
							<a href="views/participant_list.jsp">Participant List</a>
						</button>
					</td>

				</tr>
			


				<tr>
					<%--  <td>
						<button type="button" class="btn btn-outline-primary">
							<a href="<%=request.getContextPath()%>/views/answerScript.jsp">Answer Script</a>
						</button>
					</td>  --%>
					<td>
						<button type="button" class="btn btn-outline-primary">
							<a href="views/answerScript_list.jsp">Answer Script List</a>
						</button>
					</td>

				</tr>
				
					<td>
						<button type="button" class="btn btn-outline-primary">
							<a href="<%=request.getContextPath()%>/answer-Option/save">Answer Option t</a>
						</button>
					</td>
				
				<td>
						<button type="button" class="btn btn-outline-primary">
							<a href="<%=request.getContextPath()%>/answerScript/save">Answer Script</a>
						</button>
					</td>
					
				<td>
						<button type="button" class="btn btn-outline-primary">
							<a href="<%=request.getContextPath()%>/question/paper">Show Question Paper</a>
						</button>
				</td>	


			</table>
		</center>

	</form>








</body>
</html>