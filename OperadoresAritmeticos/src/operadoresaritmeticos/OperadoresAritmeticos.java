 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author murilonobrega8
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é igual a " + m);
        
        int numero = 10;
        int valor = 4 + numero++;
        System.out.println("Com a var 10+4+ numero++, os valores ficam:");
        System.out.println(valor);
        System.out.println(numero);
        
        int numero2 = 10;
        int valor2 = 4 + ++numero2;
        System.out.println("Com a var 10+4+ ++numero, os valores ficam:");
        System.out.println(valor2);
        System.out.println(numero2);
        
        int numero3 = 10;
        int valor3 = 4 + numero3--;
        System.out.println("Com a var 10+4+ numero--, os valores ficam:");
        System.out.println(valor3);
        System.out.println(numero3);
        
        int numero4 = 10;
        int valor4 = 4 + --numero4;
        System.out.println("Com a var 10+4+ --numero, os valores ficam:");
        System.out.println(valor4);
        System.out.println(numero4);
        
        int x = 4;
        x += 2; // x = x+2
        System.out.println("Se x=4, o resultado de x+=2 (x=x+2) é: " + x);
        
        int xb = 4;
        xb *= 2; // xb = xb*2
        System.out.println("Se x=4, o resultado de x*=2 (x=x*2) é: " + xb);
    }
    
}
