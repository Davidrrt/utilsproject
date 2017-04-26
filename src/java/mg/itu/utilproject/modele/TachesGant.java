/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu.utilproject.modele;

/**
 *
 * @author davra
 */
public class TachesGant {

    private int id;
    private String description;
    private String start_date;
    private String end_date;
    private String deadlineTache;
    private int duration;
    private int parent;

    public TachesGant(int id, String description, String dateDebut, String dateFin, String deadlineTache, String duree, int parent) {
        this.id = id;
        this.description = description;
        this.start_date = dateDebut;
        this.end_date = dateFin;
        this.deadlineTache = deadlineTache;
        setDuration(duree);
        this.parent = parent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuration() {
        return duration;
    }

    public String getDateDebut() {
        return start_date;
    }

    public void setDateDebut(String dateDebut) {
        this.start_date = dateDebut;
    }

    public String getDateFin() {
        return end_date;
    }

    public void setDateFin(String dateFin) {
        this.end_date = dateFin;
    }

    public void setDuration(String duree) {
        if (duree.compareTo("undefined") != 0) {
            this.duration = Integer.parseInt(duree);
        }
        this.duration = 10;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeadlineTache() {
        return deadlineTache;
    }

    public void setDeadlineTache(String deadlineTache) {
        this.deadlineTache = deadlineTache;
    }

    public int getParent() {
        return parent;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }

}
