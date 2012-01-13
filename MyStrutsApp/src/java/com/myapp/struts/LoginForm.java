package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author kostasa
 */
public class LoginForm extends org.apache.struts.action.ActionForm {
    
    private String name;
    private String email;
    private String error; //error message
    private String passphrase;
    private String errorname;
    private String errorphrase;
    private String erroremail;
    private Double shirtRfBqua;
    private Double shirtRfBvalue;
    private Double fiCDqua;
    private Double fiCDvalue;
    private Double budokanqua;
    private Double budokanvalue;
    private Double totalvalue;
    private Double marchqua;
    private Double trilqua;
    private Double eclipsequa;
    private Double casterqua;

    public Double getCasterqua() {
        return casterqua;
    }

    public void setCasterqua(Double casterqua) {
        this.casterqua = casterqua;
    }

    public Double getCastervalue() {
        return castervalue;
    }

    public void setCastervalue(Double castervalue) {
        this.castervalue = castervalue;
    }
    private Double castervalue;

    public Double getEclipsequa() {
        return eclipsequa;
    }

    public void setEclipsequa(Double eclipsequa) {
        this.eclipsequa = eclipsequa;
    }

    public Double getEclipsevalue() {
        return eclipsevalue;
    }

    public void setEclipsevalue(Double eclipsevalue) {
        this.eclipsevalue = eclipsevalue;
    }
    private Double eclipsevalue;

    public Double getTrilqua() {
        return trilqua;
    }

    public void setTrilqua(Double trilqua) {
        this.trilqua = trilqua;
    }

    public Double getTrilvalue() {
        return trilvalue;
    }

    public void setTrilvalue(Double trilvalue) {
        this.trilvalue = trilvalue;
    }
    private Double trilvalue;

    public Double getMarchqua() {
        return marchqua;
    }

    public void setMarchqua(Double marchqua) {
        this.marchqua = marchqua;
    }

    public Double getMarchvalue() {
        return marchvalue;
    }

    public void setMarchvalue(Double marchvalue) {
        this.marchvalue = marchvalue;
    }
    private Double marchvalue;

    public Double getBudokanqua() {
        return budokanqua;
    }

    public void setBudokanqua(Double budokanqua) {
        this.budokanqua = budokanqua;
    }

    public Double getBudokanvalue() {
        return budokanvalue;
    }

    public void setBudokanvalue(Double budokanvalue) {
        this.budokanvalue = budokanvalue;
    }
    

    public Double getFiCDqua() {
        return fiCDqua;
    }

    public void setFiCDqua(Double fiCDqua) {
        this.fiCDqua = fiCDqua;
    }

    public Double getFiCDvalue() {
        return fiCDvalue;
    }

    public void setFiCDvalue(Double fiCDvalue) {
        this.fiCDvalue = fiCDvalue;
    }
    

    public Double getShirtRfBqua() {
        return shirtRfBqua;
    }

    public void setShirtRfBqua(Double shirtRfBqua) {
        this.shirtRfBqua = shirtRfBqua;
    }

    public Double getShirtRfBvalue() {
        return shirtRfBvalue;
    }

    public void setShirtRfBvalue(Double shirtRfBvalue) {
        this.shirtRfBvalue = shirtRfBvalue;
    }
    

    public Double getTotalvalue() {
        return totalvalue;
    }

    public void setTotalvalue(Double totalvalue) {
        this.totalvalue = totalvalue;
    }
      

    public String getErroremail() {
        return erroremail;
    }

    public void setErroremail() {
        this.erroremail = "<span style='color:red'>Please provide a valid email</span>";
    }

    public String getErrorphrase() {
        return errorphrase;
    }

    public void setErrorphrase() {
        this.errorphrase = "<span style='color:red'>Please provide the valid passphrase</span>";
    }
    
    
    public String getErrorname() {
        return errorname;
    }

    public void setErrorname() {
        this.errorname = "<span style='color:red'>Please provide a valid name</span>";
    }
    
    

    public String getPassphrase() {
        return passphrase;
    }

    public void setPassphrase(String passphrase) {
        this.passphrase = passphrase;
    }
    

    public String getError() {
        return error;
    }

    public void setError() {
        this.error =
                "<span style='color:red'>Please provide a valid name</span>";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param string
     */
    public void setName(String string) {
        name = string;
    }

    /**
     *
     */
    public LoginForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getName() == null || getName().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
        }
        return errors;
    }
}
