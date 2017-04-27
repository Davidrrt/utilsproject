package mg.itu.utilproject.controller;

import javax.servlet.http.HttpServletRequest;
import mg.itu.utilproject.form.TaskForm;
import mg.itu.utilproject.modele.Feuille;
import mg.itu.utilproject.modele.Taches;
import mg.itu.utilproject.service.ProjetService;
import mg.itu.utilproject.service.TacheService;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author davra
 */
public class DeleteAction {

    private final static String SUCCESS = "success";
    private final static String FAILURE = "failure";

    public String execute() {
        try {
            HttpServletRequest request = ServletActionContext.getRequest();
            if ((request.getParameter("id") != null) && (request.getSession().getAttribute("utilisateur") != null)) {
                ApplicationContext c = new ClassPathXmlApplicationContext("bean.xml");
                TaskForm utilite = new TaskForm();
                Taches t1 = utilite.recupTask(request);
                TacheService util = c.getBean(TacheService.class);
                ProjetService util1 = c.getBean(ProjetService.class);
                Feuille one = util1.recupFeuille(Integer.parseInt(request.getParameter("id")));
                util.deleteTask(t1,one.getTaches());
                return SUCCESS;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return FAILURE;
    }
}
