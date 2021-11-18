
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Products</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>
					<spring:message code="app.titulo" />
				</h1>
				<p>Todos los productos disponibles en tienda</p>
			</div>
		</div>
	</section>

	<section class="container">
		<div class="row">
			<c:forEach items="${productos}" var="producto">
				<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
					<div class="thumbnail">
						<div class="caption">
							<h3>${producto.nombre}</h3>
							<p>${producto.descripcion}</p>
							<p>${producto.precioUnitario}€</p>
							<p>Hay ${producto.unidadesEnStock} unidades in stock</p>
						</div>
						<a href="productos/modificar/${producto.idProducto }"
							class="btn btn-primary btn-lg active" role="button">Modifcar
							producto</a> 
						<a href="productos/remove?=${producto.idProducto }"
							class="btn btn-primary btn-lg active" role="button" method = "POST">Borrar
							producto</a>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>

</body>
</html>
