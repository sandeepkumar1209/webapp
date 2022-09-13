<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<html>
<head>
<style type="text/css">
.error{
color:red;
font-style:italic;
position:fixed;
text-align: left;
}

</style>

</head>
<body>

<div align="center">
<h2>Registration Form</h2>
<form:form action="submitForm" modelAttribute="registration">
<form:label path="yourName">Your Name:</form:label>
<form:input path="yourName"/><br>
<form:errors path="yourName" cssClass="error"/>

<form:label path="email">E-mail:</form:label>
<form:input path="email"/><br>
<form:errors path="email" cssClass="error"/>

<form:label path="password">Password:</form:label>
<form:input path="password"/><br>
<form:errors path="password" cssClass="error"/>

<form:label path="fatherName">Father Name:</form:label>
<form:input path="fatherName"/><br>
<form:errors path="fatherName" cssClass="error"/>

<form:label path="gender">Gender:</form:label>
<form:radiobutton path="gender" value="Male"/>Male
<form:radiobutton path="gender" value="Female"/>Female<br>
<form:errors path="gender" cssClass="error"/>

<form:label path="gender">Age:</form:label>
<form:errors path="gender" cssClass="error"/>

<form:label path="birthday">Birthday (YYYY-DD-MM):</form:label>
<form:input path="birthday"/><br>
<form:errors path="birthday" cssClass="error"/>

<form:label path="married">Married:</form:label>
<form:checkbox path="married"/><br>
<form:errors path="married" cssClass="error"/>


<form:label path="age">Age:</form:label>
<form:input path="age"/><br>
<form:errors path="age" cssClass="error"/>

<form:label path="profession">Profession:</form:label>
<form:select path="profession">
<form:option value="Developer" lable="Developer"/>
<form:option value="Tester" lable="Tester"/>
<form:option value="Analyst" lable="Analyst"/>
<form:option value="TeamLead" lable="TeamLead"/>
</form:select><br>
<form:errors path="profession" cssClass="error"/>

<form:label path="address">Address:</form:label>
<form:input path="address"/><br>
<form:errors path="address" cssClass="error"/>

<div align="center">
<h3>Contact us</h3>
<form:label path="phone">Phone No:</form:label>
<form:input path="phone"/><br>
</div>
<br><br>

<form:button>Submit</form:button>
</form:form>
</div>

</body>
</html>