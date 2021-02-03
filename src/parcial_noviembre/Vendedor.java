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
public class Vendedor extends Persona {
    
    private String departamento;

    public Vendedor() {
    }

    public Vendedor(String departamento) {
        this.departamento = departamento;
    }

    public Vendedor(String departamento, String nombre, String apellido) {
        super(nombre, apellido);
        this.departamento = departamento;
    }
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
