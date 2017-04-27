package mg.itu.utilproject.service;

import java.util.List;
import mg.itu.utilproject.dao.HibernateDao;
import mg.itu.utilproject.modele.BaseModele;
import org.hibernate.Session;

/**
 *
 * @author davra
 */
public class BaseService {

    private HibernateDao session;

    public void save(BaseModele obj) throws Exception {
        session.save(obj);
    }

    public void save(Session ses, BaseModele obj) throws Exception {
        session.save(ses, obj);
    }

    public void update(BaseModele obj) throws Exception {
        session.update(obj);
    }

    public void updateline(Session ses, BaseModele obj, int tile, int min, int max) throws Exception {
        session.updateline(ses, obj, tile, min, max);
    }

    public void findById(BaseModele obj) throws Exception {
        session.findById(obj);
    }

    public List<? extends BaseModele> findAll(BaseModele obj) throws Exception {
        return session.findAll(obj);
    }

    public List<? extends BaseModele> findAllById(BaseModele obj) throws Exception {
        return session.findAllById(obj);
    }

    public BaseModele findoneByid(BaseModele obj) throws Exception {
      return  session.findOneById(obj);
    }
    public void delete(Session ses, BaseModele obj) throws Exception {
        session.delete(ses, obj);
    }

    public HibernateDao getSession() {
        return session;
    }

    public void setSession(HibernateDao session) {
        this.session = session;
    }
}
