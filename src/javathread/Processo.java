/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathread;

/**
 *
 * @author danie
 */
public class Processo {
    public String s;
    public Processo (String s){
        this.s = s;
        this.run();
    }
    public void run () {
        for(;;) System.out.println(s);
    }
}
