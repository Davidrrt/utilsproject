<!DOCTYPE HTML>
<html>
<head>
<title>Poses-404 Website Template | Home :: W3layouts</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="www/assets/css/404.css">
</head>
<body>
<div class="wrap">
	<div class="banner">
		<img src="www/assets/images/banner.png" alt="" />
	</div>
	<div class="page">
            <h2>page introuvable!</h2>
            <% if(request.getSession().getAttribute("utilisateur")!=null){%>
             <a href="project">Accueil</a>
            <%}else{ %>
            <a href="index.jsp">Accueil</a>
           
            <% } %>
	</div>
</div>
</body>
</html>
