<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html>
<body>
<h3>Dear Employee, please enter your data...</h3>
<br>
<%--<form action="/employee/showEmployee" method="get">--%>
<%--    <input type="text" name="employeeName">--%>
<%--    <input type="submit">--%>
<%--</form>--%>

<%--<form:form action="/employee/showEmployee" modelAttribute="employee">--%>
<%--    Name <form:input path="name"/>--%>
<%--    <br><br>--%>
<%--    Surname <form:input path="surname"/>--%>
<%--    <br><br>--%>
<%--    Salary <form:input path="salary"/>--%>
<%--    <br><br>--%>
<%--    <input type="submit" value="OK">--%>
<%--</form:form>--%>

<form:form action="/employee/showEmployee" modelAttribute="employee">
    Name <form:input path="name"/>  <span style="color: red"><form:errors path="name" /></span>
    <br><br>
    Surname <form:input path="surname"/> <form:errors path="surname" cssStyle="color: red" />
    <br><br>
    Salary <form:input path="salary"/> <span style="color: red"><form:errors path="salary"/></span>
    <br><br>
    Phone number <form:input path="phoneNumber"/> <form:errors path="phoneNumber" cssStyle="color: red" />
    <br><br>
    Email <form:input path="email"/> <form:errors path="email" cssStyle="color: red" />
    <br><br>
    Department <form:select path="department">
        <form:options items="${employee.departments}"/>
    </form:select>
    <br><br>

    Which car do you want?
    <br>
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
<%--    BMW <form:radiobutton path="carBrand" value="BMW 780i"/>--%>
<%--    <br>--%>
<%--    MERCEDES <form:radiobutton path="carBrand" value="MERCEDES AMG GT"/>--%>
<%--    <br>--%>
<%--    AUDI <form:radiobutton path="carBrand" value="AUDI R8"/>--%>
    <br><br>

    Foreign language(s):
    <br>
<%--    <form:checkbox path="languages" value="English"/> EN--%>
<%--    <form:checkbox path="languages" value="Dutch"/> DE--%>
<%--    <form:checkbox path="languages" value="French"/> FR--%>
    <form:checkboxes path="languages" items="${employee.languagesList}"/>
    <br><br>

    <input type="submit" value="OK">
</form:form>

</body>
</html>