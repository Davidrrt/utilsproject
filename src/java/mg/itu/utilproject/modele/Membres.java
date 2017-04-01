package mg.itu.utilproject.modele;

import java.sql.Date;
import java.util.List;
import mg.itu.utilproject.modele.Commentaire;

public class Membres extends BaseModele{

    //private long idMembres;
    public String nomMembres;
    public String prenomMembres;
    public String datenaissance;
    public String mail;
    public String mdp;
    public List<Roles> roles;
    public List<Commentaire> commentaire;
    public List<Projet> projet;

    public Membres( String nomMembres, String prenomMembres, String datenaissance, String mail, String mdp) {
        this.nomMembres = nomMembres;
        this.prenomMembres = prenomMembres;
        this.datenaissance = datenaissance;
        this.mail = mail;
        this.mdp = mdp;
    }

    public String getNomMembres() {
        return nomMembres;
    }

    public void setNomMembres(String nomMembres) {
        this.nomMembres = nomMembres;
    }

    public String getPrenomMembres() {
        return prenomMembres;
    }

    public void setPrenomMembres(String prenomMembres) {
        this.prenomMembres = prenomMembres;
    }

    public String getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(String datenaissance) {
        this.datenaissance = datenaissance;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    
}
