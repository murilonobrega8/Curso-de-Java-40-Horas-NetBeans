/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao01;

/**
 *
 * @author murilonobrega8
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    
    static void soma (int a, int b) { // PROCEDIMENTO
        int s = a + b;
        System.out.println("A soma é " + s);
    }
    
    static int soma2 (int a2, int b2) { // MÉTODO
        int s2 = a2 + b2;
        return s2;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o programa...");
        soma (5, 2);
        
        System.out.println("Agora, um método com Retorno:");
        int sm = soma2 (3, 8);
        System.out.println("A soma2 vale " + sm);
    }
    
}
