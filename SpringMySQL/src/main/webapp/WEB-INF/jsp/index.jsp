<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head><title>Product Management System</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link href="<c:url value="../css/main.css"/>" rel="stylesheet">
</head>
<body>

<table>
  <tr>
    <th>ID</th>
    <th>Product Name</th>
    <th>Product Price</th>
    <th>Action</th>
  </tr>
   <c:forEach var = "list" items = "${lists}">
  <tr>
    <td>${list.pm_id}</td>
    <td>${list.pm_name}</td>
    <td>${list.pm_price}</td>
    <td>
        <a href="/view/${list.pm_id}">View</a>
        <a href="/delete/${list.pm_id}">Delete</a>
        <a id ="edit" href="/edit/${list.pm_id}">Edit</a>
    </td>
  </tr>
  </c:forEach>
</table>
<hr/>
<form id="index" method="post" action="/save">
<input type="hidden" name="pm_id" value=""/>
 <b>Product Name:</b><br>
  <input type="text" name="pm_name"/>
  <br>
  <b>Product Price:</b><br>
  <input type="text" name="pm_price" >
  <br><br>
  <input type="submit" value="Submit">
</form>

<script>	
</script>
</body>
</html>