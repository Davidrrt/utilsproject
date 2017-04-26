package mg.itu.utilproject.modele;

import java.util.List;

public class Feuille extends BaseModele{

    private int idprojet;
    private String nomfeuille;
    private String typefeuille;
    private List<Taches> taches;


    public Feuille(int idproj,String nomfeuille, String typefeuille) {
        this.idprojet=idproj;
        this.nomfeuille = nomfeuille;
        this.typefeuille = typefeuille;
    }

    public Feuille() {
    }

    public int getIdprojet() {
        return idprojet;
    }

    public void setIdprojet(int idprojet) {
        this.idprojet = idprojet;
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

    public List<Taches> getTaches() {
        return taches;
    }

    public void setTaches(List<Taches> tachs) {
        this.taches = tachs;
    }
}
