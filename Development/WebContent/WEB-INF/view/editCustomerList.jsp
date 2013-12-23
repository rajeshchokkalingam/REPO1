<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>BCRM TEST</title>
</head>
<body>
 
<h2>Customer Management</h2>
 
<form:form method="post" action="add" commandName="customer">
 
    <table style="width: 100%">
  
    <tr>
        <td style="width: 10%"><form:label path="firstName"><spring:message code="label.firstname"/></form:label></td>
        <td style="width: 10%"><form:input path="firstName" /></td>
       <td style="width: 10%"><form:label path="shortName"><spring:message code="label.lastname"/></form:label></td>
        <td style="width: 10%"><form:input path="shortName" /></td>
        <td style="width: 10%">
    </tr>

    <tr>
        <td colspan="2">
            <input type="submit" value="<spring:message code="label.add"/>"/>
        </td>
    </tr>
</table> 


<table  border="1px">
<c:if  test="${!empty customerList}">
<tr>
<td colspan="9">Customer & Address Table</td>
</tr>
<tr>
	<th align="left">customerId</th>
    <th align="left">LastName, FirstName</th>
    <th align="left">Gender</th>
    <th align="left">AddressID</th>
    <th align="left">Address</th>
    <th align="left">Email</th>
    <th align="left">Country</th>
    <th align="left">Updated Date</th>
    <th align="left">Action</th>
</tr>
<c:forEach items="${customerList}" var="cus">
    <tr>
        <td>${cus.customerId}</td>
        <td>${cus.title}. ${cus.firstName} ${cus.shortName} </td>
       <td>${cus.gender}</td>
       <td>${cus.bcrmAddress.addressId}</td>
       <td>${cus.bcrmAddress.addressLine2}</td>
       <td>${cus.bcrmAddress.email}</td>
       <td> ${cus.bcrmAddress.country}</td>
       <td>${cus.updateDttm}</td>
        <td><a href="delete/${cus.customerId}">delete</a>
        <a href="update/${cus.customerId}">update</a>
        
        </td>
    </tr>
</c:forEach>
</c:if>
</table>

</form:form>
 
     
<h3>Customers</h3>


 
</body>
</html>