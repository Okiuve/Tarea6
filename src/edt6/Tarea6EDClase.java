/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edt6;

/**
 *
 * @author _NZO
 */
public class Tarea6EDClase {
    public void aplicarDescuento(double precioProducto, int numProductos){     
        double total;
        if(numProductos>3)
            precioProducto-=descuentoMinimo;
                if (numProductos!=0){
                    porcentajeDescuento = 0.8;
                    total = precioProducto*porcentajeDescuento;
                        informa(total);
                }else {
                    porcentajeDescuento = 0.95;
                    total = precioProducto*porcentajeDescuento;
                        informa(total);
        }   
    }
    private void informa(double total) {
        System.out.println("El total a pagar es:"+total);
        System.out.println("Enviado");
    }
    private double porcentajeDescuento;
    private static final int descuentoMinimo = 5;
}
