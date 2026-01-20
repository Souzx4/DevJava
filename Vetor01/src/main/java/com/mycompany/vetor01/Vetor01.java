/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetor01;

/**
 *
 * @author Eletel_Monitor
 */
public class Vetor01 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int n[] = {3,2,4,5,1,6,9,10,2};
        System.out.println("Total de casas de N " + n.length);
        for(int c=0; c<n.length-1; c++){
            System.out.print(n[c] + " ");
        }
    }
}
