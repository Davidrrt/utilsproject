package mg.itu.utilproject.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import mg.itu.utilproject.modele.Feuille;
import mg.itu.utilproject.service.ProjetService;
import mg.itu.utilproject.service.TachesGantService;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author davra
 */
public class GantAction {

    private final static String SUCCESS = "success";
    private final static String FAILURE = "failure";
    private Feuille one;
    private  List<String> json;

    public String execute() {
        try {
            HttpServletRequest request = ServletActionContext.getRequest();
            if ((request.getParameter("id") != null)&&(request.getSession().getAttribute("utilisateur") != null)) {
                ApplicationContext c = new ClassPathXmlApplicationContext("bean.xml");
                ProjetService util = c.getBean(ProjetService.class);
                this.one = util.recupFeuille(Integer.parseInt(request.getParameter("id")));
                TachesGantService wawa=new TachesGantService();
                json=wawa.afficheGant(one.getTaches());
                return SUCCESS;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return FAILURE;
    }

    public Feuille getOne() {
        return one;
    }

    public void setOne(Feuille one) {
        this.one = one;
    }

    public List<String> getJson() {
        return json;
    }

    public void setJson(List<String> json) {
        this.json = json;
    }
}
