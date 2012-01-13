package com.myapp.struts;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.Cookie;
/**
 *
 * @author konanast
 */
public class CalculateValuesAction extends org.apache.struts.action.Action {

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
        LoginForm formBean = (LoginForm) form;
        
        //gia t-shirt
        Double shirtRfBvalue = formBean.getShirtRfBqua();
        shirtRfBvalue *=30.00;
        formBean.setShirtRfBvalue(shirtRfBvalue);
        
        
        //fire and ice 
        Double fiCDvalue = formBean.getFiCDqua();
        fiCDvalue *=14.09;
        formBean.setFiCDvalue(fiCDvalue);
        
        //gia to budokan live dvd
        Double budokanvalue = formBean.getBudokanqua();
        budokanvalue *=13.49;
        formBean.setBudokanvalue(budokanvalue);
        
        //gia to gia marching out cd
        Double marchvalue = formBean.getMarchqua();
        marchvalue *=9.99;
        formBean.setMarchvalue(marchvalue);
        
        //gia to trilogy
        Double trilvalue = formBean.getTrilqua();
        trilvalue *=9.45;
        formBean.setTrilvalue(trilvalue);
        
        //gia to eclipse
        Double eclipsevalue = formBean.getEclipsequa();
        eclipsevalue *=12.25;
        formBean.setEclipsevalue(eclipsevalue);
        
        //gia kithara stratocaster
        Double castervalue = formBean.getCasterqua();
        castervalue *=2399.99;
        formBean.setCastervalue(castervalue);
        
        Double totalvalue;
        totalvalue = formBean.getShirtRfBvalue() + formBean.getFiCDvalue() + formBean.getBudokanvalue() + formBean.getMarchvalue() + formBean.getTrilvalue() + formBean.getEclipsevalue() + formBean.getCastervalue();
        formBean.setTotalvalue(totalvalue);
        String tot = Double.toString(formBean.getTotalvalue());
        Cookie totalCookie = new Cookie("total", tot);
        totalCookie.setMaxAge(60 * 60 * 60 * 60);
        response.addCookie(totalCookie);
        return mapping.findForward(SUCCESS);
    }
}
