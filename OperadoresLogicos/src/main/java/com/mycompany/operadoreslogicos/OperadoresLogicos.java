/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadoreslogicos;

/**
 *
 * @author Eletel_Atendimento
 */
public class OperadoresLogicos {

    public static void main(String[] args) {
        int x, y, z;
        x = 7;
        y = 6;
        z = 1;
        boolean r;
        r = (x<y ^ y>z)?true:false;
        System.out.println(r);
    }
}
