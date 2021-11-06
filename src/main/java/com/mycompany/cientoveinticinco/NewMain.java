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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno [] a = new Alumno[3];
        
        a[0] = new Alumno("Jorge", 13, 9.0 );
        a[1] = new Alumno("Alex", 14, 9.5 );
        a[2] = new Alumno("Laura", 12, 10 );
        
        Util.imprimir(a);
        
        System.out.println("ordenar por nombre");
        
        Util.ordenar(a,new CriterioAlumnoNombre());
        Util.imprimir(a);
        
        System.out.println("ordenar por nota promedio");
        
        Util.ordenar(a,new CriterioAlumnoNotaPromedio());
        Util.imprimir(a);
        
        System.out.println("ordenar por edades");
        
        Util.ordenar(a,new CriterioAlumnoEdad());
        Util.imprimir(a);
        
    }
    
}
