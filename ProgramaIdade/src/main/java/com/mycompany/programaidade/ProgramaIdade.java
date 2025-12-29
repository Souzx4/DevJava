/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programaidade;

import java.util.Scanner;

/**
 *
 * @author gilma
 */
public class ProgramaIdade {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Digite o ano de nascimeto: ");
        int  nasc = t.nextInt();
        int i = 2025 - nasc;
        System.out.println("Sua idade é " + i);
        if (i>18) {
            System.out.println("Maior idade");
        } else {
            System.out.println("Menor idade");
        }
    }
}
