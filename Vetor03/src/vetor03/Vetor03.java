/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author murilonobrega8
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double vetorvalor[] = {3.5, 2.75, 9, -4.5};
        for (double valor: vetorvalor) { //* for each - não contém o passo e o separador é : e não ;*/
            System.out.print(valor + " ");
        }
        System.out.println("");
        Arrays.sort(vetorvalor);
        for (double valor: vetorvalor) { //* for each - não contém o passo e o separador é : e não ;*/
            System.out.print(valor + " ");
        }
    }
    
}
