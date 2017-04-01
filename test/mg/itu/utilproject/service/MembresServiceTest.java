/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu.utilproject.service;

import java.sql.Date;
import mg.itu.utilproject.dao.HibernateDao;
import mg.itu.utilproject.dao.HibernateUtil;
import mg.itu.utilproject.modele.Membres;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Lai Christophe
 */
public class MembresServiceTest {

    public HibernateDao hd = new HibernateDao();

    public MembresServiceTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        hd.setSessionFactory(HibernateUtil.getSessionFactory());
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of enregistrer method, of class MembresService.
     */
    @Test
    public void testEnregistrer() throws Exception {
        System.out.println("enregistrer");
        Membres membre = new Membres( "andri", "ange", "2017-02-02", "test@test.mg", "root");
        MembresService instance = new MembresService(hd);
        instance.enregistrer(membre);
    }

}
