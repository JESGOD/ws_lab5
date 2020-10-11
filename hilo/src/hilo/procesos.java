/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilo;

/**
 *
 * @author zambo
 */
public class procesos implements Runnable{

    private final int n;

    public procesos(String nom; int n) {
        this.n = n;
        Thread h = new Thread(this, nom);
        
    }
   
    
}



