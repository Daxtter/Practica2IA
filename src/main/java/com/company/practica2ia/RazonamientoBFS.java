/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.practica2ia;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author nunez
 */
public class RazonamientoBFS extends Razonamiento{

    @Override
    public void metodoDeBusqueda(String stringRaiz, String nodoABuscar, ArrayList<Nodo> verticeDeNodos) {
        AccionDFS accion =  new AccionDFS();
        int raiz = encontrarNodoRaiz(stringRaiz, verticeDeNodos);
        if(raiz<verticeDeNodos.size()){
          
            Queue<Nodo> cola = new LinkedList<>();
            ArrayList<String> visitados  = new ArrayList<>();
            cola.add(verticeDeNodos.get(raiz));
            while(!cola.isEmpty())
            {
                accion.imprimir(cola, visitados);
                Nodo nodoActual= cola.remove();
                if(nodoActual.getDato().equals(nodoABuscar) )
                {
                    System.out.println("Nodo encontrado");
                    accion.imprimir(cola, visitados);
                    break;
                }
                ArrayList<Nodo> conexionesDelNodoActual = nodoActual.regresarConexionesDeMenorAMayor();
                for (Nodo nodoDeConexionActual : conexionesDelNodoActual) {
                    if(!visitados.contains(nodoDeConexionActual.getDato()) && !cola.contains(nodoDeConexionActual))
                        cola.add(nodoDeConexionActual);
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
