package mg.itu.utilproject.modele;

public class Services {

    private long idService;
    private java.lang.String nomService;

    public Services(long idService, String nomService) {
        this.idService = idService;
        this.nomService = nomService;
    }

    public long getIdService() {
        return idService;
    }

    public void setIdService(long idService) {
        this.idService = idService;
    }

    public String getNomService() {
        return nomService;
    }

    public void setNomService(String nomService) {
        this.nomService = nomService;
    }

}
