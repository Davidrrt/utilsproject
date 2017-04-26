package mg.itu.utilproject.service;

import java.util.ArrayList;
import java.util.List;
import mg.itu.utilproject.modele.Feuille;

import mg.itu.utilproject.modele.Projet;
import mg.itu.utilproject.modele.Taches;

/**
 *
 * @author davra
 */
public class ProjetService extends BaseService {

    public List<Projet> getProject(Projet tabl) throws Exception {
        try {
            List<Projet> tab = (List<Projet>) this.findAllById(tabl);
            return tab;
        } catch (Exception e) {
            throw e;
        }
    }
     public Feuille recupFeuille(int id) throws Exception {
        Feuille one = new Feuille();
        one.setId(id);
        Taches liste = new Taches();
        try {
            this.findById(one);
            liste.setId(id);
            List<Taches> tab = (List<Taches>) this.findAllById(liste);
            TacheService t=new TacheService();
            one.setTaches(listefinal(t.recupMere(tab)));

        } catch (Exception e) {
            throw new Exception(e.getMessage());

        }
        return one;
    }
      public List<Taches> listefinal(List<Taches> tab) {
        List<Taches> table = new ArrayList<>();
        for (Taches tab1 : tab) {
            table.add(tab1);
            table.addAll(listefinal(tab1.getSoustache()));
        }
        return table;
    }

}
