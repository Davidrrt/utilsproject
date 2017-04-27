<!DOCTYPE html>
<html lang="fr">
 <jsp:include page="include/header1.jsp"/>
  <body>
	  <div id="login-page">
	  	<div class="container">
	  	
                    <form class="form-login" method="POST" action="login">
		        <h2 class="form-login-heading">se connecter</h2>
		        <div class="login-wrap">
		            <input type="text" class="form-control" placeholder="User ID" name="email" value="gageava@nequevenaitis.org">
		            <br>
		            <input type="password" class="form-control" placeholder="Password" name="motdepasse" value="120990">
		       
		            <button class="btn btn-theme btn-block" type="submit"><i class="fa fa-lock"></i>connexion</button>
		            <hr>
                        </div>
		      </form>	  	
	  	
	  	</div>
	  </div>
    <script src="assets/js/jquery.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
  </body>
</html>

