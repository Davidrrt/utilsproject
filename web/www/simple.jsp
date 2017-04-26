<%@page import="mg.itu.utilproject.modele.Membres"%>
<%@page import="mg.itu.utilproject.modele.Feuille"%>
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
                        <label>Mode :</label>
                        <br>
                        <a class="btn btn-primary" style="color: #555;background-color: #eee;border-color: #eee;" href="feuille"><i class="fa fa-table"></i></a>
                        <a class="btn btn-primary" style="color: #555;background-color: #eee;border-color: #eee;" href="gant"><i class="fa fa-tasks"></i></a>
                    </div>
                    <br>
                    <div class="col-lg-10">
                        <a class="btn btn-success" href="insert"><i class="fa fa-plus"></i>  Ajouter une tache</a>
                        <% Feuille note = (Feuille) request.getAttribute("sheet");%>
                        <table class="table table-striped"> 

                            <thead> 
                                <tr> 
                                    <td></td>
                                    <td>Taches</td> 
                                    <td>Date Début</td> 
                                    <td>Date Fin</td>
                                    <td>Deadline</td> 
                                    <td>durée en jour</td>
                                    <td>action</td>
                                </tr> 
                            </thead> 
                            <tbody>
                                <%for (int i = 0; i < note.getTaches().size(); i++) { %>
                                <tr>
                                    <td><% out.print(i+1); %></td>
                                    <td style="<% out.print(note.getTaches().get(i).getCss()); %>"><% out.print(note.getTaches().get(i).getDescription()); %></td>
                                    <td><% out.print(note.getTaches().get(i).getDateMin()); %></td>
                                    <td><% out.print(note.getTaches().get(i).getDateMax()); %></td> 
                                    <td><% out.print(note.getTaches().get(i).getDeadlineTache()); %> </td>
                                    <td><% out.print(note.getTaches().get(i).getDuree());%></td>
                                    <td><button name="btn" class="btn btn-primary"><i class="fa fa-edit"></i></button>
                                    <button name="btn" class="btn btn-danger"><i class="fa fa-close"></i></button>
                                    </td>
                                </tr>
                                <%}%>
                            </tbody>
                        </table>
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