<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: fardad
  Date: 5/7/20
  Time: 2:34 AM
  To change this template use File | Settings | File Templates.
--%>
<jsp:include page="template/header.jsp"/>

<body>
<header>
    <nav class="navbar navbar-expand-md navbar-dark head">
        <div>
            <a href="https://www.javaguides.net" class="navbar-brand"> Dental
                App</a>
        </div>

        <ul class="navbar-nav">
            <li><a href="<%=request.getContextPath()%>/list"
                   class="nav-link">Todos</a></li>
        </ul>

        <ul class="navbar-nav navbar-collapse justify-content-end">
            <li><a href="<%=request.getContextPath()%>/logout"
                   class="nav-link">Logout</a></li>
        </ul>
    </nav>
</header>

<div class="row">
    <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

    <div class="container">
        <h3 class="text-center">List of Todos</h3>
        <hr>
        <div class="container text-left">

            <a href="<%=request.getContextPath()%>/new"
               class="btn btn-success">Add Todo</a>
        </div>
        <br>
        <table class="table table-bordered">
            <thead>
            <tr>
                <th>Title</th>
                <th>Target Date</th>
                <th>Todo Status</th>
                <th>Actions</th>
            </tr>
            </thead>
            <tbody>
            <!--   for (Todo todo: todos) {  -->
            <c:forEach var="todo" items="${listTodo}">

                <tr>
                    <td><c:out value="${todo.title}"/></td>
                    <td><c:out value="${todo.targetDate}"/></td>
                    <td><c:out value="${todo.status}"/></td>

                    <td><a href="edit?id=<c:out value='${todo.id}' />">Edit</a>
                        &nbsp;&nbsp;&nbsp;&nbsp; <a
                                href="delete?id=<c:out value='${todo.id}' />">Delete</a></td>

                    <!--  <td><button (click)="updateTodo(todo.id)" class="btn btn-success">Update</button>
                              <button (click)="deleteTodo(todo.id)" class="btn btn-warning">Delete</button></td> -->
                </tr>
            </c:forEach>
            <!-- } -->
            </tbody>

        </table>
    </div>
</div>

<jsp:include page="template/footer.jsp"></jsp:include>
</body>