<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : show
    Created on : Mar 16, 2024, 2:52:19 PM
    Author     : Hoangvan
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DAO.DAO" %>
<% request.setAttribute("choice",new DAO().getStudentById(request.getParameter("sid"))); %>
<% request.setAttribute("classes",new DAO().getAllClass()); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        List of Student:
        <table border="1">
            <thead>
                <tr>
                    <th>Code</th>
                    <th>Name</th>
                    <th>Date of birth</th>
                    <th>Gender</th>
                    <th>Select</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="o" items="${listS}">
                    <tr>
                        <td>${o.studentID}</td>
                        <td>${o.studentName}</td>
                        <td>${o.birthDate}</td>
                        <td>${o.gender}</td>
                        <td><a href="?sid=${o.studentID}">select</a></td>
                    </tr>
                </c:forEach>

            </tbody>
        </table>

        Detail information:
        <form action="update" method="POST">
            <table border="0">
                <tbody>
                    <tr>
                        <td>Code:</td>
                        <td><input type="text" name="code" value="${choice.studentID}" /></td>
                        <td>Name:</td>
                        <td><input type="text" name="name" value="${choice.studentName}" /></td>
                    </tr>
                    <tr>
                        <td>Date of birth:</td>
                        <td><input type="date" name="dob" value="${choice.birthDate}" /></td>
                        <td>Gender:</td>
                        <td><input type="radio" name="gender" value="1" ${choice.gender? "checked":""} />Male 
                            <input type="radio" name="gender" value="0" ${!choice.gender? "checked":""}/> Female</td>
                    </tr>
                    <tr>
                        <td>Class:</td>
                        <td><select name="classID"> <!-- Ensure the name attribute is "classID" -->
                            <c:forEach var="o" items="${classes}">
                                <option value="${o.classID}">${o.className}</option>
                            </c:forEach>
                        </select>
                        </td>
                        <td><input type="submit" value="Update" /></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>
        </form>


    </body>
</html>
