/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cientoveinticinco;

/**
 *
 * @author Esther
 */
public class Util {
    
    //ordenar
    public static <T> void ordenar(T arr[], Criterio<T> cr){
        for(int n = 0; n < arr.length; n++){
            for(int j = 0; j < arr.length - 1 ; j++){
                if(cr.comparar(arr[j], arr[j+1]) > 0){
                    T aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    }
    
    //imprimir 
    public static <T> void imprimir(T[]obj){
        for(int i = 0; i < obj.length; i++){
            System.out.println(obj[i]);
        }
    }
}
