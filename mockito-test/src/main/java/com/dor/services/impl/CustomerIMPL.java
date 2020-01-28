package com.dor.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import com.dor.services.ICustomers;

@Named("customersDB")
public class CustomerIMPL implements ICustomers {

    @Override
    public List<String> getCustomers() {
        // Acá implemento el llamado al servicio rest
        // o consulta de base de datos
        return new ArrayList<String>();
    }

}
