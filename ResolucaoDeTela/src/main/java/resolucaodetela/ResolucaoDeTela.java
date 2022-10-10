/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package resolucaodetela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author murilonobrega8
 */
public class ResolucaoDeTela {

    public static void main(String[] args) {
        Toolkit tk;
        tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.print("Sua Tela tem resolução de: "+d.width);
        System.out.println(" X "+d.height);
    }
}
