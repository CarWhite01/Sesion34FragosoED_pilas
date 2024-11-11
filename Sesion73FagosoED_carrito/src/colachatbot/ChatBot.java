
package colachatbot;


public class ChatBot {
    
    public String generaRespuesta(String pregunta){//inicia
    pregunta = pregunta.toLowerCase();
        if (pregunta.contains("hola")||pregunta.contains("hi")) {//para saludar
            return "¡Hola soy IA Mi amo es Carlos!. ¿En que puedo ayudarte?";
        } else if(pregunta.contains("¿como estas?")){
             return "¡Estoy aqui para ayudarte!. ¿En que necesitas ayuda?";
              } else if(pregunta.contains("tu nombre")){
             return "soy una maquina inteligente especialista es programacion Java ";
                } else if(pregunta.contains("que puedes hacer")){
             return "Puedo programar en forma estructurada OO, OE, OA, RX y mas "
                     + "\nAdemas de responder preguntas y gestionar "
                     + "\n consultas en orden de llegada";
             } else if(pregunta.contains("hola")){
             return "Aun no tengo es programacion, puedes preguntar otra cosa";
              } else {
             return "No entiendo tu pegunta, puedes preguntar otra de otro modo";
                }
        
    }//termina 
    
    
    
    
    
    
    
}//termina clase
