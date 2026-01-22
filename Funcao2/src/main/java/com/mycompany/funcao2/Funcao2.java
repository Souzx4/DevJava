/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funcao2;

/**
 *
 * @author gilma
 */
public class Funcao2 {

    static int soma(int a, int b){
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        System.out.println("Comecou o programa");
        int sm = soma(5,2);
        System.out.println("A soma vale " + sm);
    }
}
