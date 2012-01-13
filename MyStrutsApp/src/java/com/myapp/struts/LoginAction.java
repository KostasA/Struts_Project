/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import javax.servlet.http.Cookie;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author kostasa
 */
public class LoginAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    private final static String FAILURE = "failure";

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        // extract user data
        LoginForm formBean = (LoginForm) form;
        String name = formBean.getName();
        String passphrase = formBean.getPassphrase();
        String email = formBean.getEmail();



        //name validation
        if (name == null || name.equals("")) {
            formBean.setErrorname();
            return mapping.findForward(FAILURE);
        }


        //email validation
        if (email == null || email.indexOf("@") == -1) {   // email lacks '@'
            formBean.setErroremail();
            return mapping.findForward(FAILURE);
        }

        //passphrase validation
        if ((!passphrase.equals("texwww")) && (!passphrase.equals("tExwWw"))) {
            formBean.setErrorphrase();
            return mapping.findForward(FAILURE);
        }


        //dhmiourgw ta cookies (plirofories gia ton xrhsth)
        Cookie userNameCookie = new Cookie("userName", name);
        userNameCookie.setMaxAge(60 * 60 * 60 * 60);
        response.addCookie(userNameCookie);

        Cookie mailCookie = new Cookie("mail", email);
        mailCookie.setMaxAge(60 * 60 * 60 * 60);
        response.addCookie(mailCookie);

        //edwse egkira dedomea ara pigaine ton stin lista me tis agores
        return mapping.findForward(SUCCESS);
    }
}
