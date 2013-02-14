/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maxtorzito.web1.managedbean;

import com.maxtorzito.resources.model.User;
import java.io.Serializable;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
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
    private User userSelected;

    public Web1IndexMBean() {
    }
    
    public void printSelectedUser(ActionEvent event){
        System.out.println(userSelected!=null ? userSelected.toString() : "USER SELECTED IS NULL");
    }
    
    public String login() throws Exception{
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
