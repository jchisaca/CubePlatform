/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jcl.cubo.managedBean;

import com.jcl.cubo.entidad.Coordenadas;
import com.jcl.cubo.entidad.Cubo;
import com.jcl.cubo.entidad.Matriz;
import com.jcl.cubo.util.ResourcesUtil;
import java.util.ArrayList;
import javax.inject.Named;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 * Clase CuboManagedBean. Clase controladora de cada uno de los eventos
 * que se realicen en la vista de la aplicacion.
 * @author Jchisaca
 */
@Named(value = "cuboManagedBean")
@ManagedBean
@ApplicationScoped
public class CuboManagedBean {

    private Cubo cubo;
    private ArrayList<Cubo> cuboList;
    private ArrayList<String> cuboProceso ;
    
    /**
     * Metodo Constructor encargado de crear una nueva Instancia de 
     * CuboManagedBean
     */
    public CuboManagedBean() {
        cuboList = new ArrayList<>();
        Cubo cuboN = new Cubo();

    }

  
    /**
     * Metodo que adiciona un nuevo Test para que posteriormente se ejecuta
     * En la vista se recarga en la segunda seccion para ir creando todos los 
     * test que se vayan a ejecutar.
     * @param cuboN Objeto de tipo Cubo para registrar en el Test a realizar
     */
    public void addValor(Cubo cuboN) {
        cuboList.add(cuboN);
    }

    /**
     * 
     * @param cuboN
     * @return 
     */
    public ArrayList<String> ejecutarTest(Cubo cuboN) {

        cuboProceso = new ArrayList<>();
        Matriz matriz = new Matriz();

        int suma=0;
        int[][][] matrizNueva = matriz.iniciarMatriz(cuboN.getTamanoMatriz());
        String[] operacionesMatriz = cuboN.getOperaciones().split("\n");
        if (operacionesMatriz.length == cuboN.getNumeroOperaciones()) {
            for (int i = 0; i < cuboN.getNumeroOperaciones(); i++) {
                String[] operacionTipo = operacionesMatriz[i].split(" ");
                Coordenadas coordenadas = this.validaOperacion(operacionTipo);
                if (coordenadas.isCorrecta()) {
                    if (ResourcesUtil.getString("#{msg['app.update']}").equalsIgnoreCase(coordenadas.getTipoOperacion())) {
                        matrizNueva = matriz.actualizarMatriz(coordenadas.getX(), coordenadas.getY(), coordenadas.getZ(), coordenadas.getNuevoValor(), matrizNueva);
                        cuboProceso.add(ResourcesUtil.getString("#{msg['app.updateMatriz']}"));
                    } else if (ResourcesUtil.getString("#{msg['app.query']}").equalsIgnoreCase(coordenadas.getTipoOperacion())) {
                        suma = matriz.sumarMatriz(coordenadas.getX(), coordenadas.getY(), coordenadas.getZ(), coordenadas.getX1(), coordenadas.getY1(), coordenadas.getZ1(), matrizNueva);
                        cuboProceso.add(ResourcesUtil.getString("#{msg['app.operacion']} ")  +  i + ResourcesUtil.getString("#{msg['app.valor']} ") + suma  );
                    }
                } else {
                    cuboProceso.add(ResourcesUtil.getString("#{msg['app.errorOperacion']}"));
                }
            }
        } else {
            cuboProceso.add(ResourcesUtil.getString("#{msg['app.errorDatos']}"));
        }       
        return cuboProceso;
    }
    
    public Coordenadas validaOperacion(String[] operacionTipo){
        Coordenadas coordenada = new Coordenadas();
            if (ResourcesUtil.getString("#{msg['app.update']}").equalsIgnoreCase(operacionTipo[0])) {
               coordenada = this.validaUpdate(operacionTipo);
            } else if (ResourcesUtil.getString("#{msg['app.query']}").equalsIgnoreCase(operacionTipo[0])) {
                coordenada =this.validaQuery(operacionTipo);
            } else {
                coordenada.setCorrecta(false);
            } 
        return coordenada;
    }

    public Coordenadas validaUpdate(String[] operacionTipo) {
        Coordenadas coordenadas = new Coordenadas();
        try {
            coordenadas.setTipoOperacion(operacionTipo[0].trim());
            coordenadas.setX(Integer.parseInt(operacionTipo[1].trim()));
            coordenadas.setY(Integer.parseInt(operacionTipo[2].trim()));
            coordenadas.setZ(Integer.parseInt(operacionTipo[3].trim()));;
            coordenadas.setNuevoValor(Integer.parseInt(operacionTipo[4].trim()));
            coordenadas.setCorrecta(true);
        } catch (Exception e) {

            coordenadas.setCorrecta(false);
        }

        return coordenadas;
    }
    
    public Coordenadas  validaQuery(String[] operacionTipo){
        Coordenadas coordenadas = new Coordenadas();
        try {
            coordenadas.setTipoOperacion(operacionTipo[0].trim());
            coordenadas.setX(Integer.parseInt(operacionTipo[1].trim()));
            coordenadas.setY(Integer.parseInt(operacionTipo[2].trim()));
            coordenadas.setZ(Integer.parseInt(operacionTipo[3].trim()));;
            coordenadas.setX1(Integer.parseInt(operacionTipo[4].trim()));
            coordenadas.setY1(Integer.parseInt(operacionTipo[5].trim()));
            coordenadas.setZ1(Integer.parseInt(operacionTipo[6].trim()));
            coordenadas.setCorrecta(true);
        } catch (Exception e) {

            coordenadas.setCorrecta(false);
        }

        return coordenadas;
    }

    public Cubo getCubo() {
        return cubo;
    }

    public void setCubo(Cubo cubo) {
        this.cubo = cubo;
    }

    public ArrayList<Cubo> getCuboList() {
        return cuboList;
    }

    public void setCuboList(ArrayList<Cubo> cuboList) {
        this.cuboList = cuboList;
    }

    public ArrayList<String> getCuboProceso() {
        return cuboProceso;
    }

    public void setCuboProceso(ArrayList<String> cuboProceso) {
        this.cuboProceso = cuboProceso;
    }

   

   

}
