<%@page import="mg.itu.utilproject.modele.Membres"%>
<%@page import="java.util.List"%>

<!DOCTYPE html>
<html lang="fr">
    <jsp:include page="include/header.jsp"/>
   
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12">
                    <div class="col-lg-2">
                        
                        <label>Mode :<% out.print("wawa"); %></label>
                        <br>
                        <a class="btn btn-primary" style="color: #555;background-color: #eee;border-color: #eee;" href="feuille"><i class="fa fa-table"></i></a>
                        <a class="btn btn-primary" style="color: #555;background-color: #eee;border-color: #eee;" href="gant"><i class="fa fa-tasks"></i></a>
                    </div>
                    <br>
                    <div class="col-lg-10">
                        <div id="gantt_here" style='width:100%; height:400px;'></div>
                    </div>
                </div>

            </div>
        </div>
    <script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/scripts.js"></script>
    <script src="assets/js/fonction.js"></script>
    <script type="text/javascript">
        <% List<String> note=(List<String>)request.getAttribute("json");%>
        var tasks =<% out.print(note.get(0));%>;
        gantt.config.columns = [
            {name: "description", label: "Nom tache", tree: true, width: 150},
            {name: "start_date", label: "Date debut", width: 100, align: "center"},
            {name: "end_date", label: "Date Fin", width: 100, align: "center"},
            {name: "deadlineTache", label: "Deadline", width: 100, align: "center"},
            {name: "duration", label: "Duree", width: 50, align: "center"},
            {name: "add", label: ""}
        ];
        gantt.config.grid_width = 690;
        gantt.config.scale_height = 60;
        gantt.init("gantt_here");
        gantt.parse(tasks);
    </script>
</body>
</html>