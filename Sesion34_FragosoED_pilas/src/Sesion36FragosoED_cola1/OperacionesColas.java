//clase para logica de negocio - Programacion contiene los metodos de generacion de las colas
package Sesion36FragosoED_cola1;

import javax.swing.JOptionPane;


public class OperacionesColas {
    //estructura inicial y final de la ED cola 
   private int frente;
    private int fin;
    protected Object[] listaCola;//declaracion de cola 
    
    
    public OperacionesColas(int tamMax) {//constructor que pasa parametos inicio y fin de la cola 
        frente = 0;
        fin = -1;
        listaCola = new Object[tamMax];
                JOptionPane.showMessageDialog(null, "Operaciones colas");
    }//constructor indica y autiriza qien va al frente y quien va al fin 
       
      public void insertar(Object dato) throws Exception {
        if (!colaLlena()) {
            fin++;
            listaCola[fin] = dato;
                        JOptionPane.showMessageDialog(null, "Insertar ");
        } else {
            throw new Exception("Error en la cola: Cola LLena");
        }
    }  //termina pra insertar 
      
        public int tamMax() {//determina el tamaño de los elmentos de la ED cola
        return listaCola.length;
    }//termina metodo para el numero de elementos 

        public boolean colaLlena() {//metodo que indica que cola esta llena 
        return fin == tamMax() - 1;
    }//termina metodo para indicar que cola esta llena 
        
public boolean colaVacia() {//metodo que indica que cola esta vacia 
        return frente > fin;
    }
        public void imprimir() {//metodo para imoprimir 
        for (int i = 0; i < tamMax(); i++) {
            Object datoActual = listaCola[i];

            if (datoActual != null) {
                 JOptionPane.showMessageDialog(null, "Cola esta LLena de valores \n"+(datoActual)+ ", ");
            }
        }
    }//termina metodo para imprimir 
       
       
        public int contarDatos() {//inicia metodo contar datos 
        int contador = 0;

        for (int i = 0; i < tamMax(); i++) {
            if (listaCola[i] != null) {
                contador++;
            }
        }

        return contador;
    }//termina metodo contar datos 
    
}//termina clase
