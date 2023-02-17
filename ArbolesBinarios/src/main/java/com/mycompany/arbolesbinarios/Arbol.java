/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolesbinarios;

/**
 *
 * @author CrisA
 */
public class Arbol {
    
    Nodo raiz;
    public Arbol(){
        raiz=null;
    }
    
    public void insertar (int i, Object Numero){
        Nodo n = new Nodo(i);
        n.Contenido = Numero;
        
        if (raiz==null){
            raiz=n;
        }else{
            Nodo aux = raiz;
            while (aux != null){
                n.Padre = aux;
                if (n.Llave >= aux.Llave){
                    aux = aux.Derecha;
                }else{
                    aux = aux.Izquierda;
                }
            }
            if (n.Llave < n.Padre.Llave){
                n.Padre.Izquierda = n;
            }else{
                n.Padre.Derecha = n;
            }
        }
        
    }
    
    public void Preorden (Nodo n){
        if (n != null ){
            Preorden (n.Izquierda);
            System.out.println("Indice " + n.Llave + " Contenido " + n.Contenido);
            Preorden(n.Derecha);
        }
    }
    


    public  class Nodo {
        public Nodo Padre;
        public Nodo Derecha;
        public Nodo Izquierda;
        public int Llave;
        public Object Contenido;
        
        public Nodo (int indice){
            Llave = indice;
            Derecha = null;
            Izquierda = null;
            Padre = null;
            Contenido = null;
        }
        
    }
}
