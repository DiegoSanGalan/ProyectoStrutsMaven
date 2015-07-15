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


<s:form theme="xhtml">Empleado buscado. <s:property value = "empleadoDTO.EMPLOYEE_ID"/>

<table border = "1" width="75%" >
<tr>

	<td>
		<h2 align="center">Id Empleado: <s:property value = "empleadoDTO.EMPLOYEE_ID" /></h2>
	</td>
	

	<td>
		<h2 align="center">Nombre: <s:property value = "empleadoDTO.FIRST_NAME" /></h2>
	</td>
	<td>
		<h2 align="center">Apellido: <s:property value = "empleadoDTO.LAST_NAME" /></h2>
	</td>
	
	<td>
		<h2 align="center">Sueldo: <s:property value = "empleadoDTO.SALARY" /> $</h2>
	</td>
	</tr>
</table>
	

	<!-- llama al getPersona del objeto persona creado en HelloWorldAction 
		y getNombre de la clase Persona-->	
	<!-- llama al getPersona del objeto persona creado en HelloWorldAction 
		y getNombre de la clase Persona-->										
	
	
</s:form>

</body>
</html>