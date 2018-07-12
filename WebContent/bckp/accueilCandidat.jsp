<%@include file="includes/header.jsp" %>
<body>
	<header>
		<%@include file="../includes/menuCandidat.jsp" %>
	</header>
	<main class="container">
		<div class="row">
			<section class="col-sm-9">
				<h2>Menu ${user.getProfil().getLibelle() }</h2>
				<p>Bonjour ${user.getPrenom() } ${user.getNom() }!</p>
			</section>
		</div>
	</main>
	<footer class="row" style= "text-align: center">		
		<%@include file="includes/footer.jsp" %>
	</footer>
</body>
</html>