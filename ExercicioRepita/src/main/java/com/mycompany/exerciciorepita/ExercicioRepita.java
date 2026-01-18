/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciorepita;

import javax.swing.JOptionPane;
//import javax.swing.ImageIcon; // imagens

/**
 *
 * @author gilma
 */
public class ExercicioRepita {

    public static void main(String[] args) {
        //ImageIcon icone = new ImageIcon("Caminho/para/sua/imagem.png")
        //JOptionPane.showMessageDialog(null, "Olá, mundo", "Boas Vindas", JOptionPane.WARNING_MESSAGE);
        
        //JOptionPane.showMessageDialog(null, "Você digitou o valor " + n);
        int n, s = 0, totPar = 0, totInp = 0, maior = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html> Informe um numero: <br><em>[valor [0] interrompe]</em> </html>"));
            s += n;
            if (n != 0) {
                if (n % 2 == 0) {
                    totPar++;
                } else {
                    totInp++;
                }
            }
            if (n >= 100){
                maior++;
            }
            
        } while (n != 0);
        int totNum = totPar + totInp;
        
        double media = 0;
        if (totNum > 0) {
            media = (double) s / totNum;
        }
        
        JOptionPane.showMessageDialog(null, "<html>Resultado:<hr>" + 
                "<br>Total de valores: " + s + 
                "<br> Toral de pares: " + totPar +
                "<br> total de impares: " + totInp +
                "<br> Acima de 100: " + maior +
                "<br> Media dos Valores: " + media + "</html>");
        
    }
}
