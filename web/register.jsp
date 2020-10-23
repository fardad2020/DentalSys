<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%--
  Created by IntelliJ IDEA.
  User: fardad
  Date: 5/6/20
  Time: 3:50 PM
  To change this template use File | Settings | File Templates.
--%>

<jsp:include page="template/header.jsp"/>

<body class="bg-color img">
<jsp:include page="template/nav.jsp"/>
<div class="container-fluid">

    <h2>User Register Form</h2>
    <div class="col-md-4 col-md-offset-3">
        <div class="alert alert-success center" role="alert">
            <p>${NOTIFICATION}</p>
        </div>

        <form action="<%=request.getContextPath()%>/register" method="post">

            <div class="form-group">
                <label for="uname">First Name:</label> <input type="text" class="form-control" id="uname"
                                                              placeholder="First Name" name="firstname" required>
            </div>

            <div class="form-group">
                <label for="uname">Last Name:</label> <input type="text" class="form-control" id="uname"
                                                             placeholder="last Name" name="lastname" required>
            </div>

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
<jsp:include page="template/footer.jsp"></jsp:include>
</body>