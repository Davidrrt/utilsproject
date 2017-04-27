package mg.itu.utilproject.form;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import mg.itu.utilproject.modele.Taches;

/**
 *
 * @author davra
 */
public class TaskForm {

    private static final String CHAMP_IDPROJET = "idprojet";
    private static final String CHAMP_DESCRIPTION = "description";
    private static final String CHAMP_DATEDEBUT = "datedebut";
    private static final String CHAMP_DATEFIN = "datefin";
    private static final String CHAMP_DEADLINETACHE = "deadlinetache";
    private static final String CHAMP_IDMERE = "idmere";
    private static final String CHAMP_NIVEAU = "niveau";
    private static final String CHAMP_LIGNE = "ligne";

    public Taches recupTask(HttpServletRequest request) throws Exception {
        int idprojet = Integer.parseInt(getValeurChamp(request, CHAMP_IDPROJET));
        String description = getValeurChamp(request, CHAMP_DESCRIPTION);
        Date datedebut = new Date(getValeurChamp(request, CHAMP_DATEDEBUT));
        Date datefin = new Date(getValeurChamp(request, CHAMP_DATEFIN));
        Date deadline = new Date(getValeurChamp(request, CHAMP_DEADLINETACHE));
        int idmere = Integer.parseInt(getValeurChamp(request, CHAMP_IDMERE));
        int niveau = Integer.parseInt(getValeurChamp(request, CHAMP_NIVEAU));
        int ligne = Integer.parseInt(getValeurChamp(request, CHAMP_LIGNE));
        testDate(datedebut,datefin);
        Taches t=new Taches(description, datedebut, niveau, datefin, deadline, ligne);
        t.setIdprojet(idprojet);
        t.setIdmere(idmere);
        return t;
    }
    
    public void testDate(Date debut,Date fin) throws Exception{
        try{
            
        }catch(Exception e){
            throw new Exception("date invalide");
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
