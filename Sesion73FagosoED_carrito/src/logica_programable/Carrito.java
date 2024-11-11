
package logica_programable;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
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
    JOptionPane.showMessageDialog(null, "Agregado de producto con exito "+producto);


}//alta

//metodo para imprimir
public void mostarCarrito(){
    if (carrito.isEmpty()) {
         JOptionPane.showMessageDialog(null,"Carrito Vacio:");
    } else {
        JOptionPane.showMessageDialog(null,"Productos en el carrito:");
        for (String producto : carrito) {
            JOptionPane.showMessageDialog(null,"Productos en el Carrito\n"+producto);
        }
    }
}
    //metodo para eliminar un elemento 
    public void eliminarUltimoproducto(){
            if (!carrito.isEmpty()) {
                String producto = carrito.pop();
                 JOptionPane.showMessageDialog(null,"Producto eliminado :\n"+producto);
            } else {
                 JOptionPane.showMessageDialog(null,"CArrito Vacio");
            }
    }
    // Método para recomendar productos en base a las compras anteriores
    public void recomendarProducto() {
        String sugerencia = obtenerSugerenciaBasadaEnHistorial();
        JOptionPane.showMessageDialog(null,"Basado en tus compras anteriores, te recomendamos: " + sugerencia);
    }

    // Obtiene una sugerencia en función del historial de compras o un producto aleatorio
    private String obtenerSugerenciaBasadaEnHistorial() {
        // Busca el producto más comprado
        String sugerencia = null;
        int maxCompras = 0;
        for (Map.Entry<String, Integer> entry : historialnCompras.entrySet()) {
            if (entry.getValue() > maxCompras) {
                maxCompras = entry.getValue();
                sugerencia = entry.getKey();
            }
        }
        // Si no hay historial o quiere variar, sugiere uno aleatorio de la lista
        if (sugerencia == null || Math.random() < 0.3) {
            Random random = new Random();
            sugerencia = recomendaciones[random.nextInt(recomendaciones.length)];
        }
        return sugerencia;
    
    
            
} //termina metodo imprimir
    
    
    
    
}//termina todo


