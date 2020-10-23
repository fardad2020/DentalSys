<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%--
  Created by IntelliJ IDEA.
  User: fardad
  Date: 5/6/20
  Time: 8:57 PM
  To change this template use File | Settings | File Templates.
--%>


<jsp:include page="template/header.jsp"/>

<body class="bg-color img">

<jsp:include page="template/nav.jsp"/>
<div class="container-fluid" style="overflow: auto">
    <div class="row justify-content-start">
        <div class="col-md-4" style="margin: 80px;">
            <h1>Login Form</h1>
            <form action="<%=request.getContextPath()%>/login" method="post">

                <div class="form-group">
                    <label for="uname">User Name:</label> <input type="text" class="form-control" id="username"
                                                                 placeholder="User Name" name="username" required>
                </div>

                <div class="form-group">
                    <label for="uname">Password:</label> <input type="password" class="form-control" id="password"
                                                                placeholder="Password" name="password" required>
                </div>


                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>

    </div>
</div>

</body>


<jsp:include page="template/footer.jsp"/>