package mg.itu.utilproject.modele;

import java.util.Date;

public class Projet extends BaseModele {

    private int idmembres;
    private String titreProjet;
    private String descriptionProjet;
    private Date dateDebutPro;
    private Date dateFinPro;
    private Date deadlinePro;

    public Projet(String titreProjet, String descriptionProjet, Date dateDebutPro, Date dateFinPro, Date deadlinePro) {
        this.titreProjet = titreProjet;
        this.descriptionProjet = descriptionProjet;
        this.dateDebutPro = dateDebutPro;
        this.dateFinPro = dateFinPro;
        this.deadlinePro = deadlinePro;
    }

    public Projet() {
    }

    public int getIdmembres() {
        return idmembres;
    }

    public void setIdmembres(int idmembres) {
        this.idmembres = idmembres;
    }

    public String getTitreProjet() {
        return titreProjet;
    }

    public void setTitreProjet(String titreProjet) {
        this.titreProjet = titreProjet;
    }

    public String getDescriptionProjet() {
        return descriptionProjet;
    }

    public void setDescriptionProjet(String descriptionProjet) {
        this.descriptionProjet = descriptionProjet;
    }

    public Date getDateDebutPro() {
        return dateDebutPro;
    }

    public void setDateDebutPro(Date dateDebutPro) {
        this.dateDebutPro = dateDebutPro;
    }

    public Date getDateFinPro() {
        return dateFinPro;
    }

    public void setDateFinPro(Date dateFinPro) {
        this.dateFinPro = dateFinPro;
    }

    public Date getDeadlinePro() {
        return deadlinePro;
    }

    public void setDeadlinePro(Date deadlinePro) {
        this.deadlinePro = deadlinePro;
    }

}
