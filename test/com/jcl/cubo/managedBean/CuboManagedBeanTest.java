/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jcl.cubo.managedBean;

import com.jcl.cubo.entidad.Coordenadas;
import com.jcl.cubo.entidad.Cubo;
import com.jcl.cubo.util.ResourcesUtil;
import java.util.ArrayList;
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
public class CuboManagedBeanTest {
    
    public CuboManagedBeanTest() {
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
     * Test of addValor method, of class CuboManagedBean.
     */
    @Test
    public void testAddValor() {
        System.out.println("addValor");
        Cubo cuboN = new Cubo();
        cuboN.setOperaciones("PRUEBA");
        cuboN.setTamanoMatriz(5);
        cuboN.setNumeroOperaciones(2);
        CuboManagedBean instance = new CuboManagedBean();
        instance.addValor(cuboN);
        // TODO review the generated test code and remove the default call to fail.
        System.err.println("cubo tamaño: " + instance.getCubo().getTamanoMatriz() + "Operaciones:" + instance.getCubo().getOperaciones());
    }

    /**
     * Test of ejecutarTest method, of class CuboManagedBean.
     */
    @Test
    public void testEjecutarTest() {
        System.out.println("ejecutarTest");
        Cubo cuboN = new Cubo();
         cuboN.setOperaciones("PRUEBA");
        cuboN.setTamanoMatriz(5);
        cuboN.setNumeroOperaciones(2);
        CuboManagedBean instance = new CuboManagedBean();
        ArrayList<String> expResult = new ArrayList<>();
        expResult.add("NUMERO OPERACIONES NO ES IGUAL A DATOS REGISTRADOS");
        ArrayList<String> result = instance.ejecutarTest(cuboN);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of validaOperacion method, of class CuboManagedBean.
     */
    @Test
    public void testValidaOperacion() {
        System.out.println("validaOperacion");
        String[] operacionTipo = new String[1];
        operacionTipo[0]= "valor";
        CuboManagedBean instance = new CuboManagedBean();
        Coordenadas expResult = new Coordenadas();
        expResult.setCorrecta(false);
        Coordenadas result = instance.validaOperacion(operacionTipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of validaUpdate method, of class CuboManagedBean.
     */
    @Test
    public void testValidaUpdate() {
        System.out.println("validaUpdate");
        String[] operacionTipo = new String[5];
        operacionTipo[0] = "UPDATE";
        operacionTipo[1] = "1";
        operacionTipo[2] = "1";
        operacionTipo[3] = "1";
        operacionTipo[4] = "21";
        CuboManagedBean instance = new CuboManagedBean();
        Coordenadas expResult = new Coordenadas();
        expResult.setTipoOperacion(operacionTipo[0].trim());
        expResult.setX(Integer.parseInt(operacionTipo[1].trim()));
        expResult.setY(Integer.parseInt(operacionTipo[2].trim()));
        expResult.setZ(Integer.parseInt(operacionTipo[3].trim()));;
        expResult.setNuevoValor(Integer.parseInt(operacionTipo[4].trim()));
        expResult.setCorrecta(true);
        Coordenadas result = instance.validaUpdate(operacionTipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of validaQuery method, of class CuboManagedBean.
     */
    @Test
    public void testValidaQuery() {
        System.out.println("validaQuery");
        String[] operacionTipo =  new String[6];
        operacionTipo[0] = "QUERY";
        operacionTipo[1] = "1";
        operacionTipo[2] = "1";
        operacionTipo[3] = "1";
        operacionTipo[4] = "2";
        operacionTipo[4] = "2";
        operacionTipo[4] = "2";
        CuboManagedBean instance = new CuboManagedBean();
        Coordenadas expResult = new Coordenadas();
        expResult.setTipoOperacion(operacionTipo[0].trim());
        expResult.setX(Integer.parseInt(operacionTipo[1].trim()));
        expResult.setY(Integer.parseInt(operacionTipo[2].trim()));
        expResult.setZ(Integer.parseInt(operacionTipo[3].trim()));;
        expResult.setX1(Integer.parseInt(operacionTipo[4].trim()));
        expResult.setY1(Integer.parseInt(operacionTipo[5].trim()));
        expResult.setZ1(Integer.parseInt(operacionTipo[6].trim()));
        expResult.setCorrecta(true);
        Coordenadas result = instance.validaQuery(operacionTipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getCubo method, of class CuboManagedBean.
     */
    @Test
    public void testGetCubo() {
        System.out.println("getCubo");
        CuboManagedBean instance = new CuboManagedBean();
        Cubo expResult = null;
        Cubo result = instance.getCubo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setCubo method, of class CuboManagedBean.
     */
    @Test
    public void testSetCubo() {
        System.out.println("setCubo");
        Cubo cubo = null;
        CuboManagedBean instance = new CuboManagedBean();
        instance.setCubo(cubo);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getCuboList method, of class CuboManagedBean.
     */
    @Test
    public void testGetCuboList() {
        System.out.println("getCuboList");
        CuboManagedBean instance = new CuboManagedBean();
        ArrayList<Cubo> expResult = null;
        ArrayList<Cubo> result = instance.getCuboList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setCuboList method, of class CuboManagedBean.
     */
    @Test
    public void testSetCuboList() {
        System.out.println("setCuboList");
        ArrayList<Cubo> cuboList = null;
        CuboManagedBean instance = new CuboManagedBean();
        instance.setCuboList(cuboList);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getCuboProceso method, of class CuboManagedBean.
     */
    @Test
    public void testGetCuboProceso() {
        System.out.println("getCuboProceso");
        CuboManagedBean instance = new CuboManagedBean();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getCuboProceso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setCuboProceso method, of class CuboManagedBean.
     */
    @Test
    public void testSetCuboProceso() {
        System.out.println("setCuboProceso");
        ArrayList<String> cuboProceso = null;
        CuboManagedBean instance = new CuboManagedBean();
        instance.setCuboProceso(cuboProceso);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
