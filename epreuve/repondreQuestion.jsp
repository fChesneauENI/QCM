<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file="../includes/header.jsp" %>
<body>
	<header>
		<%@include file="../includes/menuCandidat.jsp" %>		
	</header>
	<main class="container" style="min-height: 650px">
		<div class="row">
			<section class="col-sm-9">
				<h2>Epreuve: ${epreuve.getLibelle() }</h2>
				<p>Bonjour ${user.getPrenom() } ${user.getNom() }!</p>
			</section>
			<section id="head-q">
				<h2>Question ${question.getNumOrdre() }</h2>
				<br>
				<p>${question.getLibelle() }</p>
			</section>
			<section id="media">
				${question.getMedia() }
			</section id="propositions">
			<section>
				
			</section>
		</div>
	</main>
	<footer class="row" style= "text-align: center">		
		<%@include file="../includes/footer.jsp" %>
	</footer>
</body>
</html>