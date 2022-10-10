/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repitacomjoptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author murilonobrega8
 */
public class RepitaComJOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "Olá, Mundo!", "Boas Vindas!",
                JOptionPane.WARNING_MESSAGE);
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: "));
        JOptionPane.showMessageDialog(null, "Você digitou o valor " + num);
        
        int num2, soma = 0;
        do {
            num2 = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
            soma += num2;
        } while (num2 != 0);
        JOptionPane.showMessageDialog(null, 
                "<html><center>Resultado Final! <hr>" + "<br>Somatório Vale: " + "<br> " + soma + "</center></html>");
    }
    
}
