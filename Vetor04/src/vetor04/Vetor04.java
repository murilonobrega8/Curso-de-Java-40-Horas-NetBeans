/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author murilonobrega8
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vetor[] = {3, 7, 6, 1, 9, 4, 2};
        for (int vet: vetor) {
            System.out.print(vet + " ");
        }
        System.out.println("");
        int posicao = Arrays.binarySearch(vetor, 1);
        System.out.println("Encontrei o valor na posição " + posicao);
    }
    
}
