package com.dor;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.dor.services.ICustomers;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

public class NewSessionBeanTest {

    static public NewSessionBean newSessionBean;
    
    @BeforeClass
    public static void setUp() {
        newSessionBean = new NewSessionBean();
        newSessionBean.customers = mock(ICustomers.class);
    }
    
    @Test
    public void test() {
        
        /*Inicio Mock*/
        List<String> customersMock = new ArrayList<String>();
        customersMock.add("daniela");
        customersMock.add("salo");
        customersMock.add("valentina");
        customersMock.add("tuti");
        when(newSessionBean.getCustomersHowNameStartsWith("d")).thenReturn(customersMock);
        /*Fin Mock*/
        
        /*Ejecución del bean*/
        List<String> customersResult = newSessionBean.getCustomersHowNameStartsWith("d");
        /*Fin del bean*/
        
        assertEquals(customersResult.size(), 1);
    }

}
