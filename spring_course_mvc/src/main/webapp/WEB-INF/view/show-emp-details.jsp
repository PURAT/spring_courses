<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
    <body>
        <h3>WELCOME!</h3>
        <br>
        <b>Your name:</b> ${employee.name}
        <br>
        <b>Your surname:</b> ${employee.surname}
        <br>
        <b>Your salary:</b> ${employee.salary}
        <br>
        <b>Phone number:</b> ${employee.phoneNumber}
        <br>
        <b>Your email:</b> ${employee.email}
        <br>
        <b>Your department:</b> ${employee.department}
        <br>
        <b>Your car:</b> ${employee.carBrand}
        <br>
        <b>Language(s):</b>
        <ul>
            <c:forEach var="lang" items="${employee.languages}">
                <li> ${lang} </li>
            </c:forEach>
        </ul>
    </body>
</html>