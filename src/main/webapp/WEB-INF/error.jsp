<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="pl_PL">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>ERROR SSI PAGE</title>
    <link href="https://fonts.googleapis.com/css?family=Audiowide" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Play" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Bungee|Russo+One" rel="stylesheet">
    <link href="../resources/style.css" rel="stylesheet">
</head>
<body>

<div class="container" style="margin-top: 180px;">
    <img src="../resources/img/404.jpg" style=" display: block; margin: 0 auto; ">
    <h2 style="color: black; font-family: 'Russo One', sans-serif; padding-top: 0px; text-align: center;">Wygląda na to,
        że odkryłeś koniec internetów.</br> Gratulujemy!!!</br>Jeśli jednak zechciałbyś wrócić do naszej strony kliknij
        <a href="/student" style="color: #6666FF;">STRONA GŁÓWNA</a></br>
        Error message
        </br>
    </h2>
    <div style="color: red; font-family: 'Russo One',sans-serif; padding-top: 0px; font-weight: 400; text-align: center;">
        <%= request.getAttribute("errorMessage")%>
    </div>


</div>


</body>
</html>