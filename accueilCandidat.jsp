<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file="includes/header.jsp" %>
<body>
	<header>
		<c:choose>
			<c:when test="${user.getProfil().getLibelle()==\"candidat\"}" >
				<%@include file="../includes/menuCandidat.jsp" %>
			</c:when>
			<c:when test="${user.getProfil().getLibelle()==\"responsable\"}" >
				<%@include file="../includes/menuResp.jsp" %>
			</c:when>
			<c:when test="${user.getProfil().getLibelle()==\"administrateur\"}" >
				<%@include file="../includes/menu.jsp" %>
			</c:when>
		</c:choose>
		
	</header>
	<main class="container" style="min-height: 650px">
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