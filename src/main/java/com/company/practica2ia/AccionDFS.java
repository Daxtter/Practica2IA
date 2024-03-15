/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.practica2ia;

import java.util.ArrayList;

/**
 *
 * @author nunez
 */
public class AccionDFS extends Accion{

    public AccionDFS() {
    }

    
    @Override
    public void imprimir(Object porVisitar, ArrayList<String> visitados) {
        System.out.print("Visitados [");
        for (String visitado : visitados) {
            System.out.print(visitado+ " ");
        
        }
        System.out.print("]");
        System.out.println(" Pila: "+porVisitar.toString());
        
    }
    
}
