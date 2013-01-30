/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maxtorzito.web1;


import java.io.Serializable;
import javax.inject.Named;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author maxtorzito
 */
@Named
@SessionScoped
public class SessionScopedWeb1 implements Serializable{
    
    private String sesionValue="THIS IS THE VALUE OF THE SESSION SCOPED WEB 1 (one)";

    public SessionScopedWeb1() {
    }

    public String getSesionValue() {
        return sesionValue;
    }

    public void setSesionValue(String sesionValue) {
        this.sesionValue = sesionValue;
    }
    
    
    
}
