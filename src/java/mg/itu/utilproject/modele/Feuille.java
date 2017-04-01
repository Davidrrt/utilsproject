package mg.itu.utilproject.modele;

public class Feuille {

    private long idfeuille;
    private String nomfeuille;
    private String typefeuille;

    public Feuille(long idfeuille, String nomfeuille, String typefeuille) {
        this.idfeuille = idfeuille;
        this.nomfeuille = nomfeuille;
        this.typefeuille = typefeuille;
    }

    public long getIdfeuille() {
        return idfeuille;
    }

    public void setIdfeuille(long idfeuille) {
        this.idfeuille = idfeuille;
    }

    public String getNomfeuille() {
        return nomfeuille;
    }

    public void setNomfeuille(String nomfeuille) {
        this.nomfeuille = nomfeuille;
    }

    public String getTypefeuille() {
        return typefeuille;
    }

    public void setTypefeuille(String typefeuille) {
        this.typefeuille = typefeuille;
    }

}
