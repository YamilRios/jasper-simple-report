package com.prueba.ReportFact;

import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

/**
 *
 * @author JorgeLPR
 */
public class DataSource implements JRDataSource{

    //private final Object [][] listadoProductos;
    private int index; 
    private List<Producto> listadoProductos;
    
    
    public DataSource(List<Producto> lstProducto){
        index = -1;
        listadoProductos = lstProducto;
        /*
        listadoProductos = new ArrayList<Producto>();
        listadoProductos.add(new Producto(1,"zz", "Prueba 1","12.00","12.00", "12.00"));
        listadoProductos.add(new Producto(2,"yy", "Prueba 2","13.00","13.00","13.00"));
        listadoProductos.add(new Producto(3,"xx", "Prueba 3","14.00","14.00","14.00"));
        */
        /*listadoProductos = new Object[][]{
            {1,"zz", "Prueba 1","12.00","12.00", "12.00"},
            {2,"yy", "Prueba 2","13.00","13.00","13.00"},
            {3,"xx", "Prueba 3","14.00","14.00","14.00"}
            };*/
        /*
        listadoProductos = new Object[][]{
                                        {1, "Afganistán", "Kabul", 37172386},
                                        {2, "Albania", "Tirana", 2862427},
                                        {3, "Alemania", "Berlín", 83019213},
                                        {4, "Andorra", "Andorra La Vieja", 76177},
                                        {5, "Angola", "Luanda", 30809762},
                                        {6, "Antigua y Barbuda", "Saint John’s", 96286},
                                        {7, "Arabia Saudita", "Riad", 33699947},
                                        {8, "Argelia", "Argel", 42228429},
                                        {9, "Argentina", "Buenos Aires", 44560000},
                                        {10, "Armenia", "Ereván", 2965269},
                                        {11, "Australia", "Camberra", 25169000},
                                        {12, "Austria", "Viena", 8858775},
                                        {13, "Azerbaiyán", "Bakú", 9940000},
                                        {14, "Bahamas", "Nasáu", 377000},
                                        {15, "Bangladés", "Daca", 161356039},
                                        {16, "Barbados", "Bridgetown", 286000},
                                        {17, "Baréin", "Manama", 1569439},
                                        {18, "Bélgica", "Bruselas", 11467923},
                                        {19, "Belice", "Belmopán", 383071},
                                        {20, "Benín", "Porto Novo y Cotonú", 11485048},
                                        {21, "Bielorrusia", "Minsk", 9475174},
                                        {22, "Birmania", "Naipyidó", 53708395},
                                        {23, "Bolivia", "Sucre", 11353142},
                                        {24, "Bosnia y Herzegovina", "Sarajevo", 3504000},
                                        {25, "Botsuana", "Gaborone", 2254126},
                                        {26, "Brasil", "Brasilia", 209469333},
                                        {27, "Brunéi", "Bandar Seri Begawan", 442000},
                                        {28, "Bulgaria", "Sofía", 7000039},
                                        {29, "Burkina Faso", "Uagadugú", 19752000},
                                        {30, "Burundi", "Gitega", 11175378}
                                      };*/
        
    }
    
    @Override
    public boolean next() throws JRException {
        index++;
        return (index < listadoProductos.size());
    }

    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        
        Object value = null;
        
        String fieldName = jrf.getName();
        
        switch(fieldName){
            
            case "cantidad":
                value = listadoProductos.get(index).getCantidad();
            break;
            case "descripcion":
                value = listadoProductos.get(index).getDescripcion();                
            break;
            case "valorVenta":
                value = listadoProductos.get(index).getValorVenta();                
            break;
            
        }
        
        return value;
    
    }
    
    public static JRDataSource getDataSource(List<Producto> lstProducto){
        return new DataSource(lstProducto);
    }
    
}
