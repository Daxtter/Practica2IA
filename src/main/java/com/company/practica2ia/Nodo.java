package com.company.practica2ia;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import org.apache.commons.lang3.builder.CompareToBuilder;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nunez
 */
public class Nodo implements Comparable<Nodo>{
    private ArrayList<Nodo> conexiones;
    private String dato;
    //Constructor

    public Nodo() {
    }
    
    public Nodo(String dato) { 
        conexiones = new ArrayList<>();
        this.dato = dato;
    }
    public void agregarConexion(Nodo entero)
    {
        conexiones.add(entero);
    }
    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public ArrayList<Nodo> regresarConexionesDeMenorAMayor(){
        Collections.sort(conexiones);
        return conexiones; 
    }
    
    public ArrayList<Nodo> regresarConexionesDeMayorAMenor(){
        
        Collections.sort(conexiones); 
        Collections.reverse(conexiones);
        return conexiones;
    }
    
    @Override
    public String toString() {
        return dato;
}

        
    @Override
    public int compareTo(Nodo o) {
        return getDato().compareTo(o.getDato());
    }
    
    
}
    
        

    

