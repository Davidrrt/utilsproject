package mg.itu.utilproject.modele;


import java.util.*;

public class Commentaire {
   private long idComm;
   private String titreComm;
   private String descriptionComm;

    public Commentaire(long idComm, String titreComm, String descriptionComm) {
        this.idComm = idComm;
        this.titreComm = titreComm;
        this.descriptionComm = descriptionComm;
    }

    public long getIdComm() {
        return idComm;
    }

    public void setIdComm(long idComm) {
        this.idComm = idComm;
    }

    public String getTitreComm() {
        return titreComm;
    }

    public void setTitreComm(String titreComm) {
        this.titreComm = titreComm;
    }

    public String getDescriptionComm() {
        return descriptionComm;
    }

    public void setDescriptionComm(String descriptionComm) {
        this.descriptionComm = descriptionComm;
    }
   
}