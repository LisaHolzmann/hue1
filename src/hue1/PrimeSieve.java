/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue1;

/**
 *
 * @author holzm
 */
public interface PrimeSieve {

    //schaut ob p Primzahl
    public boolean isPrime(int p);

    //gibt Primzahlen bis zur Obergrenze aus
    public void printPrimes();

}
