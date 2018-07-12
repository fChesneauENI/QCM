<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../includes/header.jsp"%>

<body>
	<header>
		<%@include file="../includes/menuResp.jsp"%>
	</header>
	<main class="container">
	<div class="row">
		<section class="col-sm-9">
			<div class="test">
				<form action="./creerEpreuve" method="post">
					<div class="form-group">
						<label>Liste des candidats</label>
					<select id="user" name="user" class="form-control">
						<c:forEach items="${listeUsers}" var="u">
							<option value="${u}">${u.nom } ${u.prenom }</option>
						</c:forEach>
					</select>
					</div>					
					<div class="form-group">
						<label>Liste des tests</label>
						<select id="test" name="test" class="form-control">
							<c:forEach items="${listeTests}" var="t">
								<option value="${t}">${t.libelle }:
									${t.description}</option>
							</c:forEach>
						</select> 
						</div> 
						<input type="submit" action="post" value="Créer épreuve">
				</form>
			</div>
		</section>
	</div>
	</main>
	<footer class="row" style="text-align: center">
		<%@include file="../includes/footer.jsp"%>
	</footer>
</body>
</html>