/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pernasprograma;

import java.util.Scanner;

/**
 *
 * @author Eletel_Monitor
 */
public class PernasPrograma {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Quantas Pernas?");
        int perna = tec.nextInt();
        String tipo;
        System.out.print("Isso é um(a) ");
        switch (perna) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bibede";
                break;
            case 3:
                tipo = "Tripe";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println(tipo);
    }
}
