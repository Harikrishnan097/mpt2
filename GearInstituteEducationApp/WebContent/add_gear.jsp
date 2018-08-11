<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<f:form action="addgear" method="post" modelAttribute="gear">
Id:<f:input path="query_id"/><br>

technology:<f:input path="technology"/><br>

queryraisedby:<f:input path="query_raised_by"/><br>
query:<f:input path="query"/><br>
solutions:<f:input path="solutions"/><br>
solutiongiven:<f:input path="solution_given_by"/>
<input type="submit" value="Add"/>
</f:form>

</body>
</html>