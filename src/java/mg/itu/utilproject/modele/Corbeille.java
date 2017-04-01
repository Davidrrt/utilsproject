package mg.itu.utilproject.modele;

public class Corbeille {

    private long idCorbeille;
    private Projet projet;

    public Corbeille(long idCorbeille) {
        this.idCorbeille = idCorbeille;
    }

    public long getIdCorbeille() {
        return idCorbeille;
    }

    public void setIdCorbeille(long idCorbeille) {
        this.idCorbeille = idCorbeille;
    }

}
