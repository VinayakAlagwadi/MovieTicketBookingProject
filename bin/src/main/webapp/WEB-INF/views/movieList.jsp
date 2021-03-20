
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<!--     <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="playerform.css">
     <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/ui-darkness/jquery-ui.css"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"> -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
	
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	
	<style>
	.header{
	text-align:center;
	
	margin: 5px 600px 0 700px;
	background-color:#1e9aca;
	border: solid;
	
}

.footer{
	text-align:center;
	padding: 20px;
	margin: 5px 600px 0 700px;
	background-color:#1e9aca;
	border: solid;
	
}
.f{
	text-align:center;
	margin: 5px 600px 0 700px;
	background-color:#87CEEB;
	border:solid;
	padding-right: 0px;
	
}

.t {
	margin-left: auto;
	
	
  }

td{
	text-align: left;
}
		
	</style>
</head>
<body>
 <sql:setDataSource
        var="myDS"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/bms"
        user="root" password="root"
    />

<sql:query var="listUsers"   dataSource="${myDS}">
        SELECT * FROM movie;
    </sql:query>


<div class="jumbotron text-center" style="margin-bottom:0">
		<h1 class="display-1">Book My Show</h1>
		<p>Welcome ${name }</p>
	</div>
	​
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li class="new.html"><a href="new.html">Home</a></li>
					<li><a href="new.html">Logout</a></li>

				</ul>
			</div>
		</div>
	</nav>
	
	<form action="addbooking" method="POST">
	
	<table border="1" cellpadding="10">
        <thead>
            <tr>
               
                <th>Movie ID</th>
                <th>Cast</th>
                <th>Movie Name</th>
                <th>Date</th>
                <th>Ticket Price</th>
                <th>click</th>
                
                 
            </tr>
        </thead>
        <tbody>
        	<c:forEach var="user" items="${listUsers.rows}">
                <tr>
                 <td><c:out value="${user.movie_id }" /></td>
                  <td><c:out value="${user.cast}" /></td>
                   <td><c:out value="${user.movie_name}" /></td>
                    <td><c:out value="${user.release_date}" /></td>
                     <td><c:out value="${user.price}" /></td>
                    
                    <td>
                   <%-- <a th:href="@{'/Book/' + ${user.movie_id}}">Book Now</a> --%> 
                   <input type="submit" value="Book"><br><br>
                </td>
                </tr>
            </c:forEach>
            <%-- <tr th:each="Movie : ${list}">
                <td th:text="${Movie.MovieId}"></td>
                <td th:text="${Movie.cast}"></td>
                <td th:text="${Movie.movieName}"></td>
                <td th:text="${Movie.releaseDate}"></td>
             
            </tr> --%>
        </tbody>
    </table>
	</form>
	
	 
</body>
</html>




