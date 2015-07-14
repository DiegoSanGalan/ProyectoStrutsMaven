<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Buscar Empleado por ID usando Struts2</title>
</head>
<body>

<p><font size = 5><b> Introducir id de empleado a buscar :</b></font></p>

<s:form action="buscarempleado">

	<s:textfield name="id" label="Introducir ID a buscar" />
    <s:submit value="Enviar" />
</s:form>

   

</body>
</html>