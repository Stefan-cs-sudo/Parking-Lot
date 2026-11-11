<%--
  Created by IntelliJ IDEA.
  User: Stefan
  Date: 11/11/2026
  Time: 7:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<t:pageTemplate pageTitle="Users">
    <h1>Users</h1>

    <div class="container text-center">

        <div class="row fw-bold pb-2 border-bottom mb-3">
            <div class="col">ID</div>
             <div class="col">Username</div>

            <div class="col">Email</div>
        </div>

        <c:forEach var="user" items="${users}">
            <div class="row">
                <div class="col">
                        ${user.id}
                </div>
                <div class="col">
                        ${user.username}
                </div>
                <div class="col">
                        ${user.email}
                </div>
            </div>
        </c:forEach>
    </div>
</t:pageTemplate>