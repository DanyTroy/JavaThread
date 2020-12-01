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
public class JavaThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Processo T1 = new Processo ("T1");
        Processo T2 = new Processo ("T2");
        T1.start();
        
//        T2.start();
        T1.sleep(5000);
//        ProcessoRunnable p1 = new ProcessoRunnable ("p1");
//        Thread t1 = new Thread (p1);
//        t1.start();
    }
    
}
