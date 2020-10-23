<%--
  Created by IntelliJ IDEA.
  User: fardad
  Date: 5/6/20
  Time: 7:07 PM
  To change this template use File | Settings | File Templates.
--%>
<header>
    <nav class="navbar navbar-expand-md">
        <div>
            <a href="https://www.javaguides.net" class="navbar-brand" style="color: honeydew">Dental App</a>
        </div>

        <ul class="navbar-nav navbar-collapse justify-content-end">
            <li><a style="color: honeydew" href="<%= request.getContextPath() %>/login" class="nav-link">Login</a></li>
            <li><a style="color: honeydew" href="<%= request.getContextPath() %>/register" class="nav-link">Signup</a>
            </li>
        </ul>
    </nav>
</header>
