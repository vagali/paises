
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>MOdificar Producto</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Productos</h1>
				<p>Modificar Producto</p>
			</div>
		</div>
	</section>
	<section class="container">
		<form:form method="POST" modelAttribute="modificarProducto"
			class="form-horizontal">
			<fieldset>
				<legend>Crear un nuevo producto</legend>
				<c:out value="${producto}" />
				<div class="form-group">

					<label class="control-label col-lg-2 col-lg-2" for="idProducto">
						Id Producto </label>
					<div class="col-lg-10">
						<form:input id="idProducto" path="idProducto" type="text"
							class="form:input-large" value="${producto.idProducto }" />
						<form:errors path="idProducto" cssClass="text-danger" />
					</div>
				</div>


				<div class="form-group">
					<label class="control-label col-lg-2" for="descripcion">Descripción</label>
					<div class="col-lg-10">
						<form:textarea id="descripcion" path="descripcion" rows="2"
							value="${producto.descripcion }" />
					</div>
				</div>


				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnCrear"
							class="btn 
                                   btn-primary"
							value="Modificar" />
					</div>
				</div>
			</fieldset>
		</form:form>
	</section>
</body>
</html>
