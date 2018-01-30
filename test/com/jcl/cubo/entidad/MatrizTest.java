/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jcl.cubo.entidad;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author e10289a
 */
public class MatrizTest {
    
    public MatrizTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of iniciarMatriz method, of class Matriz.
     */
    @Test
    public void testIniciarMatriz() {
        System.out.println("iniciarMatriz");
        int tamano = 5;
        Matriz instance = new Matriz();
        int[][][] expResult = new int[tamano][tamano][tamano];
        int[][][] result = instance.iniciarMatriz(tamano);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of imprimirMatriz method, of class Matriz.
     */
    @Test
    public void testImprimirMatriz() {
        int tamano = 5;
        System.out.println("imprimirMatriz");
        int[][][] matriz = new int[tamano][tamano][tamano];;
        Matriz instance = new Matriz();
        instance.imprimirMatriz(matriz);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of sumarMatriz method, of class Matriz.
     */
    @Test
    public void testSumarMatriz() {
        System.out.println("sumarMatriz");
        int tamano = 5;
        int valor1=43;
        int valor2=32;
        int valor3=23;
        int x1 = 0;
        int y1 = 0;
        int z1 = 0;
        int x2 = 4;
        int y2 = 4;
        int z2 = 4;
        int[][][] matrizN = new int[tamano][tamano][tamano];
        Matriz instance = new Matriz();
        matrizN[1][2][3]=valor1;
        matrizN[2][0][1]=valor2;
        matrizN[0][1][3]=valor3;
        int expResult = valor1 + valor2+ valor3;
        int result = instance.sumarMatriz(x1, y1, z1, x2, y2, z2, matrizN);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of actualizarMatriz method, of class Matriz.
     */
    @Test
    public void testActualizarMatriz() {
        System.out.println("actualizarMatriz");
        int tamano = 5;
        int x = 2;
        int y = 2;
        int z = 2;
        int valorNuevo = 45;
        int[][][] matrizNueva = new int[tamano][tamano][tamano];
        Matriz instance = new Matriz();
        int[][][] expResult = new int[tamano][tamano][tamano];
        expResult[x][y][z]=valorNuevo;
        int[][][] result = instance.actualizarMatriz(x, y, z, valorNuevo, matrizNueva);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getnOperaciones method, of class Matriz.
     */
    @Test
    public void testGetnOperaciones() {
        System.out.println("getnOperaciones");
        Matriz instance = new Matriz();
        int expResult = 0;
        int result = instance.getnOperaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setnOperaciones method, of class Matriz.
     */
    @Test
    public void testSetnOperaciones() {
        System.out.println("setnOperaciones");
        int nOperaciones = 0;
        Matriz instance = new Matriz();
        instance.setnOperaciones(nOperaciones);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getTamano method, of class Matriz.
     */
    @Test
    public void testGetTamano() {
        System.out.println("getTamano");
        Matriz instance = new Matriz();
        int expResult = 0;
        int result = instance.getTamano();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setTamano method, of class Matriz.
     */
    @Test
    public void testSetTamano() {
        System.out.println("setTamano");
        int tamano = 0;
        Matriz instance = new Matriz();
        instance.setTamano(tamano);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getMatrizN method, of class Matriz.
     */
    @Test
    public void testGetMatrizN() {
        System.out.println("getMatrizN");
        Matriz instance = new Matriz();
        int[][][] expResult = null;
        int[][][] result = instance.getMatrizN();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setMatrizN method, of class Matriz.
     */
    @Test
    public void testSetMatrizN() {
        System.out.println("setMatrizN");
        int[][][] matrizN = null;
        Matriz instance = new Matriz();
        instance.setMatrizN(matrizN);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
