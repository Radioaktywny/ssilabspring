<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <link href="<c:url value="../resources/style.css" />" rel="stylesheet">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="https://fonts.googleapis.com/css?family=Audiowide" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Play" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Bungee|Russo+One" rel="stylesheet">
    <title>SSI PROJECT</title>
</head>
<body>
<h2 style="color: black; font-family: 'Russo One', sans-serif; padding-top: 0px; text-align: left;">
    <form:form commandName="student" method="post" action="/student">
        <form:hidden path="id" id="id"/>
        <table>
            <tr>
                <td><label><spring:message code="student.firstname"/></label></td>
                <td><form:input path="firstName" id="firstName"/></td>
                <td><form:errors path="firstName" cssClass="error"/></td>
            </tr>
            <tr>
                <td><spring:message code="student.lastname"/></td>
                <td><form:input path="lastName" id="lastName"/></td>
                <td><form:errors path="lastName" cssClass="error"/></td>
            </tr>
            <tr>
                <td><spring:message code="student.university"/></td>
                <td><form:input path="universityName" id="universityName"/></td>
                <td><form:errors path="universityName" cssClass="error"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="<spring:message code="savebutton"/>"/></td>
            </tr>
        </table>
    </form:form>
</h2>
</body>
</html>