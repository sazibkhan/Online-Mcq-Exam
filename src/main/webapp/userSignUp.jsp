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

	<form action="<%=request.getContextPath()%>/signUp/save" method="post">



		<center>
			<h1>Question</h1>
			<table>
				<tr>
					<td>User Name :</td>
					<td><input type="text" name="userName" />
				</tr>


				<tr>
					<td>Email :</td>
					<td><input type="text" name="email" />
				</tr>

				<tr>
					<td>Password :</td>
					<td><input type="text" name="password" />
				</tr>


				<tr>
					<td>National Id :</td>
					<td><input type="text" name="nationalId" />
				</tr>


				<tr>
					<td>Phone :</td>
					<td><input type="text" name="Phone" />
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