package mg.itu.utilproject.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import mg.itu.utilproject.modele.Ressource;
import mg.itu.utilproject.service.ProjetService;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author davra
 */
public class EtatAction {

    private final static String SUCCESS = "success";
    private final static String FAILURE = "failure";
    private List<Ressource> table;

    public String execute() {
        try {
            HttpServletRequest request = ServletActionContext.getRequest();
            if ((request.getParameter("id") != null)&&(request.getSession().getAttribute("utilisateur") != null))  {
                ApplicationContext c = new ClassPathXmlApplicationContext("bean.xml");
                ProjetService util = c.getBean(ProjetService.class);
                Ressource t = new Ressource();
                t.setId2(Integer.parseInt(request.getParameter("id")));
                table = util.recupRessource(t);
                return SUCCESS;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return FAILURE;
    }

    public List<Ressource> getTable() {
        return table;
    }

    public void setTable(List<Ressource> table) {
        this.table = table;
    }

}
