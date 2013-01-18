/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maxtorzito.web1.managedbean;

import com.grupokx.managedbean.*;
import com.grupokx.MyEJBBean;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import org.apache.myfaces.extensions.cdi.core.api.provider.BeanManagerProvider;
import org.apache.myfaces.extensions.cdi.core.api.scope.conversation.ViewAccessScoped;

/**
 *
 * @author maxtorzito
 */
@Named
@ViewAccessScoped
public class MyManagedBeanTest implements Serializable {
    
    private String name="Hello World";
    private MyEJBBean myEJB;
    
    public MyManagedBeanTest() {
    }
    
    @PostConstruct
    public void myPostConstruct() throws Exception{
        System.out.println("\n\n\n\nGetting ejb reference using CODI......");
        myEJB = BeanManagerProvider.getInstance().getContextualReference(MyEJBBean.class);
    }

    public MyEJBBean getMyEJB() {
        return myEJB;
    }

    public void setMyEJB(MyEJBBean myEJB) {
        this.myEJB = myEJB;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}