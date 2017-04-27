<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page import="mg.itu.utilproject.modele.Membres"%>

<!DOCTYPE html>
<html lang="fr">
   <jsp:include page="include/header.jsp"/>
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12">
                    <div class="col-lg-2">
                        <h1>Feuille</h1>
                        <br>
                 
                    </div>
                    <br>
                    <div class="col-lg-10">
                           <table class="table">
                            <thead>
                                <tr>
                                    <th></th>
                                    <th>Nom Feuille</th>
                                    <th>collaborateur</th>
                                </tr>
                            </thead>
                            <tbody>
                                <s:iterator value="table" var="user">
                                    <tr>
                                        <td><s:property value="#user.id" /></td>
                                        <td><a href="task?id=<s:property value="#user.id" />"><s:property value="#user.nomfeuille" /></a></td>
                                        <td><a href="ressource?id=<s:property value="#user.id" />">voir</a></td>
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
