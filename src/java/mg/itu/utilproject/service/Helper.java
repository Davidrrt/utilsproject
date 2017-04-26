
package mg.itu.utilproject.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import mg.itu.utilproject.modele.Taches;

/**
 *
 * @author davra
 */
public class Helper {
     public String formate(Date dateDebut) throws Exception {
        if (dateDebut == null) {
            dateDebut = new Date();
        }
        SimpleDateFormat sm = new SimpleDateFormat("dd-MM-yyyy");
        String strDate = sm.format(dateDebut);
        return strDate;
    }

    public Date recupMin(Taches one) {
        if (one.getSoustache() == null || one.getSoustache().isEmpty()) {
            return one.getDateDebut();
        }
        Date init = null;
        init = one.getSoustache().get(0).getDateMin();
        for (int i = 1; i < one.getSoustache().size(); i++) {
            if (one.getSoustache().get(i).getDateMin() != null && init.after(one.getSoustache().get(i).getDateMin())) {
                init = one.getSoustache().get(i).getDateMin();
            }
        }
        return init;
    }

    public Date recupMax(Taches one) {
        if (one.getSoustache() == null || one.getSoustache().isEmpty()) {
            return one.getDateFin();
        }
        int j = 0;
        Date init = null;
        init = one.getSoustache().get(0).getDateMax();
        for (int i = 1; i < one.getSoustache().size(); i++) {
            if (init == null) {
                init = one.getSoustache().get(i).getDateMax();
            }
            if (one.getSoustache().get(i).getDateMax() != null && init.before(one.getSoustache().get(i).getDateMax())) {
                init = one.getSoustache().get(i).getDateMax();
            }
        }
        return init;
    }
}
