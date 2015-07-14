<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>  <!-- etiquetas predefinidas de struts para acceder a las clases y métodos -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World!</title>
</head>
<body>

<!-- 
<h2><s:property value="messageStore.message" /></h2> accede al método getMessage del objeto messageStore 
													de la clase MessageStore -->
													

<h2><s:property value = "person.nombre" /></h2>	<!-- llama al getPersona del objeto persona creado en HelloWorldAction 
		y getNombre de la clase Persona-->	
<h2><s:property value = "person.apellido" /></h2>	<!-- llama al getPersona del objeto persona creado en HelloWorldAction 
		y getNombre de la clase Persona-->										
<h2><s:property value = "person.edad" /></h2>												
													

</body>
</html>