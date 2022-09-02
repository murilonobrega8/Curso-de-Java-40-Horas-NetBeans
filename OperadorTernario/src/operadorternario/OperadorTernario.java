/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorternario;

/**
 *
 * @author murilonobrega8
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, r, r2;
        n1 = 14;
        n2 = 8;
        r = (n1>n2)?n1:n2;
        System.out.println(r);
        
        //Inserindo fórmulas no valor a ser exibido
        r2 = (n1>n2)?n1+n2:n1-n2;
        System.out.println(r2);
    }
    
}
