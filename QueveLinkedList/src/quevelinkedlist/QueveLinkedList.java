/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quevelinkedlist;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author hp
 */
public class QueveLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue<String> queve = new LinkedList();
        queve.add("Johan");
        queve.add("Arturo");
        queve.add("Hector");
        
        //inserta dato
        //retorna null en caso de no poner
        // almacena el elemnto
        queve.offer("Pablo");
   
            //elimina un elemnto
           System.out.println("Se elimino " + queve.remove());
            
            
            
            //muestra el frente de la cola
            System.out.println("Frente Cola " + queve.element() );
            
            
            //elimina un elemnto de la cola
            // reorna null si la cola esta vacia
            System.out.println("Se elimino el elemento" + queve.peek());
    
            System.out.println(queve.toString());
            
}
}

// mostara todo
