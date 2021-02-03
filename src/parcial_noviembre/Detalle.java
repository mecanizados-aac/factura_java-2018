/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_noviembre;

import java.util.ArrayList;



/**
 *
 * @author Alumno
 */
public class Detalle {
    
    private int cantidad;
    
    private ArrayList <Articulo> Articulo = new ArrayList();

    public int getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Detalle() {
    }
    
    private Articulo refArticulo;

    public Detalle(int cantidad) {
        this.cantidad = cantidad;
    }

    public Articulo getRefArticulo() {
        return refArticulo;
    }

    public void setRefArticulo(Articulo refArticulo) {
        this.refArticulo = refArticulo;
    }
    
    public void agregarArticulo(Articulo art1) {
        Articulo.add(art1);
    }
    
    public void agregarRefArticulo(Articulo refArticulo) {
        this.refArticulo = refArticulo;
    }
    public void recorrerArticulo(){
        for (Articulo i: Articulo){
            System.out.println("");
            System.out.println("Código: " + i.getCodigo());
            System.out.println("Descripción: " + i.getDescripcion());
            System.out.println("Precio: " + i.getPrecio());
            System.out.println("");
        }
    }
    
    public float subTotal(int cantidad, float precio){
        float subTotal;
        subTotal = cantidad * precio;
        return subTotal;
    } 
}
