/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu.utilproject.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import mg.itu.utilproject.modele.Feuille;
import mg.itu.utilproject.service.ProjetService;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author davra
 */
public class SheetAction {

    private final static String SUCCESS = "success";
    private final static String FAILURE = "failure";
    private List<Feuille> table;

    public String execute() {
        try {
            HttpServletRequest request = ServletActionContext.getRequest();
            if ((request.getParameter("id") != null)&&(request.getSession().getAttribute("utilisateur") != null)) {
                ApplicationContext c = new ClassPathXmlApplicationContext("bean.xml");
                ProjetService util = c.getBean(ProjetService.class);
                Feuille t=new Feuille();
                t.setIdprojet(Integer.parseInt(request.getParameter("id")));
                table=util.getFeuille(t);
                System.out.print("==========================>"+table.get(0).getNomfeuille());
                return SUCCESS;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return FAILURE;
    }

    public List<Feuille> getTable() {
        return table;
    }

    public void setTable(List<Feuille> table) {
        this.table = table;
    }

}
