<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<table align="center" border="1px">
<tr>
    <th>Id</th>
    <th>Name</th>
    <th>Fees</th>
    <th>Update</th>
    <th>Delete</th>
</tr>
 <c:forEach var="i" items="${data}">
  <tr>
    <form action="updatestudent">
    <td>${i.getId()}<input type="hidden" name="id" value="${i.getId()}" /></td>
    <td><input type="text" name="name" value="${i.getName()}" /></td>
    <td><input type="number" name="fees" value="${i.getFees()}" /></td>
    <td><input type="submit" value="Upadte"></td>
    </form>
    <td><a href="delete?id=${i.getId()}">Delete</</a></td>
  </tr>
  
</c:forEach>
</table>

