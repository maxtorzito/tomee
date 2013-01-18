package com.maxtorzito.web1;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class MyEJBBean {

    @PersistenceContext(unitName = "kx_webapp")
    private EntityManager entityManagerWebApp;
    
    public String sayHello(){
        return "Hello from MyEJBBean";
    }

    public EntityManager getEntityManagerWebApp() {
        return entityManagerWebApp;
    }

    public void setEntityManagerWebApp(EntityManager entityManagerWebApp) {
        this.entityManagerWebApp = entityManagerWebApp;
    }
}