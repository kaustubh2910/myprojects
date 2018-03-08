<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head><title>Your Product</title>
<link href="<c:url value="../css/main.css"/>" rel="stylesheet">
</head>
<body>

<table>
  <tr>
  <th>Id</th> 
    <td>${lists.pm_id}</td>
  </tr>
  <tr>
  <th>Product Name</th> 
    <td>${lists.pm_name}</td>
  </tr>
  <tr>
  <th>Product Price</th> 
    <td>${lists.pm_price}</td>
  </tr>
  </table>
  <a href="/">Back</a>
</body>
</html>