<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<html>
<title>Spring Zero XML Example</title>
<body>
	<h2>Spring Zero XML Example</h2>
	<c:if test="${not empty msg}">
        ${msg}
    </c:if>
			<h3>List of Data</h3>
			<table cellpadding="5" cellspacing="5" align = "centre">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Experience</th>
						<th>Specialization</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="dataList" items="${dataList}">
						<tr>
							<td>${dataList.id}</td>
							<td>${dataList.name}</td>
							<td>${dataList.experience}</td>
							<td>${dataList.specialization}</td>
							<td><a
								href="<%=request.getContextPath()%>/update/data/${dataList.id}">Update</a>
								&nbsp; <a
								href="<%=request.getContextPath()%>/delete/data/${dataList.id}"
								onclick="return confirm('Do you really want to delete?')">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
</body>
</html>