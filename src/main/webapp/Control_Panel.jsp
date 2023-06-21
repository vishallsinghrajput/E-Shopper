<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="uproduct" method="post" enctype="multipart/form-data" >

		<input type="text" name="p_name" placeholder="Product Name"><br>
		<input type="number" name="p_price" placeholder="Product Price"><br>
		<input type="number" name="p_quantity" placeholder="Product Quantity"><br>
		<input type="file" name="p_image1"><br> <input
			type="file" name="p_image2"><br> <input type="file"
			name="p_image3"><br> <input type="file" name="p_image4"><br>
		product size : S <input type="checkbox" name="p_size1" value="S">
		M <input type="checkbox" name="p_size2" value="M"> L <input
			type="checkbox" name="p_size3" value="L"> XL <input
			type="checkbox" name="p_size4" value="XL"><br> product
		color : Black <input type="checkbox" name="p_color1" value="black">
		Blue <input type="checkbox" name="p_color2" value="blue">
		Orange <input type="checkbox" name="p_color3" value="orange">
		Yellow <input type="checkbox" name="p_color4" value="yellow"><br>
		<textarea name="p_description" placeholder="Product Description"></textarea>
		<br>
		<textarea type="text" name="p_info" placeholder="Product Info"></textarea>
		<br> <select name="p_category">
			<option selected="selected" value="jeans">Jeans</option>
			<option value="shirt">Shirt</option>
			<option value="laptop">Laptop</option>
			<option value="mobile">Mobile</option>
		</select> 
		<input type="submit">
	</form>
</body>
</html>