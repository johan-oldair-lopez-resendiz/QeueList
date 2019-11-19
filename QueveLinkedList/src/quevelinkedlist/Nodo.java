/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quevelinkedlist;

import static javafx.scene.input.KeyCode.X;

/**
 *
 * @author hp
 */
 class Nodo {
    Object elemento;
    Nodo siguiente;
    
    public Nodo(Object x){
        elemento= x;
        siguiente = null;
    }
    //declaracion de la clase colaLista
    
    public class ColaLista{
        protected Nodo frente;
        protected Nodo fin;
        
        //constructor: crea cola vacia
        public ColaLista(){
            frente= fin= null;
        }
        //insertar: pone elemento por el final
        public  void insertar(Object elemento){
            Nodo a;
            a= new Nodo(elemento);
            if (ColaVacia()) {
                frente=a;
            } else {
                fin.siguiente = a;
            }
            fin = a;
        }
        //quitar: sale el elemnto frente
        public  Object quitar() throws Exception{
            Object aux;
            if (!ColaVacia()) {
                aux = frente.elemento;
                frente = frente.siguiente;
            } else {
                throw  new Exception("Eliminar de una cola vacia");
            }
            return aux;
        }
        //libera todos los elementos de la cola
        public  void borrarCola(){
            for (; frente != null;) {
                frente = frente.siguiente;
            }
            System.gc();
        }
        //acceso a primero de la cola
        public Object frenteCola() throws Exception{
            if (ColaVacia()) {
                throw  new Exception("Error men" +"\nCola Vacia");
            }
            return (frente.elemento);
        }
      

        public boolean ColaVacia() {
        return  (frente==null);
        }
        
    }
}
