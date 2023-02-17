
package com.mycompany.arbolesbinarios;

/**
 *
 * @author CrisA
 */
public class ArbolesBinarios {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Arbol arbol = new Arbol();
        arbol.insertar(1, "Padre");
        arbol.insertar(2, "Hijo derecha");
        arbol.insertar(3, "Hijo izquierda");
        arbol.insertar(4, "Hijo de Hijo derecha");
        arbol.insertar(5, "Hijo de Hijo Izquierda");
        
        System.out.println("PreOrden");
        arbol.Preorden(arbol.raiz);
    }
}
