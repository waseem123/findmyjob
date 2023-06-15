<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>View Applied Jobs</title>
    <style>
        table,th,td{
            border : 1px solid black;
            border-collapse : collapse;
            font-size:24px;
            padding:24px;
        }
    </style>
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>Application ID</th>
                <th>Job Title</th>
                <th>Jobseeker</th>
                <th>Mobile Number</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${applicationList}" var="application">
                <tr>
                    <td>${application.applicationId}</td>
                    <td>${application.job.jobTitle}</td>
                    <td>${application.jobSeeker.jobSeekerName}</td>
                    <td>${application.jobSeeker.jobSeekerMobileNo}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>