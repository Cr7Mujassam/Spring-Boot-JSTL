<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Welcome to jsp</title>
</head>
<body>
here is your cars <c:forEach items="${car1}" var="vehical">
					<h1>${vehical}</h1>
				 </c:forEach>
</body>
</html>