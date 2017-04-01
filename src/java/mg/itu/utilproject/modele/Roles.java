package mg.itu.utilproject.modele;

import java.util.*;

public class Roles {

    private long idNom;
    private String nomRole;
    private List<Taches> taches;

    public Roles(long idNom, String nomRole) {
        this.idNom = idNom;
        this.nomRole = nomRole;
    }

    public long getIdNom() {
        return idNom;
    }

    public void setIdNom(long idNom) {
        this.idNom = idNom;
    }

    public String getNomRole() {
        return nomRole;
    }

    public void setNomRole(String nomRole) {
        this.nomRole = nomRole;
    }
}
