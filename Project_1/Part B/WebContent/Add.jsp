<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Addition Form</title>
</head>
<body>
<h1>Book Details </h1>
<form action="AddServlet" method="post">
			<table style="with: 50%">
				<tr>
					<td>Book Id*</td>
					<td><input required type="text" name="id" /></td>
				</tr>
				<tr>
					<td>Title of the Book*</td>
					<td><input required type="text" name="name" /></td>
				</tr>
				<tr>
					<td>Category of the Book</td>
					<td><input type="text" name="category" /></td>
				</tr>
					<tr>
					<td>Author of the Book</td>
					<td><input type="text" name="author" /></td>
				</tr>

			</table>
			<input type="submit" value="Submit" />
</form>
<br/>
* required field
</body>
</html>
