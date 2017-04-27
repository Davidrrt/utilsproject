/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu.utilproject.controller;

import java.util.List;
import mg.itu.utilproject.modele.Projet;
import mg.itu.utilproject.service.ProjetService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import javax.servlet.http.HttpServletRequest;
import mg.itu.utilproject.modele.Membres;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author davra
 */
public class ProjectAction {

    private final static String SUCCESS = "success";
    private final static String FAILURE = "failure";
    private List<Projet> table;

    public String execute() {
        try {
            HttpServletRequest request = ServletActionContext.getRequest();
            if (request.getSession().getAttribute("utilisateur") != null) {
                Membres pers=(Membres)request.getSession().getAttribute("utilisateur");
                System.out.print("personne==============================>"+pers.getId());
                ApplicationContext c = new ClassPathXmlApplicationContext("bean.xml");
                ProjetService util = c.getBean(ProjetService.class);
                Projet t = new Projet();
                t.setIdmembres((int) pers.getId());
                this.table = util.getProject(t);
                System.out.print("wawawa==============================>"+this.table.get(0).getTitreProjet());
                return SUCCESS;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return FAILURE;
    }

    public List<Projet> getTable() {
        return table;
    }

    public void setTable(List<Projet> table) {
        this.table = table;
    }

}
