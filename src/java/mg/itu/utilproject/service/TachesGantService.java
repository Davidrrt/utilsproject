package mg.itu.utilproject.service;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import mg.itu.utilproject.modele.Taches;
import mg.itu.utilproject.modele.TachesGant;

/**
 *
 * @author davra
 */
public class TachesGantService {
    private Helper utilite;

    public TachesGantService() {
        this.utilite = new Helper();
    }
    
     public List<String> afficheGant(List<Taches> tab) throws Exception {
        Gson json = new Gson();
        String wawa = json.toJson(listeToGant(tab));
        String js = wawa.substring(1, wawa.length() - 1);
        List<String> tabl = new ArrayList<>();
        tabl.add("{\"data\":[" + js + "]}");
        return tabl;
    }

    public List<TachesGant> listeToGant(List<Taches> tab) throws Exception {
        List<TachesGant> table = new ArrayList<>();
        for (Taches tab1 : tab) {
            TachesGant val = new TachesGant(tab1.getId(), tab1.getDescription(), utilite.formate(tab1.getDateMin()), utilite.formate(tab1.getDateMax()), utilite.formate(tab1.getDeadlineTache()), tab1.duree(), tab1.getIdmere());
            table.add(val);
        }
        return table;
    }
}
