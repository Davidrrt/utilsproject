<%@page import="mg.itu.utilproject.modele.Membres"%>
<%@page import="mg.itu.utilproject.modele.Feuille"%>

<!DOCTYPE html>
<html lang="fr">
    <jsp:include page="include/header.jsp"/>
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-12">
                <div class="col-lg-2">
                    <label>Mode :</label>
                    <br>
                    <a class="btn btn-primary" style="color: #555;background-color: #eee;border-color: #eee;" href="feuille"><i class="fa fa-table"></i></a>
                    <a class="btn btn-primary" style="color: #555;background-color: #eee;border-color: #eee;" href="gantt?id=<% out.print(request.getParameter("id")); %>"><i class="fa fa-tasks"></i></a>
                </div>
                <br>
                <div class="col-lg-10">
                    <a class="btn btn-success" href="insert"><i class="fa fa-plus"></i>  Ajouter une tache</a>
                    <% Feuille note = (Feuille) request.getAttribute("one");%>
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
                                <td><% out.print(i + 1); %></td>
                                <td style="<% out.print(note.getTaches().get(i).getCss()); %>"><i class="fa fa-anchor"></i><% out.print(note.getTaches().get(i).getDescription()); %></td>
                                <td><% out.print(note.getTaches().get(i).getDateMin()); %></td>
                                <td><% out.print(note.getTaches().get(i).getDateMax()); %></td> 
                                <td><% out.print(note.getTaches().get(i).getDeadlineTache()); %> </td>
                                <td><% out.print(note.getTaches().get(i).duree());%></td>
                                <td><a href="insert?id=<% out.print(request.getParameter("id"));%>&id1=<% out.print(i + 1); %>" class="btn btn-primary"><i class="fa fa-edit"></i></a>
                                    <button name="btn" style="margin-left: 4px;" class="btn btn-success"><i class="fa fa-plus"></i></button>
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
    <script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/scripts.js"></script>
    <script src="assets/js/fonction.js"></script>

</body>
</html>