/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.practica2ia;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nunez
 */
public class AgenteBFS {
    private ArrayList<Nodo> grafo;
    Percepcion percepcion;
    //accion esta integrada en razonamiento
    RazonamientoBFS razonamiento;
    public AgenteBFS() {
        grafo = new ArrayList<>();
        percepcion = new Percepcion();
        razonamiento = new RazonamientoBFS();
    }
    
    public void iniciar() throws IOException{
    Scanner sc = new Scanner(System.in);
    List<String[]> matrizDeAdyacencia;
    String nodoB;
    String nodoR;
    while(true){
        System.out.println("Ingresa enter para leer el grafo e iniciar el metodo de busqueda BFS");
        sc.nextLine();
        matrizDeAdyacencia = percepcion.regresarMatrizDeAdyacencia();
        if(matrizDeAdyacencia!=null)
        {
            percepcion.crearNodos(matrizDeAdyacencia, grafo); //Aqui se crean los nodos a usar
            percepcion.creacionDelGrafo(matrizDeAdyacencia, grafo); //Aqui se crean las conexiones
            nodoR = percepcion.leerNodoRaiz();
            nodoB = percepcion.leerNodoBuscar();
            razonamiento.metodoDeBusqueda(nodoR, nodoB, grafo);
            
        }
        else
        {
            System.out.println("Error, vuelva a ingresar un grafo");
        }
        
    
    }
    
    
    
    }
    
}

