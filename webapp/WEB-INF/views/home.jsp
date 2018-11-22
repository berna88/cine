<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    <<spring:url value="/resources" var="urlPublic" ></spring:url>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
	<header>
		<h1>Home</h1>
	</header>
	<section>
		<article>
			<table class="table">
				<thead class="thead-dark">
					<tr>
						<th>nombre</th>
					</tr>
				</thead>
				<tbody>
				
					<c:forEach items="${ peliculas }" var="pelicula">
					<tr>
			<td>${ pelicula.nombre } </td>
			<tr>
		</c:forEach>
				
				</tbody>
			</table>
		
		</article>
	</section>
	

</body>
</html>