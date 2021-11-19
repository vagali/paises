
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Alta Nuevo Producto</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Productos</h1>
				<p>Alta Nuevo Producto</p>
			</div>
		</div>
	</section>
	<section class="container">
		<form:form method="POST" modelAttribute="nuevoPais"
			class="form-horizontal">
			<fieldset>
				<legend>Añadir Nuevo Pais</legend>
				
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="countryId">id</label>
					<div class="col-lg-10">
						<form:input id="countryId" path="countryId" type="text"
							class="form:input-large" />
							<form:errors path="countryId" cssClass="text-danger" />
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="countryName">Nombre</label>
					<div class="col-lg-10">
						<form:input id="countryName" path="countryName" type="text"
							class="form:input-large" />
							<form:errors path="countryName" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnCrear"
							class="btn 
                                   btn-primary"
							value="Crear Nuevo" />
					</div>
				</div>
			</fieldset>
		</form:form>
	</section>
</body>
</html>
