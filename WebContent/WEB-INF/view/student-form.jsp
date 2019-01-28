<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
first name: <form:input path="firstName"/>
<br></br>
last name: <form:input path="lastName"/>
<br></br>
country: <form:select path="country">
<form:options items="${student.countryOptions}"/>
</form:select>
<br></br>
Best language:
JAVA <form:radiobutton path="bestLangauge" value="JAVA"/>
Ruby <form:radiobutton path="bestLangauge" value="Ruby"/>
JavaScript <form:radiobutton path="bestLangauge" value="JavaScript"/>
<br></br>
<input type="submit" value="submit"/>
</form:form>
</body>
</html>