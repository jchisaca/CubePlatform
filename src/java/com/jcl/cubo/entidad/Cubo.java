/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jcl.cubo.entidad;

import javax.faces.bean.ManagedBean;

/**
 * Clase para crear y administrar el Cubo y sus operaciones en cuanto
 * al tamaño, el numero de operaciones a realizar en un test y las 
 * respectivas operaciones que se generen
 * @author Jchisaca
 */

@ManagedBean
public class Cubo {
    
    private int tamanoMatriz;
    private int numeroOperaciones;
    private String operaciones;    

    public int getTamanoMatriz() {
        return tamanoMatriz;
    }

    public void setTamanoMatriz(int tamanoMatriz) {
        this.tamanoMatriz = tamanoMatriz;
    }

    public int getNumeroOperaciones() {
        return numeroOperaciones;
    }

    public void setNumeroOperaciones(int numeroOperaciones) {
        this.numeroOperaciones = numeroOperaciones;
    }

    public String getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(String operaciones) {
        this.operaciones = operaciones;
    }
    
}
