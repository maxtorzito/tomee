package com.grupokx;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class EJBModuleTest {

    @PersistenceContext(unitName = "kx_ejb")
    private EntityManager entityManagerEJB;

    public EntityManager getEntityManagerEJB() {
        return entityManagerEJB;
    }

    public void setEntityManagerEJB(EntityManager entityManagerEJB) {
        this.entityManagerEJB = entityManagerEJB;
    }
 
}