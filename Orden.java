/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventas;

/**
 *
 * @author net1
 */
public class Orden {
    private final int idOrden;
    private static int cuentaProducto;
    private Producto productos[]; 
    private int productosMaximos = 10;
    private int cuentaOrdenes;
         
            
    public Orden(){
        this.idOrden = ++cuentaOrdenes;                                             //REVISAR DESPUES
        productos = new Producto[productosMaximos];                                // Vector de productos
    }
    
    public double calcularTotalDeOrden(){      // DOUBLE
        double total = 0;
        for(int i=0; i < cuentaProducto; i++){
            total =+ productos[i].getPrecio();
        }
        return total;
    }
    
    public void agregarProducto(Producto producto){
        if(cuentaProducto < productosMaximos){
            productos[cuentaProducto] = producto;
            cuentaProducto++;
        }else{
            System.out.println("La orden esta llena");
        }
            
    }
            
    public void mostrarOrdenes(){
        System.out.println("Orden: " + idOrden);
        System.out.println("Total : $" + calcularTotalDeOrden());
        for(int i = 0; i < 10; i++){
            System.out.println("Productos de la orden: " + productos[i].getNombre());

        }
    }    

}
