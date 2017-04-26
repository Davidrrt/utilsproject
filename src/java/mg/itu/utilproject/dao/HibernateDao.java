package mg.itu.utilproject.dao;

import mg.itu.utilproject.modele.BaseModele;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import org.hibernate.criterion.Restrictions;

public class HibernateDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(BaseModele obj) throws Exception {
        Session session = null;
        Transaction tr = null;
        try {
            session = getSessionFactory().openSession();
            tr = session.beginTransaction();
            session.save(obj);
            tr.commit();
        } catch (Exception ex) {
            if (tr != null) {
                tr.rollback();
            }
            throw ex;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public void delete(Session session, BaseModele obj) throws Exception {
        try {
            session.delete(obj);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void save(Session session, BaseModele obj) throws Exception {
        try {
            session.save(obj);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void update(BaseModele obj) throws Exception {
        Session session = null;
        Transaction tr = null;
        try {
            session = getSessionFactory().openSession();
            tr = session.beginTransaction();
            session.update(obj);
            tr.commit();
        } catch (Exception ex) {
            if (tr != null) {
                tr.rollback();
            }
            throw ex;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public void findById(BaseModele obj) throws Exception {
        Session session = null;
        try {
            session = getSessionFactory().openSession();
            session.load(obj, obj.getId());
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public List<BaseModele> findAll(BaseModele obj) throws Exception {
        Session session = null;
        try {
            session = getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(obj.getClass());
            return criteria.list();
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public List<? extends BaseModele> findAllById(BaseModele obj) throws Exception {
        Session session = null;
        try {
            session = getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(obj.getClass());
            //criteria.add(Restrictions.eq(colonne, obj.getId()));
            this.where(criteria, obj);
            return criteria.list();
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public void findOneById(BaseModele obj) throws Exception {
        Session session = null;
        try {
            session = getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(obj.getClass());
            //Criterion rest2 = Restrictions.and(Restrictions.eq(colonne, condition), Restrictions.eq(colonne1, condition1));
            this.where(criteria, obj);
            List<BaseModele> one = criteria.list();
            obj = one.get(0);
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public void updateline(Session session, BaseModele obj, int tile, int min, int max) {
        try {
            String nomTable = obj.getClass().getSimpleName();
            String hqlUpdate = "update " + nomTable + " set ligne =ligne+ :new where ligne >= :min";
            if (max != 0) {
                hqlUpdate = "update " + nomTable + " set ligne =ligne+ :new where ligne >= :min and ligne < :max";
                session.createQuery(hqlUpdate)
                        .setInteger("new", tile)
                        .setInteger("min", min)
                        .setInteger("max", max)
                        .executeUpdate();
            } else {
                session.createQuery(hqlUpdate)
                        .setInteger("new", tile)
                        .setInteger("min", min)
                        .executeUpdate();
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void where(Criteria criteria, BaseModele model) throws Exception {

        Field[] attribue = model.getClass().getDeclaredFields();
        int i = 0;
        for (i = 0; i < attribue.length; i++) {
            String apresGet = attribue[i].getName().substring(0, 1).toUpperCase() + attribue[i].getName().substring(1, attribue[i].getName().length());
            String methode = "get" + apresGet;
            Method m = model.getClass().getMethod(methode, (Class<?>) null);
            Object o = m.invoke(model, (Object) null);
            if (o != null) {
                criteria.add(Restrictions.eq(attribue[i].getName(), o));
            }
        }

    }
}
