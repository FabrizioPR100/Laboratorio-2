/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventas;

/**
 *
 * @author Fabri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       Producto producto1 = new Producto("Zapatillas",7000);
       Producto producto2 = new Producto("tornillos",100);

//       Producto producto2 = new Producto("Remera",2000);
        
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);

//        orden1.agregarProducto(producto2);
        orden1.mostrarOrdenes();
        

        
    }
    
}
