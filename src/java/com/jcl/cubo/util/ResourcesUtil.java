/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jcl.cubo.util;

import javax.faces.context.FacesContext;

/**
 * Clase ResourcesUtil encargada de la lectura del archivo de propiedades
 * el cual se utiliza tanto en la vista como en el controlador.
 * @author Jchisaca
 */
public class ResourcesUtil {
     public static String getString(String key) {
        FacesContext context = FacesContext.getCurrentInstance();
        String value = context.getApplication().evaluateExpressionGet(context, key, String.class);
         
        return value;
    }
}
