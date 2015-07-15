<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mostrar empleado Buscado por ID Struts 2</title>
</head>
<body>

<h2>Id empleado: <s:property value = "empleadoDTO.EMPLOYEE_ID" /></h2>
<h2>Nombre: <s:property value = "empleadoDTO.FIRST_NAME" /></h2>	<!-- llama al getPersona del objeto persona creado en HelloWorldAction 
		y getNombre de la clase Persona-->	
<h2>Apellido: <s:property value = "empleadoDTO.LAST_NAME" /></h2>	<!-- llama al getPersona del objeto persona creado en HelloWorldAction 
		y getNombre de la clase Persona-->										
<h2>Sueldo: <s:property value = "empleadoDTO.SALARY" /> Euros</h2>	
	


</body>
</html>