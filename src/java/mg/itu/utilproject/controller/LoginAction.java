/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu.utilproject.controller;

import javax.servlet.http.HttpServletRequest;
import mg.itu.utilproject.form.ConnexionForm;
import mg.itu.utilproject.modele.Membres;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author davra
 */
public class LoginAction extends org.apache.struts.action.Action {

    private final static String SUCCESS = "success";
    private final static String FAILURE = "failure";
    private Membres human;


    public String execute() throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();
        if (request.getParameter("nom") != null) {
            ConnexionForm loginForm = new ConnexionForm();
            this.human = loginForm.connexionUtilisateur(request);
            return FAILURE;
        } else {
            return SUCCESS;
        }
    }
    
    public Membres getHuman() {
        return human;
    }

    public void setHuman(Membres human) {
        this.human = human;
    }

}
