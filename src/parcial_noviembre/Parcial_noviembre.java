/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_noviembre;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Parcial_noviembre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Factura fact1 = new Factura();
       
       fact1.setTipo("A");
       fact1.setNumero(0001);
       fact1.setFecha("13 de Noviembre de 2018");
       
       Cliente cli1 = new Cliente();
       
       cli1.setNumero(216);
       cli1.setApellido("Castillo");
       cli1.setNombre("Aldo");
       
       Vendedor vend1 = new Vendedor();
       
       vend1.setDepartamento("Ventas Mostrador 001");
       vend1.setApellido("Anzorena");
       vend1.setNombre("Gabriel");
       
       Articulo art1 = new Articulo();
       
       art1.setCodigo(13);
       art1.setDescripcion("Modulo tomacorriente doble JELUZ");
       art1.setPrecio(80);
       
       Articulo art2 = new Articulo();
       
       art2.setCodigo(15);
       art2.setDescripcion("Modulo punto y toma JELUZ");
       art2.setPrecio(90);
       
       Detalle det1 = new Detalle();
       det1.setCantidad(3);
       
       Detalle det2 = new Detalle();
       det2.setCantidad(1);
       
       det1.agregarArticulo(art1);
       det1.agregarArticulo(art2);
       
       det1.recorrerArticulo();
      
       int cantidad = det1.getCantidad();
       float precio = art1.getPrecio(); 
       
       float sub_a = det1.getCantidad() * art1.getPrecio();
       float sub_b = det2.getCantidad() * art2.getPrecio();
       
       System.out.println("");
       System.out.println("El Subtotal es : " + det1.subTotal(cantidad, precio));
       System.out.println("");
       System.out.println("El Total es : " + fact1.Total(sub_a, sub_b));
       System.out.println("");
      
       JOptionPane.showMessageDialog(null," ~~ Factura Final ~~ \n\nTipo: " + fact1.getTipo() + "\nNúmero: " + fact1.getNumero() + "\nFecha: " + fact1.getFecha() + "\n\nCliente\nNúmero: " + cli1.getNumero()+"\nApellido: " + cli1.getApellido() +"\nNombre: " + cli1.getNombre()+"\n\nVendedor\nDepartamento: " + vend1.getDepartamento()+"\nApellido: " + vend1.getApellido() +"\nNombre: " + vend1.getNombre()+"\n\nDetalle\n\nCatidad Código Descripción                                              Precio\n"+det1.getCantidad()+"             "+art1.getCodigo()+"          "+art1.getDescripcion()+"  "+art1.getPrecio()+"\n"+det2.getCantidad()+"             "+art2.getCodigo()+"          "+art2.getDescripcion()+"                "+art2.getPrecio()+"\n\n                                                                                Subtotal: "+det1.subTotal(cantidad, precio)+"\n                                                                                   TOTAL: " + fact1.Total(sub_a, sub_b)+"\n\nAutor: Aldo Adrián Castillo");
                
    }
    
}
