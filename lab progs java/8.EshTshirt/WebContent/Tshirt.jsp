<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>T SHIRT SALES</title>
<style>
	h3{
		text-align: center;
	}
	
</style>
</head>
<body>
	<h3>T SHIRT SALES</h3>
	<form action="order" method="post">
		<strong>Accessories: </strong>
		<input type="radio" name="accessories" value="belt">Belt
		<input type="radio" name="accessories" value="cap">Cap
		<input type="radio" name="accessories" value="hair band">Hair Band
		
		<br>
		<br>
		<strong>Tag line: </strong>
		<textarea rows="3" cols="25" name="tag"></textarea>
		
		
		<br>
		<br>
		<strong>Chest Pocket:</strong>
		<input type="radio" name="chest" value="yes">Yes
		<input type="radio" name="chest" value="no">No
		
		<br>
		<br>
		<strong>Colour:</strong>
		<select name="colour">
			<option value="red">Red</option>
			<option value="brown">Brown</option>
			<option value="blue">Blue</option>
			<option value="green">Green</option>
			<option value="white">White</option>
			<option value="black">Black</option>
		</select>
		
		<br>
		<br>
		<input type="submit">
	</form>
</body>
</html>