/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathread;

/**
 *
 * @author troiano.daniele
 */
public class Conto {
    private int totale;
    private int tasse = 100;

    public Conto(int totale) {
        this.totale = totale;
    }
    public void vers (int somma){
        totale = totale + somma - tasse;
    }
    public int saldo (){
        return totale;
    }

    void versa(int somma) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
