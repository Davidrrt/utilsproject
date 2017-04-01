/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu.utilproject.service;

import mg.itu.utilproject.dao.HibernateDao;
import mg.itu.utilproject.dao.HibernateUtil;
import mg.itu.utilproject.modele.Employee;
import mg.itu.utilproject.modele.Membres;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Lai Christophe
 */
public class MembresService {
    private HibernateUtil conn;
    private HibernateDao session;
    
    public MembresService(HibernateDao sess){
        this.session= sess;
    }
    public void enregistrer(Membres membre) throws Exception{
        conn = new HibernateUtil();
        try {
            session.getSessionFactory().openSession();
            session.save(membre);
        } catch (Exception e) {
          //  throw new Exception(e.getMessage());
          e.printStackTrace();
        }
    }
}
