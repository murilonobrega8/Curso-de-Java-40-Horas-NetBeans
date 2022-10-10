/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadorcomcontinue;

/**
 *
 * @author murilonobrega8
 */
public class ContadorComContinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contcamb = 0;
        while (contcamb<10) {
            contcamb++;
            if (contcamb == 5 || contcamb == 7) { // Vai interromper 5 e 7 e não vai imprimir 5 e 7.
                continue; //Sempre que tiver CONTINUE, o laço interrompe e continua do próximo.
            }
            System.out.println("Cambalhota nº " + contcamb);
        }
        
    }
    
}
