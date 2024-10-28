
package sesion34_fragosoed_pilas;

import java.util.Stack;
import javax.swing.JOptionPane;


public class Sesion34_FragosoED_pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Stack<Integer> pilaFragoso = new Stack<>();
          pilaFragoso.push(100);  
          pilaFragoso.push(150);
          pilaFragoso.push(230);
          pilaFragoso.push(10);
          pilaFragoso.push(160);
          JOptionPane.showMessageDialog(null, "Datos en pila ordeanada es \n"+pilaFragoso);
    }
    
}
