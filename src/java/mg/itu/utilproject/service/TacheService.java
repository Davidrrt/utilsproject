package mg.itu.utilproject.service;

import java.util.ArrayList;
import java.util.List;
import mg.itu.utilproject.modele.Taches;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author davra
 */
public class TacheService extends BaseService {

    public TacheService() {

    }

    public List<Taches> recupMere(List<Taches> tab) {
        List<Taches> table = new ArrayList<>();
        for (Taches tab1 : tab) {
            if (tab1.getIdmere() == 0) {
                tab1.setNiveau(0);
                recupZanany(tab1, tab, 0);
                table.add(tab1);
            }
        }
        return table;
    }

    public void recupZanany(Taches tabmere, List<Taches> tabzanany, int niveau) {
        List<Taches> tab = new ArrayList<>();
        for (Taches tabzanany1 : tabzanany) {
            if (tabzanany1.getIdmere() == tabmere.getId()) {
                tabzanany1.setNiveau(niveau + 1);
                recupZanany(tabzanany1, tabzanany, niveau + 1);
                tab.add(tabzanany1);
            }
        }
        tabmere.setSoustache(tab);
    }

    public void decal(Session session, Taches t, int tile, int min) throws Exception {
        this.updateline(session, t, tile, min, 0);
    }

    public int deleteTask(Session session, Taches t, List<Taches> all) throws Exception {
        this.recupZanany(t, all, t.getIdmere());
        int[] val = new int[2];
        val[1] = 0;
        if (t.getSoustache() != null) {
            for (int i = 0; i < t.getSoustache().size(); i++) {
                val[0] = t.getSoustache().get(i).getLigne();
                this.deleteTask(session, t.getSoustache().get(i), all);
                val[1]++;
            }
        }
        this.delete(session, t);
        this.decal(session, t, (-1) * val[1], val[0]);
        return val[1];
    }
    
    public void deleteTask(Taches t, List<Taches> all) throws Exception{
         Session session = null;
        Transaction tr = null;
        try {
            session = getSession().getSessionFactory().openSession();
            tr = session.beginTransaction();
            deleteTask(session,t,all);
             tr.commit();
        } catch (Exception e) {
            if (tr != null) {
                tr.rollback();
            }
            throw e;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public void createTask(Taches t, List<Taches> all) throws Exception {
        Session session = null;
        Transaction tr = null;
        try {
            session = getSession().getSessionFactory().openSession();
            tr = session.beginTransaction();
            this.save(session, t);
            this.decal(session, t, 1, t.getLigne() + 1);
            tr.commit();
        } catch (Exception e) {
            if (tr != null) {
                tr.rollback();
            }
            throw e;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public void moveTask(Taches t, List<Taches> all) throws Exception {
   
    }

    public void updateTask(Taches t) throws Exception {
        this.update(t);
    }

}
