/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maxtorzito.web2;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author maxtorzito
 */
@Named(value = "sessionScopedWeb2")
@SessionScoped
public class SessionScopedWeb2 implements Serializable {

    private String sesionValue = "THIS IS THE VALUE OF THE SESSION SCOPED WEB 2 (two)";

    public SessionScopedWeb2() {
    }

    public String getSesionValue() {
        return sesionValue;
    }

    public void setSesionValue(String sesionValue) {
        this.sesionValue = sesionValue;
    }
}
