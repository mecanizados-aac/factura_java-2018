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
public class Cliente extends Persona {
    
    private int numero;

    public Cliente() { 
    }

    public Cliente(int numero) {
        this.numero = numero;
    }

    public Cliente(int numero, String nombre, String apellido) {
        super(nombre, apellido);
        this.numero = numero;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
