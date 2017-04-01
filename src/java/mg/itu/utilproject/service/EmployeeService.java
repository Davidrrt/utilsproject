/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu.utilproject.service;

import mg.itu.utilproject.dao.HibernateDao;
import mg.itu.utilproject.dao.HibernateUtil;
import mg.itu.utilproject.modele.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Lai Christophe
 */
public class EmployeeService {
    private HibernateUtil conn;
    private HibernateDao session;
    
    public EmployeeService(HibernateDao sess){
        this.session= sess;
    }
    public void enregistrer(Employee emp) throws Exception{
        conn = new HibernateUtil();
        try {
            session.getSessionFactory().openSession();
            session.save(emp);
        } catch (Exception e) {
          //  throw new Exception(e.getMessage());
          e.printStackTrace();
        }
    }
}
