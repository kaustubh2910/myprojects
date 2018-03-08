<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head><title>Edit Your Product</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link href="<c:url value="../css/main.css"/>" rel="stylesheet">
</head>
<body>
<hr/>
<form id="edit" method="post" action="/save">
 	<b>Product Id:</b><br>
  <input type="text" name="pm_id" value="${list.pm_id}"/>
  <br>
 	<b>Product Name:</b><br>
  <input type="text" name="pm_name" value="${list.pm_name}"/>
  <br>
  	<b>Product Price:</b><br>
  <input type="text" name="pm_price" value="${list.pm_price}" >
  <br><br>
  <input id ="submit" type="submit" value="Submit"><br>
  <a href="/">Back</a>
</form>
</body>

<script>
</script>
</html>