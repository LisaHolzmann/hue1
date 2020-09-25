/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue1;

import java.util.Scanner;

/**
 *
 * @author holzm
 */
public class EratosthenesPrimeSieve implements PrimeSieve {

    int grenze;
    static int[] primeArray = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1252");
        System.out.println("Obergrenze:");
        int ausw = Integer.parseInt(scanner.nextLine());
        EratosthenesPrimeSieve ep = new EratosthenesPrimeSieve(ausw);
        ep.printPrimes();
    }

    public EratosthenesPrimeSieve(int grenze) {
        primeArray = new int[grenze];
        //this.grenze = grenze;
    }

    @Override
    public boolean isPrime(int p) {
        if (p <= 1) {
            return false;
        }
        if (p == 2) {
            return true;
        }

        for (int i = 2; i < p; i++) {

            if (p % i == 0) {
                return false;
            }
        }
        return false;
    }

    @Override
    public void printPrimes() {
        for (int i = 0; i < primeArray.length; i++) {
            primeArray[i] = i;
        }
        for (int i = 0; i < primeArray.length; i++) {
            if (isPrime(primeArray[i]) == true) {
                primeArray[i] = null;
            }
        }
        System.out.println(primeArray);
    }

}
