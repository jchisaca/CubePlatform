/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jcl.cubo.entidad;

/**
 * Clase que administra la matriz en cuanto a la creación de la matriz
 * la definicion del tamano de la matriz y ejecuta las operaciones que se 
 * soliciten como impresion, suma y actualización.
 * @author Jchisaca
 */
public class Matriz {

    private int nOperaciones, tamano;
    private int [][][] matrizN;


    
    /**
     * Metodo iniciarMatriz encargada de inicializar la matriz de acuerdo
     * a los parametros recibidos.
     * @param tamano Recibe el tamano de la matriz.
     * @return 
     */
    public int [][][] iniciarMatriz (int tamano){
        this.matrizN = new int[tamano][tamano][tamano];
        return matrizN;
    }
    
    /**
     * Metodo imprimirMatriz encargado de la impresion de los datos que contiene
     * la matriz, utilizada para revision del proceso funcional.
     * @param matriz  Recibe la matriz a imprimir
     */
    public void imprimirMatriz (int[][][] matriz){
        for (int x=0; x<matriz.length; x++ ){
            for (int y=0; y<matriz[x].length; y++ ){
                for (int z=0; z<matriz[y].length; z++ ){
                    System.out.println("valor: " + x + y + z + " : " + matriz[x][y][z]);
                }
            }
        }
    }
    
    /**
     * Metodo sumarMatriz encargado de la suma de la matriz de acuerdo a las 
     * coordenadas que se le envien en la operacion
     * @param x1 Coordenada X de inicio para la suma
     * @param y1 Coordenada y de inicio para la suma
     * @param z1 Coordenada z de inicio para la suma
     * @param x2 Coordenada X de fin para la suma
     * @param y2 Coordenada y de fin para la suma
     * @param z2 Coordenada z de fin para la suma
     * @param matrizN Matriz a acutalizar.
     * @return 
     */
    public int sumarMatriz(int x1,int y1,int z1,int x2,int y2,int z2, int [][][] matrizN){
        int suma=0;
                
        for (int x=x1; x<=x2; x++ ){
            for (int y=y1; y<=y2; y++ ){
                for (int z=z1; z<=z2; z++ ){
                    suma += matrizN[x][y][z]; 
                }
            }
        }
        return suma;
    }
    
    
    /**
     * Metodo actualizarMatriz encargado de actualizar la matriz de acuerdo al 
     * nuevo valor que se envie y se actualiza en las coordenadas recibidad
     * @param x Coordenada X para actualizar matriz
     * @param y Coordenada Y para actualizar matriz
     * @param z Coordenada Z para actualizar matriz
     * @param valorNuevo valor con el cual se va a actualizar la matriz
     * @param matrizNueva Matriz a actualizar.
     * @return 
     */
    public int[][][] actualizarMatriz(int x, int y, int z, int valorNuevo, int [][][] matrizNueva){
        matrizNueva[x][y][z]=valorNuevo;
        return matrizNueva; 
    }

    public int getnOperaciones() {
        return nOperaciones;
    }

    public void setnOperaciones(int nOperaciones) {
        this.nOperaciones = nOperaciones;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int[][][] getMatrizN() {
        return matrizN;
    }

    public void setMatrizN(int[][][] matrizN) {
        this.matrizN = matrizN;
    }
    

}
