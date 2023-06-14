<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Job-Listing</title>
	<style type="text/css">
		.container{
			margin: 8px;
			padding: 8px;
			font-family: calibri;
			box-shadow: 2px 2px 2px gray,2px 2px 2px gray,2px 2px 2px gray;
		}
	</style>
</head>
<body>
    <div>
        <form action="/jobseeker/view-jobs">
            <input type="text" name="searchquery" placeholder="Search">
            <input type="submit" value="Search" name="search">
        </form>
    </div>
	<c:forEach items="${jobList}" var="job">
        <div class="container">
            <h2>${job.jobTitle}</h2>
            <div><b>Job Role - </b>${job.jobRole}</div>
            <div><b>Job Category - </b>${job.jobCategory}</div>
            <div><b>Job Location - </b>${job.jobLocation}</div>
            <div><b>Offered Salary - </b>${job.jobSalary}</div>
            <form action="/jobseeker/apply" method="POST">
                <input type="hidden" value="${job.jobId}" name="job_id">
                <button type="submit">Apply</button>
            </form>
        </div>
    </c:forEach>
</body>
</html>