<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>   
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mostrar Vehículo usando conversor de objetos a String</title>
</head>
<body>
<h2>Marca: <s:property value = "coche.marca"/></h2>
<h2>Matrícula: <s:property value = "coche.matricula"/></h2>
</body>
</html>