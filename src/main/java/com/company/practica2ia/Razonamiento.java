/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.practica2ia;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author nunez
 */
public abstract class Razonamiento {
    public abstract void metodoDeBusqueda(String stringRaiz, String nodoABuscar, ArrayList<Nodo> verticeDeNodos);
    int encontrarNodoRaiz(String stringRaiz,ArrayList<Nodo> verticeDeNodos)
    {
        int indiceDeLaRaiz = 0;
        
        for (Nodo nodo : verticeDeNodos) {
            if(nodo.getDato().equals(stringRaiz))
                break;
            indiceDeLaRaiz++;
        }
        return indiceDeLaRaiz;
    }
    
    
}
