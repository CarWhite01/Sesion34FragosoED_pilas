//clase para logica de negocio - Programacion contiene los metodos de generacion de las colas
package Sesion36FragosoED_cola1;

import javax.swing.JOptionPane;


public class OperacionesColas {
    //atributos y cararcteristicas d las colas principales
    private int frente;
    private int fin;
    protected Object[] listaCola;
    //Constructor que inicializa los componentes principales de las colas 

    public OperacionesColas(int tamMax) {
        this.frente = 0;
        this.fin = -1;
        listaCola = new Object[tamMax];
    }
    //metodo para insertar los elemenetos de la estrctura cola
    public void insertar(Object dato)throws Exception {
        if (!colaLlena()) {
            fin++;
            listaCola[fin] = dato;
        } else {
            JOptionPane.showMessageDialog(null, "Error 1 Al insertar : Cola llena");
        }
    }//metodo para insertar
    
    //metodo para indentificar cola llena
    public boolean colaLlena (){
       int tamMax = 0;
       return fin == tamMax - 1;
    }//termina metodo para cola llena
    
    //tamaño de la ED cola
    public int tamMax(){
        return listaCola.length;
    }
    
    //metodo para imprimir elementos de lo cola
    public void imprimir(){
        
        for (int i = 0; i < tamMax(); i++) {
            Object datoActual = listaCola[i];
            
            if (datoActual !=null) {
                JOptionPane.showMessageDialog(null, datoActual+ " : ");
            }
            
        }
    }
    
    
}//termina clase
