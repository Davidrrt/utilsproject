
<%@page import="mg.itu.utilproject.modele.Taches"%>
<%@page import="java.util.List"%>
<%@page import="mg.itu.utilproject.modele.Membres"%>
<%  int val = 0;
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
        <link href="assets/css/style1.css" rel="stylesheet">
        <style>
            body{
                background-color:#FFF;
            }
        </style>
        <link href="assets/css/style-responsive.css" rel="stylesheet">
        <script src="assets/js/chart-master/Chart.js"></script>
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
                        <% Membres info = (Membres) request.getAttribute("info");%>
                        <h1>Info collaborateur</h1>
                        <br>
                        <div class="form-inline">
                            <label>Nom:</label>
                            <p><% out.print(info.getNomMembres()); %></p>
                        </div>
                        <div class="form-inline">
                            <label>Prenom:</label>
                            <p><% out.print(info.getPrenomMembres()); %></p>
                        </div>
                        <div class="form-inline">
                            <label>Date de naissance:</label>
                            <p><% out.print(info.getDatenaissance()); %></p>
                        </div>
                        <div class="form-inline">
                            <label>Mail:</label>
                            <p><% out.print(info.getMail()); %></p>
                        </div>
                    </div>
                        
                    <br>

                    <div class="col-lg-10">
                        <div class="row ">
                            <div class="border-head">
                                <h3>Avancement du projet en Pourcentage</h3>
                            </div>
                            <div class="custom-bar-chart">
                                <ul class="y-axis">
                                    <li><span>100</span></li>
                                    <li><span>80</span></li>
                                    <li><span>60</span></li>
                                    <li><span>40</span></li>
                                    <li><span>20</span></li>
                                    <li><span>0</span></li>
                                </ul>
                                <% List<Taches> note = (List<Taches>) request.getAttribute("sheet");%>
                                   <% for (int j = 0; j < note.size(); j++) { %>
                                <div class="bar">
                                    <div class="title"><% out.print(note.get(j).getDescription()); %></div>
                                    <div class="value tooltips" data-original-title="<% out.print(note.get(j).getDuree()); %>%" data-toggle="tooltip" data-placement="top"><% out.print(note.get(j).getDuree()); %>%</div>
                                </div>
                                <% } %>
                                
                            </div>
                        </div>
                        <div class="row">
                        <h2>Listes de tout ses taches :</h2>
                        
                        <table class="table table-striped"> 

                            <thead> 
                                <tr> 
                                    <th>Taches</th> 
                                    <th>Date Début</th> 
                                    <th>Date Fin</th>
                                    <th>Deadline</th> 
                                    <th>durée en jour</th>
                                </tr> 
                            </thead> 
                            <tbody>
                                <% for (int i = 0; i < note.size(); i++) { %>
                                <tr>
                                    <td><% out.print(note.get(i).getDescription()); %></td>
                                    <td><%out.print(note.get(i).getDateDebut()); %></td>
                                    <td><% out.print(note.get(i).getDateFin()); %></td>
                                    <td><% out.print(note.get(i).getDeadlineTache()); %></td>
                                    <td><% out.print(note.get(i).getDuree()); %></td>
                                </tr>
                                <% }%>
                            </tbody>
                        </table>
                    </div>
                </div>

            </div>
        </div>
 
     <script src="assets/js/jquery.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/scripts.js"></script>
    <script src="assets/js/fonction.js"></script>
    
    <script src="assets/js/jquery.scrollTo.min.js"></script>
    <script src="assets/js/jquery.nicescroll.js" type="text/javascript"></script>
    <script src="assets/js/common-scripts.js"></script>
    <script type="text/javascript" src="assets/js/gritter/js/jquery.gritter.js"></script>
    <script type="text/javascript" src="assets/js/gritter-conf.js"></script>

</body>
</html>
