/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dor;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

import com.dor.services.ICustomers;

import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.LocalBean;

/**
 *
 * @author dor
 */
@Stateless
@LocalBean
public class NewSessionBean {
    
    //Hacemos la inyección de la dependencia 
    @Inject
    @Named("customersDB") ICustomers customers;
    
    public List<String> getCustomersHowNameStartsWith(String firstLetter) {
        
        List<String> customersList = customers.getCustomers();

        List<String> result = customersList.stream()               
                .filter(customer -> customer.startsWith(firstLetter))
                .collect(Collectors.toList());        
        
        return result;
    }   
}
