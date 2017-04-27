
<%@page import="mg.itu.utilproject.modele.Ressource"%>
<%@page import="java.util.List"%>

<!DOCTYPE html>
<html lang="fr">
   <jsp:include page="include/header.jsp"/>
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12">
                    <div class="col-lg-2">
                        <h1>Collaborateur</h1>
                        <br>
                 
                    </div>
                    <br>
                    <div class="col-lg-10">
                       <% List<Ressource> note = (List<Ressource>) request.getAttribute("table");%>
                       <table class="table">
                           <thead>
                               <tr>
                                   <th>Nom</th>
                                   <th>Prenom</th>
                                   <th>Taches</th>
                               </tr>
                           </thead>
                           <tbody>
                               <% for(int i=0;i<note.size();i++){ %>
                               <tr>
                                   <td><% out.print(note.get(i).getNom()); %></td>
                                   <td><% out.print(note.get(i).getPrenom()); %></td>
                                   <td><a href="single?idcol=<% out.print(note.get(i).getId2()); %>&idpro=<% out.print(request.getParameter("id")); %>">Afficher</a></td>
                               </tr>
                               <%} %>
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
