/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoreslogicos;

/**
 *
 * @author murilonobrega8
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z;
        x= 4;
        y = 7;
        z = 12;
        boolean r;
        
        // Tabela Verdade. OpLog "e"
        r = (x<y && y<z)?true:false;
        System.out.println(r);
        
        // Tabela Verdade. OpLog "e"
        r = (x<y && y==z)?true:false;
        System.out.println(r);
        
        // Tabela Verdade. OpLog "ou"
        r = (x<y || y==z)?true:false;
        System.out.println(r);
        
        // Tabela Verdade. OpLog "ou exclusivo"
        r = (x<y ^ y==z)?true:false;
        System.out.println(r);
        
        // Tabela Verdade. OpLog "ou exclusivo"
        r = (x<y ^ y<z)?true:false;
        System.out.println(r);
    }
    
}
