<%@include file="../includes/header.jsp" %>
<body>
	<header>
		<%@include file="../includes/menu.jsp" %>
	</header>
	<main class="container">
		<div class="row">
			<section class="col-sm-9">
				<h3 style="text-align: center">Authentification</h3>
				<form action="<%=request.getContextPath() %>/Login/authentification" method="post">
				  	<div class="form-group">
				    	<label for="identifiant">Email :</label>
				    	<input type="email" class="form-control" id="identifiant" name="identifiant">
				  	</div>
				  	<div class="form-group">
				    	<label for="motdepasse">Password :</label>
				    	<input type="password" class="form-control" id="motdepasse" name="motdepasse">
				  	</div>
				  	<button type="submit" class="btn btn-default">Connexion</button>
				</form>
				<p class="error" style="color: red">${error}</p>
			</section>
		</div>
	</main>
	<footer class="row" style= "text-align: center">		
		<%@include file="../includes/footer.jsp" %>
	</footer>
</body>
</html>