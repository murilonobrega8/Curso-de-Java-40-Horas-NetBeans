/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

/**
 *
 * @author murilonobrega8
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num[] = {3,2,8,7,5,4};
        System.out.println("Total de casas da variável 'num': " + num.length);
        for (int contador = 0; contador <= num.length-1; contador++) {
            System.out.println("Na posição " + contador + ", temos o valor " + num[contador] + ";");
        }
    }
    
}
