<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
<section id="cuerpo">
		<article id="contenido">
			<h2>Regiones</h2>

			<div class="divTabla">
				<table class="tabla">
					<thead>
						<th>id</th>
						<th>Nombre</th>
					</thead>
					<c:forEach items="${regiones}" var="region">
						<tr>
							<td>${region.regionId }</td>
							<td><a href="pais/${region.regionId}">${region.regionName }</a></td>
						</tr>
					</c:forEach>
				</table>
			</div>

		</article>
	</section>
</body>
</html>