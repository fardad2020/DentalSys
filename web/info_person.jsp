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
    <div class="container">

    </div>
</div>


<jsp:include page="template/footer.jsp"></jsp:include>
</body>
