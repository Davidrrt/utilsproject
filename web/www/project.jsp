<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="fr">
    <jsp:include page="include/header.jsp"/>
  
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12">
                    <div class="col-lg-2">
                        <h1>Projet </h1>
                        <br>

                    </div>
                    <br>
                    <div class="col-lg-10">
                        <a class="btn btn-success" href="insert"><i class="fa fa-plus"></i> Nouveau projet</a>
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>titre projet</th>
                                    <th>description projet</th>
                                    <th>date debut</th>
                                    <th>deadline</th>
                                </tr>
                            </thead>
                            <tbody>
                                <s:iterator value="table" var="user">
                                    <tr>
                                        <td><a href="sheet?id=<s:property value="#user.id"/>"><s:property value="#user.titreProjet"/></a></td>
                                        <td><s:property value="#user.descriptionProjet"/></td>
                                        <td><s:property value="#user.dateDebutPro"/></td>
                                        <td><s:property value="#user.deadlinePro"/></td>
                                    </tr>
                                </s:iterator>
                            </tbody>
                        </table>
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
