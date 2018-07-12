<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="<%=request.getContextPath()%>/index.jsp">QCM Online</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="<%=request.getContextPath()%>/index.jsp">Home</a></li>
      <li><a href="#">Gérer les épreuves</a></li>
      <li><a href="#">Gérer les candidats</a></li>
      <li><a href="#">Voir les notes</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="<%=request.getContextPath()%>/Login/authentification.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>