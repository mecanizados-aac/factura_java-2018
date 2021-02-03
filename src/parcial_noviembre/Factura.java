/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_noviembre;

/**
 *
 * @author Alumno
 */
public class Factura {
    
    private String tipo;
    
    private int numero;
    
    private String fecha;

    public Factura() {
    }
    
    private Persona refPersona;
    private Detalle refDetalle;
    
    public Factura(String tipo, int numero, String fecha, String nombre, String apellido, int cantidad) {
        this.tipo = tipo;
        this.numero = numero;
        this.fecha = fecha;
        refPersona = new Persona (nombre, apellido);
        refDetalle = new Detalle(cantidad);
    }

    public String getFecha() {
        return fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Persona getRefPersona() {
        return refPersona;
    }

    public void setRefPersona(Persona refPersona) {
        this.refPersona = refPersona;
    }

    public Detalle getRefDetalle() {
        return refDetalle;
    }

    public void setRefDetalle(Detalle refDetalle) {
        this.refDetalle = refDetalle;
    }
    
    
    
    public float Total(float subt_a, float subt_b){
        float Total;
        Total = subt_a + subt_b;
        return Total;
    }
}
