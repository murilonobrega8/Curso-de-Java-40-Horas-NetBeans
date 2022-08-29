/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author murilonobrega8
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome = "Murilo";
        float nota = 8.5f;
        System.out.println("A nota é " + nota);
        System.out.printf("A nota é %.2f \n", nota);
        System.out.printf("A nota de %s é %.4f \n", nome, nota);
        System.out.format("A nota %.3f é de %s \n", nota, nome);
        Scanner teclado = new Scanner(System.in);
    }
    
}
