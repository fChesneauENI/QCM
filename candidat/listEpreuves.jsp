<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file="../includes/header.jsp" %>
<body>
	<header>
		<%@include file="../includes/menuCandidat.jsp" %>		
	</header>
	<main class="container" style="min-height: 650px">
		<div class="row">
			<section class="col-sm-9">
				<h2>Menu ${user.getProfil().getLibelle() }</h2>
				<p>Bonjour ${user.getPrenom() } ${user.getNom() }!</p>
			</section>
			<section>
				<h2>Mes épreuves</h2>
				<ul>
					<c:forEach var="rs" items="${rs}">
						<li>
							<h3>${e.libelle}</h3>
							<p>Description: ${rs.description}</p>
							<p>
								Inscription valide du 
								<fmt:formatDate value='${rs.debut}' pattern="dd-MM-yyyy" />
							 au 
								<fmt:formatDate value='${rs.fin}' pattern="dd-MM-yyyy" />
							</p>
							<p>nombre de questions: ${rs.nbQuestions}</p>
							<p>durée du test: ${rs.duree}</p>
						</li>
					</c:forEach>
				</ul>
			</section>
		</div>
	</main>
	<footer class="row" style= "text-align: center">		
		<%@include file="../includes/footer.jsp" %>
	</footer>
</body>
</html>