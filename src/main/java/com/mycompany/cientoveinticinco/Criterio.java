/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cientoveinticinco;

/**
 *
 * @author Esther
 * @param <T>
 */
public interface Criterio <T> {
    public int comparar(T a, T b);
    
}
