<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dar de alta Veh�culo</title>
</head>
<body>

<s:form action="altavehiculo">

	<s:textfield name="coche" label="Introducir Marca" />
	<s:textfield name="coche" label="Introducir Matr�cula" />
    <s:submit value="Enviar" label = "Dar de alta" />
</s:form>

</body>
</html>