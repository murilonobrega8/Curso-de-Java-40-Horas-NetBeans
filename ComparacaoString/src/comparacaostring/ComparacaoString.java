/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author murilonobrega8
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Serve para wraper classes
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String res, res2;
        res = (nome1==nome3)?"igual":"diferente"; // Está comparando Objetos diferentes com conteúdo igual.
        System.out.println(res); // Vai resultar diferente.
        
        res2 = (nome1.equals(nome3))?"igual":"diferente"; // Está comparando conteúdos dos Objetos.
        System.out.println(res2); // Vai resultar igual, pois compara conteúdos.
    }
    
}
