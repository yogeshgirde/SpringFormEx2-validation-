<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><center>
<head>
<style type="text/css">
.er {
	color: red;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Welcome to Employee Register page!!</h2>
	<form:form action="save" method="POST" modelAttribute="employee">
		<pre>

NAME:
<form:input path="empName" />
<form:errors path="empName" cssClass="er" />
Gender:
<form:radiobutton path="empGen" value="Male" /> Male <form:radiobutton
				path="empGen" value="Female" /> Female  
<form:errors path="empGen" cssClass="er" />
Dept:
<form:select path="empDept">
	<form:option value="">-select-</form:option>
	<form:option value="DEV">DEV</form:option>
	<form:option value="QA">QA</form:option>
	<form:option value="BA">BA</form:option>
</form:select>  
<form:errors path="empDept" cssClass="er" />

Address:
<form:textarea path="empAddr" />
<form:errors path="empAddr" cssClass="er" />

Projects:
<form:checkbox path="empPrjs" value="P1" />P1
<form:checkbox path="empPrjs" value="P2" />P2
<form:checkbox path="empPrjs" value="P3" />P3
<form:checkbox path="empPrjs" value="P4" />P4
<form:errors path="empPrjs" cssClass="er" />


 <input type="submit" value="Register" /> 
</pre>
	</form:form>

</body>
</center>
</html>







