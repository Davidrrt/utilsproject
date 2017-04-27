package mg.itu.utilproject.form;

import javax.servlet.http.HttpServletRequest;
import mg.itu.utilproject.modele.Membres;
import mg.itu.utilproject.service.MembresService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class ConnexionForm {

    private static final String CHAMP_EMAIL = "email";
    private static final String CHAMP_PASS = "motdepasse";

    public Membres connexionUtilisateur(HttpServletRequest request) throws Exception {
        String email = getValeurChamp(request, CHAMP_EMAIL);
        System.out.print("=====================>"+email);
        String motDePasse = getValeurChamp(request, CHAMP_PASS);
        ApplicationContext c = new ClassPathXmlApplicationContext("bean.xml");
        MembresService util = c.getBean(MembresService.class);
        Membres utilisateur = new Membres();
        traiterEmail(email, utilisateur);
        //traiterMotdepasse(motDePasse, utilisateur);
        try {
            utilisateur=(Membres) util.findoneByid(utilisateur);
            System.out.print("=====================>"+utilisateur.getMdp());
            if(utilisateur.getMdp().compareTo(motDePasse)!=0) throw new Exception("erreur");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return utilisateur;
    }

    private void traiterEmail(String email, Membres utilisateur) throws Exception {
        try {
            validationEmail(email);
            utilisateur.setMail(email);
        } catch (Exception e) {
            throw e;
        }

    }

    private void validationEmail(String email) throws Exception {
        if (email != null) {
            if (!email.matches("([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)")) {
                throw new Exception("Merci de saisir une adresse mail valide.");
            }
        } else {
            throw new Exception("Merci de saisir une adresse mail.");
        }
    }

    private static String getValeurChamp(HttpServletRequest request, String nomChamp) {
        String valeur = request.getParameter(nomChamp);
        if (valeur == null || valeur.trim().length() == 0) {
            return null;
        } else {
            return valeur;
        }
    }

}
