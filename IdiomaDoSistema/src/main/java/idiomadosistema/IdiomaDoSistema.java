/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package idiomadosistema;

import java.util.Properties;
import java.util.*;

/**
 *
 * @author murilonobrega8
 */
public class IdiomaDoSistema {

    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        Properties properties = System.getProperties();
        System.out.print("O Idioma do Sistema está em: ");
        System.out.print(loc.getDisplayLanguage());
        System.out.print(" (");
        System.out.print(System.getProperty("user.language"));
        System.out.println(")!");
    }
}
