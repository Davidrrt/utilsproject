package mg.itu.utilproject.modele;

import java.util.Date;
import java.util.List;
import mg.itu.utilproject.modele.Colonnes;
import mg.itu.utilproject.modele.Corbeille;

public class Projet {

    private long idProjet;
    private String titreProjet;
    private String descriptionProjet;
    private Date dateDebutPro;
    private Date dateFinPro;
    private Date deadlinePro;
    private List<Taches> taches;
    private List<Services> services;
    private List<Corbeille> corbeille;
    private List<Feuille> feuille;
    private List<Colonnes> colonnes;

    public Projet(long idProjet, String titreProjet, String descriptionProjet, Date dateDebutPro, Date dateFinPro, Date deadlinePro) {
        this.idProjet = idProjet;
        this.titreProjet = titreProjet;
        this.descriptionProjet = descriptionProjet;
        this.dateDebutPro = dateDebutPro;
        this.dateFinPro = dateFinPro;
        this.deadlinePro = deadlinePro;
    }

    public long getIdProjet() {
        return idProjet;
    }

    public void setIdProjet(long idProjet) {
        this.idProjet = idProjet;
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
