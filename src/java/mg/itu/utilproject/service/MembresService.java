package mg.itu.utilproject.service;

import mg.itu.utilproject.modele.Membres;

/**
 *
 * @author davra
 */
public class MembresService extends BaseService {

    public MembresService() {

    }

    public void enregistrer(Membres membre) throws Exception {
        try {
            this.save(membre);
        } catch (Exception e) {
            throw e;
        }
    }

}
