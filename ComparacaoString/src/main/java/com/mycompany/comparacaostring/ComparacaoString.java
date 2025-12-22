/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comparacaostring;

/**
 *
 * @author Eletel_Monitor
 */
public class ComparacaoString {

    public static void main(String[] args) {
        String nome1 = "Gilmar";
        String nome2 = "Gilmar";
        String nome3 = new String("Gilmar");
        String res;
        res = (nome1==nome3)?"Igual":"Diferente";
        System.out.println(res);
    }
}
