<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
		<meta charset="ISO-8859-1">
		<title>Carlos Salazar - Simple CRUD with Spring Framework</title>
		<link rel="stylesheet" href="css/bootstrap.min.css">   		
        <script src="js/bootstrap.min.js"></script> 
</head>
<body>
<div class="row">
	<div class="col-md-3">
			<h3>Agregar Score</h3>
			<form action="addScore">
				<label>ID:</label><input type="text" name="id"><br>
				<label>Nickname:</label><input type="text" name="nickname"><br>
				<label>Score:</label><input type="text" name="score"><br>
				<input type="submit"><br>
			</form>
	</div>
	<div class="col-md-3">
		<h3>Ver Scores</h3>
		<form action="viewAllScore">
			<input type="submit"><br>
		</form>
	</div>
	<div class="col-md-3">
		<h3>Ver Score de Jugador</h3>
		<form action="viewPlayer">
			<label>ID:</label><input type="text" name="id"><br>
			<input type="submit"><br>
		</form>
	</div>
	<div class="col-md-3">
		<h3>Actualizar Score de Jugador</h3>
		<form action="updateScore">
			<label>ID:</label><input type="text" name="id"><br>
			<label>Nickname:</label><input type="text" name="nickname"><br>
			<label>Score:</label><input type="text" name="score"><br>
			<input type="submit"><br>
		</form>
	</div>------------------------------------------------------------------------------------------------
</div>
	
	<div class="row col-md-3">
	<h3>Borrar Score de Jugador</h3>
		<form action="deleteScore">
			<label>ID:</label><input type="text" name="id"><br>
			<input type="submit"><br>
		</form>
	</div>

</body>
</html>