<%-- 
    Document   : Students
    Created on : Apr 11, 2016, 7:17:46 PM
    Author     : adamopoulo
--%>

<%@page import="Students.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LAB</title>
    </head>
    <body>
        <table>
        <%
            java.util.List students = (java.util.List) request.getAttribute("students");
            if (students == null || students.size() == 0 ) {
        %>
        <h1>no students</h1>
        <% } else {
                    for (int i = 0; i<students.size(); i++) {
                        Student s = (Student) students.get(i);      
        %>
        <tr>
            <td><%=s.getName()%></td>
            <td><%=s.getEmail()%></td>
            <td><%=s.getDegree()%></td>
            <td><%=s.getId()%></td>
        </tr>
        <% } }
        %>
        </table>
    </body>
</html>
