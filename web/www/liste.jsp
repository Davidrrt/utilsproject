
<%@page import="mg.itu.utilproject.modele.Membres"%>
<%  int val =0;
    try {
        Membres perso = (Membres) session.getAttribute("sessionUtilisateur");
        val = perso.getId();
       // out.print(val);

    } catch (Exception e) {
        response.sendRedirect("login");
    }%>
<!DOCTYPE html>
<html lang="fr">
    <head>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <title>Smart Sheet</title>
        <meta name="generator" content="Bootply" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <link href="assets/css/bootstrap.min.css" rel="stylesheet">
        <link href="assets/css/styles.css" rel="stylesheet">
        <link rel="stylesheet" href="assets/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        <div id="top-nav" class="navbar navbar-inverse navbar-static-top">
            <div class="container-fluid">

                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-left"> 
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown"> <i class="fa fa-cog"></i> Compte </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="deconnexion">Se deconnecter</a>
                                </li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown"> <i class="fa fa-question"></i> Aide </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="#"><i class="fa fa-lightbulb-o"></i> Afficher les astuces ...</a>
                                </li>
                            </ul>
                        </li>
                        <form class="navbar-form navbar-right inline-form">
                            <div class="form-group">
                                <input type="search" class="input-sm form-control" placeholder="Recherche ...">
                                <button type="submit" class="btn btn-primary btn-sm"><i class="fa fa-search"></i></button>
                            </div>
                        </form>
                    </ul>
                    <ul class="nav navbar-nav navbar-right"> 
                        <li><a href="feuille">Back Office</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12">
                    <div class="col-lg-2">
                        <h1>Action</h1>
                        <br>
                 
                    </div>
                    <br>
                    <div class="col-lg-10">
                        <ul>
                            <li><a href="feuille">Afficher tableau des taches</a></li>
                            <li><a href="participant?idpro=<% out.print(request.getParameter("idpro")); %>">Liste des collaborateurs au projets</a></li>
                        </ul>
                    </div>
                </div>

            </div>
        </div>
    </div>
    <script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/scripts.js"></script>
    <script src="assets/js/fonction.js"></script>

</body>
</html>
