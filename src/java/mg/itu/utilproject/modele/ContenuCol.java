package mg.itu.utilproject.modele;

import java.util.*;

public class ContenuCol {

    private long idCcol;
    private String contenu;

    public ContenuCol(long idCcol, String contenu) {
        this.idCcol = idCcol;
        this.contenu = contenu;
    }

    public long getIdCcol() {
        return idCcol;
    }

    public void setIdCcol(long idCcol) {
        this.idCcol = idCcol;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

}
