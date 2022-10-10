/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supercalculadorajoptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author murilonobrega8
 */
public class SuperCalculadoraJOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, soma = 0, valor = 0, par = 0, impar = 0, cem = 0, media = 0;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
            valor += 1;
            if (num%2==0) {
                par += 1;
            } else {
                impar += 1;
            }
            if (num>=100) {
                cem += 1;
            } 
            soma += num;
        } while (num != 0);
        media = soma / (valor-1);
        JOptionPane.showMessageDialog(null, 
                "<html><center>Resultado Final! <hr>" 
                 + "<br>Total de Valores: " + (valor-1) 
                 + "<br>Total de Pares: " + (par-1)
                 + "<br>Total de Ímpares: " + impar
                 + "<br>Acima de 100: " + cem
                 + "<br>Média dos Valores: " + media
                 + "</center></html>");
    }
    
}
