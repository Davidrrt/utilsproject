package mg.itu.utilproject.modele;

import java.io.Serializable;
import java.util.Date;

public class Membres extends BaseModele implements Serializable {

    private String nomMembres;
    private String prenomMembres;
    private Date datenaissance;
    private String mail;
    private String mdp;

    public Membres() {
    }

    public Membres(String nomMembrs, String prenomMembrs, Date datenaissanc, String mai, String md) {
        this.nomMembres = nomMembrs;
        this.prenomMembres = prenomMembrs;
        this.datenaissance = datenaissanc;
        this.mail = mai;
        this.mdp = md;
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

    public Date getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(Date datenaissance) {
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
