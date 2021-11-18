<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Paises</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>
					<spring:message code="app.titulo.Paises" />
				</h1>
				<p>Paises</p>
			</div>
		</div>
	</section>
	<section class="container">
		<div class="row">
			<table class="tabla">
				<thead>
					<th>id</th>
					<th>Nombre</th>
				</thead>
				<c:forEach items="${paises}" var="pais">
					<tr>
						<td>${pais.countryId }</td>
						<td>${pais.countryName }</td>
						<td><a>Borrar</a></td>
						<!-- Falta testear
						 href="pais/borrar/${pais.countryId}"-->
					</tr>
				</c:forEach>
			</table>
		<!--  	Falta enviar el regionId para poder dar de alta un nuevo pais a esa region
		<a href="pais/nuevo/${pais.regionId }"
				class="btn btn-primary btn-lg active" role="button">Añadir nuevo
				pais</a>-->
		</div>
	</section>
</body>
</html>