<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>View Jobs</title>
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
                <th>ID</th>
                <th>Job Title</th>
                <th>Job Category</th>
                <th>Job Salary</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${jobList}" var="job">
                <tr>
                    <td>${job.jobId}</td>
                    <td>${job.jobTitle}</td>
                    <td>${job.jobCategory}</td>
                    <td>${job.jobSalary}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>