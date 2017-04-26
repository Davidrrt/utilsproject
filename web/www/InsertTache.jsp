<%@page import="mg.itu.utilproject.modele.Membres"%>
<%@page import="java.util.List"%>
<%  int val = 0;
    try {
        Membres perso = (Membres) session.getAttribute("sessionUtilisateur");
        val = perso.getId();
        //out.print(perso.getNomMembres());

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
        <script src="assets/js/dhtmlxgantt.js" type="text/javascript" charset="utf-8"></script>
        <link rel="stylesheet" href="assets/css/dhtmlxgantt.css" type="text/css" media="screen" title="no title" charset="utf-8">
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
                        <li><a href="feuille"> Back Office</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12">
                    <br>
                    <div class="col-lg-offset-2 col-lg-6">
                        <form method="POST" action="insert">
                            <div class="row">
                                <div class="form-group">
                                    <label>description Tache :</label>
                                    <input class="form-control" placeholder="nom tache" name="nom" type="text"  required="">                                
                                </div>
                                <div class="form-group">
                                    <label>date de début</label>
                                    <input class="form-control" placeholder="date de debut" name="datedebut" type="date"  required="">                                
                                </div>
                                <div class="form-group">
                                    <label>date de Fin</label>
                                    <input class="form-control" placeholder="date de fin" name="datefin" type="date"  required="">                                
                                </div>
                                <div class="form-group">
                                    <label>deadline</label>
                                    <input class="form-control" placeholder="date limite" name="deadline" type="date"  required="">                                
                                </div>
                                <div class="form-group">
                                    <label>tache</label>
                                    <select name="tache" class="form-control">
                                        <option>wawa</option>
                                    </select>                               
                                </div>
                                  <div class="form-group">
                                      <input type="submit" class="btn btn-primary" value="enregistrer">                           
                                </div>
                            </div>
                        </form>
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