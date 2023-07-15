<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<html>
<title>Spring MVC Zero XML Example</title>
<body>
	<h2>Spring MVC Zero XML Example</h2>
	<c:if test="${not empty msg}">
        ${msg}
    </c:if>
	<h3>Update User</h3>
	<form method="POST" name="update_data"
		action="<%=request.getContextPath()%>/updateData">
		<input hidden="hidden" name="id" value="${id}" type="text" /> Name: <input
			name="name" value="${data.name}" type="text" /> <br /> <br />
		Experience: <input name="experience" value="${data.experience}"
			type="text" /> Specialization: <input name="specialization" value="${data.specialization}"
			type="text" /> <br /> <br /> <input value="Update User"
			type="submit" />
	</form>
</body>
</html>