/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuatro;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Cuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
        System.out.println("digite el marcador final : ");
     int marcadorFinal = scan.nextInt();
     int flexiones = 0;
     for ( int i = 7; i <= marcadorFinal; i = i + 7 )
        flexiones = flexiones + i;
      System.out.println("las flexiones realizadas fueron :  "+flexiones);
    }
    
}
