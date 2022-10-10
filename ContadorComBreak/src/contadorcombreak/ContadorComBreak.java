/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadorcombreak;

/**
 *
 * @author murilonobrega8
 */
public class ContadorComBreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contcamb = 0;
        while (contcamb<10) {
            contcamb++;
            if (contcamb == 2 || contcamb == 3 || contcamb == 4) { // Vai interromper 2, 3 e 4 e não vai imprimir 2, 3 e 4.
                continue; //Sempre que tiver CONTINUE, o laço interrompe e continua do próximo.
            }
            if (contcamb == 7) { // Vai Interromper e encerrar o bloco.
                break; //Sempre que tiver BREAK, o laço interrompe e encerra o bloco.
            }
            System.out.println("Cambalhota nº " + contcamb);
        }
        
    }
    
}
