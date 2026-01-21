/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.charat;

/**
 *
 * @author Eletel_Atendimento
 */
public class CharAt {

    public static void main(String[] args) {
        String s = "CURSOEMVIDEO";
        char[] r = new char[12];
        for (int c=s.length()-1; c>=0; c--){ //de tras para a frente
             r[c] = s.charAt(c);//caractere na posição 11
        }
        for (char l:r){
            System.out.print(l);
        }
    }
}
