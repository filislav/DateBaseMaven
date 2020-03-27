/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.fvv.jborn.databasemaven;

/**
 *
 * @author slava
 */
public class DivisionService {
    public double divide(double a, double b){
        if(b==0.0){
            throw new IllegalArgumentException();
        }
        return a/b;
    }
    
}
