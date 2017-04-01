package mg.itu.utilproject.modele;

import java.util.Date;
import java.util.List;

public class Taches {

    private long idTache;
    private String description;
    private Date dateDebut;
    private Date dateFin;
    private int predecesseur;
    private Date deadlineTache;
    private List<Commentaire> commentaire;
    private List<Roles> roles;
    private List<SousTache> sousTache;

    public Taches(long idTache, String description, Date dateDebut, Date dateFin, int predecesseur, Date deadlineTache) {
        this.idTache = idTache;
        this.description = description;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.predecesseur = predecesseur;
        this.deadlineTache = deadlineTache;
    }

    public long getIdTache() {
        return idTache;
    }

    public void setIdTache(long idTache) {
        this.idTache = idTache;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public int getPredecesseur() {
        return predecesseur;
    }

    public void setPredecesseur(int predecesseur) {
        this.predecesseur = predecesseur;
    }

    public Date getDeadlineTache() {
        return deadlineTache;
    }

    public void setDeadlineTache(Date deadlineTache) {
        this.deadlineTache = deadlineTache;
    }

    public List<SousTache> getSousTache() {
        return sousTache;
    }

    public void setSousTache(List<SousTache> sousTache) {
        this.sousTache = sousTache;
    }
    

}
