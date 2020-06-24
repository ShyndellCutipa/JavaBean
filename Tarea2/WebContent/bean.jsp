<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Imprimir</title>
</head>
<body>
	<c:out value = "${imprimir.mensaje1}"></c:out>
	<c:out value = "${imprimir.mensaje2}"></c:out>
	<c:out value = "${imprimir.mensaje3}"></c:out>
	Fecha actual:
	<c:out value = "${imprimir.fecha}"></c:out>
	Valor de la variable contador:
	<c:out value = "${imprimir.contador}"></c:out>
	<c:out value="${header['User-Agent']}"></c:out>	

</body>
</html>