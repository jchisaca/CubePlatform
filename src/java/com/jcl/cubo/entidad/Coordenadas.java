/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jcl.cubo.entidad;

/**
 *Clase Coordenadas
 * Esta clase es utilizada para administrar todos los parametros correspondientes
 * para enviar al cubo y realizar las diferentes operaciones 
 * @author Jchisaca
 */
public class Coordenadas {
    
    private int x;
    private int x1;
    private int y;
    private int y1;
    private int z;
    private int z1;
    private int nuevoValor;
    private boolean correcta;
    private String tipoOperacion;
    
    


    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getZ1() {
        return z1;
    }

    public void setZ1(int z1) {
        this.z1 = z1;
    }

    public int getNuevoValor() {
        return nuevoValor;
    }

    public void setNuevoValor(int nuevoValor) {
        this.nuevoValor = nuevoValor;
    }

    public boolean isCorrecta() {
        return correcta;
    }

    public void setCorrecta(boolean correcta) {
        this.correcta = correcta;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }
    
    
    
    
    
    
}
