package mg.itu.utilproject.modele;


import java.util.*;

public class Colonnes {

    private long idColonne;
    private String typeColonne;
    private int feuilleId;
    private String contenuid;
    private List<ContenuCol> contenuCol;

    public Colonnes(long idColonne, String typeColonne, int feuilleId, String contenuid) {
        this.idColonne = idColonne;
        this.typeColonne = typeColonne;
        this.feuilleId = feuilleId;
        this.contenuid = contenuid;
    }

    public long getIdColonne() {
        return idColonne;
    }

    public void setIdColonne(long idColonne) {
        this.idColonne = idColonne;
    }

    public String getTypeColonne() {
        return typeColonne;
    }

    public void setTypeColonne(String typeColonne) {
        this.typeColonne = typeColonne;
    }

    public int getFeuilleId() {
        return feuilleId;
    }

    public void setFeuilleId(int feuilleId) {
        this.feuilleId = feuilleId;
    }

    public String getContenuid() {
        return contenuid;
    }

    public void setContenuid(String contenuid) {
        this.contenuid = contenuid;
    }
    
}
