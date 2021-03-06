package mg.itu.utilproject.service;

import java.util.ArrayList;
import java.util.List;
import mg.itu.utilproject.modele.Feuille;

import mg.itu.utilproject.modele.Projet;
import mg.itu.utilproject.modele.Ressource;
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

    public List<Feuille> getFeuille(Feuille tabl) throws Exception {
        try {
            List<Feuille> tab = (List<Feuille>) this.findAllById(tabl);
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
            liste.setIdprojet(id);
            List<Taches> tab = (List<Taches>) this.findAllById(liste);
            TacheService t = new TacheService();
            one.setTaches(listefinal(t.recupMere(tab)));

        } catch (Exception e) {
            throw e;

        }
        return one;
    }

    public List<Ressource> recupRessource(Ressource one) throws Exception {
        try {
            List<Ressource> tab = (List<Ressource>) this.findAllById(one);
            return tab;
        } catch (Exception e) {
            throw e;
        }
    }

    public void recupRessource(List<Ressource> one) {
        List<Ressource> tab = new ArrayList<>();
        tab.add(one.get(0));
        int j = 0;
        for (int i = 1; i < one.size(); i++) {
            for (j = 0; j < tab.size(); j++) {
                if (one.get(i).getId2() != tab.get(j).getId2()) {
                    tab.add(one.get(i));
                }
            }
            j = 0;
        }
        one = tab;
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
