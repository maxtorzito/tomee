/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maxtorzito.web2.managedbean;

import java.io.Serializable;
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
public class Web2IndexMBean implements Serializable {

    private String value = "Hello from Web2IndexMBean";

    public Web2IndexMBean() {
    }

    public String login() {
        try {
            System.out.println("login.....");
            FacesContext context = FacesContext.getCurrentInstance();
            HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
            request.login("tomee", "tomee");
            System.out.println(">>>>>>>SUCESS<<<<<<<<<<<<<<<");
        } catch (Exception e) {
            e.printStackTrace();
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
