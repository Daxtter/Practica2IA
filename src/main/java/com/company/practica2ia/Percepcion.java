/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.practica2ia;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nunez
 */
public class Percepcion {

    public Percepcion() {
    }
    
    
    
    public List<String[]>  regresarMatrizDeAdyacencia() throws IOException{
    List<String[]> matrizDeAdyacencia = leerArchivoGrafoCSV();
    
    if(!matrizDeAdyacenciaValida(matrizDeAdyacencia))
    {
        return null;
    }
        return matrizDeAdyacencia;
        
    }
    public String leerNodoRaiz(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la raiz: ");
            String raiz = sc.nextLine();
            return raiz;
    
    }
    public String leerNodoBuscar(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el nodo a buscar: ");
            String nbuscar = sc.nextLine();
            return nbuscar;
    
    }
     private List<String[]> leerArchivoGrafoCSV() throws IOException
    {
        String ruta;
        List<String[]>bancoDePalabras = new ArrayList<>();
        ruta = System.getProperty("user.dir") + "\\src\\main\\java\\com\\company\\Practica2IA\\Data.csv";
        
        if(existeArchivo(ruta)){
            try {
           // System.out.println("Se leyo");
         
         CSVReader lector = new CSVReader(new FileReader(ruta));
         bancoDePalabras = lector.readAll();
      } catch (IOException e) {
          e.printStackTrace();
          System.out.println("Error al leer ");
         
      }  
      
        }
        return bancoDePalabras;
    }
    public boolean existeArchivo(String ruta)
    {
        File archivo =  new File(ruta);
        return archivo.exists();
    
    
    }
    private boolean matrizDeAdyacenciaValida(List<String[]> matrizDeAdyacencia){
        for (String[] renglonDeAdyacencia : matrizDeAdyacencia) {
            if(renglonDeAdyacencia.length != (matrizDeAdyacencia.size()-1))
            {
                return false;
            }
        }
        
        return true;
    }
    public void crearNodos(List<String[]> matrizDeAdyacencia, ArrayList<Nodo> verticeDeNodos) throws FileNotFoundException, IOException
    {
        String[] cadenaDeNombresNodos = matrizDeAdyacencia.get(0);
        for (int i = 0; i < cadenaDeNombresNodos.length; i++) {
            Nodo nodo = new Nodo(cadenaDeNombresNodos[i]);
            verticeDeNodos.add(nodo);
        }
        
    
    }
    public void creacionDelGrafo(List<String[]> matrizDeAdyacencia,ArrayList<Nodo> verticeDeNodos) throws FileNotFoundException, IOException
    {
        
         
        for (int j = 1; j < matrizDeAdyacencia.size(); j++) {//Este for es para recorrer la matriz de forma vertical
          //En este for empieza en 1 porque el primer renglon de la matriz son los nombres de los nodos 
            for (int i = 0; i <matrizDeAdyacencia.get(1).length; i++) { //Este for es para recorrer de forma horizontal
                if(i!=(j-1)) 
                {
                    if("1".equals(matrizDeAdyacencia.get(j)[i]))
                    {
                        verticeDeNodos.get(j-1).agregarConexion(verticeDeNodos.get(i));
                    }
                }
                
                
            }
        }
                
        
    }

}
