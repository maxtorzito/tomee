/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maxtorzito.web1.managedbean;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author maxtorzito
 */
@Named
@RequestScoped
public class Web1IndexMBean implements Serializable{
    
    private String value="Hello from Web1IndexMBean (web 1)";

    public Web1IndexMBean() {
    }
    
    public String login() throws Exception{
       try {
            System.out.println("login.....");
            FacesContext context = FacesContext.getCurrentInstance();
            HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
            request.login("tomee", "tomee");
            System.out.println(">>>>>>>SUCCESS<<<<<<<<<<<<<<<");
            FacesMessage facesMsg = new  FacesMessage("SUCCESS");
            FacesContext.getCurrentInstance().addMessage(null, facesMsg);
        } catch (Exception e) {
            e.printStackTrace();
            FacesMessage facesMsg = new  FacesMessage(e.toString());
            FacesContext.getCurrentInstance().addMessage(null, facesMsg);
        }
       return null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    
    
}
