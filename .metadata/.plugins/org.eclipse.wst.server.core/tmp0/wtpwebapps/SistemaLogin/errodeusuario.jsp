<%@ page isErrorPage="true"%>
<%@ page import="java.util.Enumeration" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Erro de Login</title>
</head>
<body>

	<div align="center">
		<div id="cabecalho">Cabe?alho</div>
		<div id="corpo">
			<img src="imagens/erro1.jpg" />
			<hr />
			Error: <%=exception.getMessage()%><br /> 
			Exce??o ocorrida: <%=exception.getClass()%><br />
			<hr />
			<a href="login.jsp">Tentar Novamente</a>
		</div>
		<div id="rodape">Rodape</div>
	</div>

</body>
</html>