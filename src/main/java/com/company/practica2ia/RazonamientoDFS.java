/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.practica2ia;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author nunez
 */
public class RazonamientoDFS extends Razonamiento{

    @Override
    public void metodoDeBusqueda(String stringRaiz, String nodoABuscar, ArrayList<Nodo> verticeDeNodos) {
        AccionDFS accion =new AccionDFS(); //AccionDFS para imprimir un formato de DFS
        int raiz = encontrarNodoRaiz(stringRaiz,verticeDeNodos);
        if(raiz<verticeDeNodos.size()){
            Stack<Nodo> pila = new Stack();
            ArrayList<String> visitados  = new ArrayList<>();
            pila.push(verticeDeNodos.get(raiz));
            while(!pila.isEmpty())
            {
                accion.imprimir(pila, visitados);
                Nodo nodoActual= pila.pop();
                if(nodoActual.getDato().equals(nodoABuscar) )
                {
                    System.out.println("Nodo encontrado");
                    visitados.add(nodoActual.getDato());
                    accion.imprimir(pila, visitados);
                    break;
                }
                ArrayList<Nodo> conexionesDelNodoActual = nodoActual.regresarConexionesDeMenorAMayor();
                for (Nodo nodoDeConexionActual : conexionesDelNodoActual) {
                    pila.push(nodoDeConexionActual);
                }
                visitados.add(nodoActual.getDato());
            
            }
        }
        else
        {
            System.out.println("Ingrese una raiz verdadera");
        }
    }
    
}
