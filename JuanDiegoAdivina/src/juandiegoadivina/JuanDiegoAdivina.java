/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juandiegoadivina;

/**
 *
 * @author lunero
 */
import java.util.Scanner;
public class JuanDiegoAdivina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n = 0,cont = 0, resultado;
        int x = (int) (41* Math.random() +10);
        //System.out.print(x);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\nIntroduce el valor de X: ");
            n = sc.nextInt();
            if (n > x) {
                System.out.print("Te pasaste Amigo");
            } else if (n < x){
                System.out.print("Casi cerca ...");
            }
            cont++;
        } while (n != x);
        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
        sc.close();
    }
    
}
