<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <title>Back-Office | <?php echo $_SESSION['nomjournaliste']; ?></title>
        <meta name="generator" content="Bootply" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <link href="assets/css/bootstrap.min.css" rel="stylesheet">
        <link href="assets/css/styles.css" rel="stylesheet">
        <link rel="stylesheet" href="assets/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        <!-- header -->
        <div id="top-nav" class="navbar navbar-inverse navbar-static-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">Back Office |</a>
                </div>
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right">           
                        <li><a href="deconnexion.php"><i class="fa fa-sign-out"></i> Se deconnecter</a></li>
                    </ul>
                </div>
            </div>
            <!-- /container -->
        </div>
        <!-- /Header -->

        <!-- Main -->
        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-2">
                    <!-- Left column -->
                    <a href="#"><strong><i class="fa fa-users"></i> Journaliste</strong></a>

                    <hr>

                    <ul class="nav nav-stacked">

                        <li class="active"> <a href="crudJournaliste.php"><i class="fa fa-spinner"></i> Crud Journaliste <span class="badge badge-info"></span></a></li>


                    </ul>

                    <hr>

                    <a href="#"><strong><i class="fa fa-area-chart"></i> Article</strong></a>

                    <hr>

                    <ul class="nav nav-pills nav-stacked">
                        <li><a href="#"><i class="fa fa-heart-o"></i> A la Une</a></li>
                        <li><a href="redigerArticle.php"><i class="fa fa-pencil-square-o"></i> Rediger Article</a></li>
                        <li><a href="listeArticle.php"><i class="fa fa-list-ul"></i> Liste Article</a></li>

                    </ul>

                    <hr>


                </div>
                <!-- /col-3 -->
                <div class="col-sm-9">

                    <!-- column 2 -->

                    <a href="#"><strong><i class="fa fa-user-plus"></i> Liste Journaliste</strong></a>
                    <hr>

                    <div class="row">
                        <!-- center left-->

                        <!--/col-->
                        <div class="col-md-12">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h4>Liste Journaliste non Supprimer</h4></div>
                                <div class="panel-body">
                                    <div class="table-responsive">
                                        <form method="post" action="">
                                            <input type="text" class="hidden" value="<input type='text'class='form-control'>" name="titre" id="titre" />
                                            <input type="text" name="auteur" id="auteur" />
                                            <input type="button" onclick="ajouterLigne();" value="Enregistrer"/>
                                            <input type="button" onclick="SuppimerDernierLigne();" value="Supprimer Derniere Ligne"/>
                                        </form>
                                        <table class="table table-striped" id="tableau">
                                            <thead>
                                                <tr>
                                                    <th>Titre</th>
                                                    <th>Auteur</th>
                                                    <th>Jour</th>
                                                    <th>Mois</th>
                                                    <th>Année</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                                <!--/panel-->
                                <!--/panel-->
                            </div>
                            <!--/col-span-6-->
                        </div>
                       <!--/col-span-6-->
                    </div>
                    <!--/row-->
                </div>
                <!--/col-span-9-->
            </div>
        </div>
        <!-- /Main -->
        <!-- /.modal -->
        <!-- script references -->
        <script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
        <script src="assets/js/bootstrap.min.js"></script>
        <script src="assets/js/scripts.js"></script>
        <script src="assets/js/fonction.js"></script>
    </body>
</html>