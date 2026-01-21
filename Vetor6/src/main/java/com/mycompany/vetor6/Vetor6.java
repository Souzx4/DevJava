/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetor6;

/**
 *
 * @author Eletel_Atendimento
 */
public class Vetor6 {

    public static void main(String[] args) {
        int v[] = {2, 0, 3, 9};
        v[v[2]] = v[v[1]]; //um dentro do outro ex: vetor 2 que é 3 dentro de vetor 3 que é 9
        for (int i: v){
            System.out.print(i + " ");
        }
    }
}
