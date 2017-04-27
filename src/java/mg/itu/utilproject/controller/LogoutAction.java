/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.itu.utilproject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author davra
 */
public class LogoutAction {

    private final static String SUCCESS = "success";
    private final static String FAILURE = "failure";
    public String ATT_SESSION_USER = "utilisateur";

    public String execute() throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();
        if (request.getSession().getAttribute("utilisateur") != null) {
            HttpSession session = request.getSession();
            session.invalidate();
            return SUCCESS;
        } else {
            return FAILURE;
        }
    }
}
