
package logica_programable;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import javax.swing.JOptionPane;

public class Carrito {
    //declaracion de estructura de datos dinamica
    private Stack <String> carrito;
    private Map<String, Integer> historialnCompras;
    //base de conocimiento
    private String [] recomendaciones={"Leche", "Pan", "Huevo", "tortilla", "arroz", "frijol", "Azúcar"};
    
   
    //constructor iniciar las estructuras de datos dinamicos 
    public Carrito() {
        carrito = new Stack<>();
        historialnCompras = new HashMap<>();
    }//termina cosntructor 
    
    
  //actividades de mantenimiento de informacion 
    
public void agregarProducto(String producto){//alta 
carrito.push(producto);
historialnCompras.put(producto,historialnCompras.getOrDefault(producto,0)+1);
    JOptionPane.showMessageDialog(null, "Agregado de producto con exito ");

}
}//alta



