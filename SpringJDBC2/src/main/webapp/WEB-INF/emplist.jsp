<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList, JDBCTemplate.Employee, JDBCTemplate.EmpDAOImpl"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h1>EMPLOYEES IN OFFFICE</h1>

<% ArrayList<Employee> a  = (ArrayList<Employee>) request.getAttribute("elist");%>
	<table>
		<tr>
			<th>Emp Id</th>
			<th>Name</th>
			<th>Department of emp</th>
			<th>Job</th>
			<th>Sal</th>
		</tr>
		<%for (Employee e : a) {%>
		<tr>
			<td><%=e.getEmpNo()%></td>
			<td><%=e.getDeptNo()%></td>
			<td><%=e.getEName()%></td>	
			<td><%=e.getJob()%></td>
			<td><%=e.getSalary()%></td>

		</tr>
		<%}%>
	</table>
</body>
</html>