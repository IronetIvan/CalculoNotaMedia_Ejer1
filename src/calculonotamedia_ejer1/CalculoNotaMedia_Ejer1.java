/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculonotamedia_ejer1;
import java.util.*;
/**
 *
 * @author Usuario DAM 1
 */
public class CalculoNotaMedia_Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double nota1;
        double notafinal;
        double nota2;
        
        System.out.println("Introduce la primera nota; ");
        nota1 = sc.nextDouble();
        System.out.println("Introduce nota que deseas sacar en el trimestre: ");
        notafinal = sc.nextDouble();
        
        nota2 = ((notafinal*100)- (nota1 *40)) /60;
        
        System.out.println("Para tener un " + notafinal + " en el trimestre necesitas sacar un " + nota2 + " en el segundo examen");
    }
    
}
