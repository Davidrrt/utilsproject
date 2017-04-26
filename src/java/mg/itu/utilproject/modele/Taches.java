package mg.itu.utilproject.modele;

import java.util.Date;
import java.util.List;
import mg.itu.utilproject.service.Helper;

public class Taches extends BaseModele {

    private int idprojet;
    private String description;
    private Date dateDebut;
    private Date dateFin;
    private int predecesseur;
    private Date deadlineTache;
    private int idmere;
    private String duree;
    private String css;
    private int niveau;
    private int ligne;
    private List<Taches> soustache;

    public Taches(String description, Date dateDebut, Date dateFin, int predecesseur, Date deadlineTache, int prop) {
        this.description = description;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.predecesseur = predecesseur;
        this.deadlineTache = deadlineTache;
        this.ligne = prop;
    }

    public int getLigne() {
        return ligne;
    }

    public void setLigne(int ligne) {
        this.ligne = ligne;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public String getCss() {
        this.css = "padding-left:" + this.getNiveau() * 40 + "px";
        return css;
    }

    public void setCss(String css) {
        this.css = css;
    }

    public List<Taches> getSoustache() {
        return soustache;
    }

    public void setSoustache(List<Taches> soustache) {
        this.soustache = soustache;
    }

    public int getIdmere() {
        return idmere;
    }

    public void setIdmere(int idmere) {
        this.idmere = idmere;
    }

    public int getIdprojet() {
        return idprojet;
    }

    public void setIdprojet(int idprojet) {
        this.idprojet = idprojet;
    }

    public Taches() {
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

    public Date getDateMin() {
        Helper util = new Helper();
        return util.recupMin(this);
    }

    public Date getDateMax() {
        Helper util = new Helper();
        return util.recupMax(this);
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

    public String getDuree() {
        if (this.getDateMax() != null && this.getDateMin() != null) {
            Long wawa = this.getDateMax().getTime() - this.getDateMin().getTime();
            this.duree = (wawa / 3600 / 1000 / 24) + "";
            return this.duree;
        }
        return this.duree = "undefined";
    }

}
