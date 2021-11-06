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
public class CriterioAlumnoNombre implements Criterio <Alumno>{

    @Override
    public int comparar(Alumno a, Alumno b) {
        return a.getNombre().compareTo(b.getNombre());
    }
    
}
