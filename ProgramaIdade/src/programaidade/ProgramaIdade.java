/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author murilonobrega8
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Em que Ano você nasceu? ");
        int nasc = teclado.nextInt();
        int i = 2022-nasc;
        System.out.println("Sua idade é " + i);
        if (i>=18) {
            System.out.println("Maior de Idade!");
        } else {
            System.out.println("Menor de Idade");
        }
    }
    
}
