<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Parack Test</title>
</head>
<body>
 
<h2>Parack DB Trail</h2>
 
<form:form method="post" action="add" commandName="User">
 
    <table style="width: 100%">
  
    <tr>
        <td style="width: 10%"><form:label path="firstName"><spring:message code="label.firstname"/></form:label></td>
        <td style="width: 10%"><form:input path="firstName" /></td>
       <td style="width: 10%"><form:label path="lastName"><spring:message code="label.lastname"/></form:label></td>
        <td style="width: 10%"><form:input path="lastName" /></td>
        <td style="width: 10%">
    </tr>

    <tr>
        <td colspan="2">
            <input type="submit" value="<spring:message code="label.add"/>"/>
        </td>
    </tr>
</table> 


<table  border="1px">
<c:if  test="${!empty Users}">
<tr>
<td colspan="9">Users Table</td>
</tr>
<tr>
	<th align="left">UserID</th>
    <th align="left">LastName, FirstName</th>
    <th align="left">Gender</th>
    <th align="left">Address</th>
    <th align="left">Email</th>
    <th align="left">Country</th>
    <th align="left">Action</th>
</tr>
<c:forEach items="${Users}" var="user">
    <tr>
        <td>${user.userId}</td>
        <td>${user.firstName} ${user.lastName} </td>
       <td>${user.gender}</td>
       <td>${user.address}</td>
       <td>${user.email}</td>
       <td> ${user.country}</td>
       <td></td>
        
    </tr>
</c:forEach>
</c:if>
</table>

</form:form>
 
</body>
</html>