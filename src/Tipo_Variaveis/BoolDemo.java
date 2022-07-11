/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tipo_Variaveis;

/**
 *
 * @author washi
 */
public class BoolDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean b;

        b = false;

        System.out.println("b is " + b);

        b = true;

        System.out.println("b is " + b);

        if (b) {
            System.out.println("b está em execução");
        } else {
            System.out.println("b não está em execução");
        }
        
        System.out.println("10 > 9 is " + (10 > 9));
    }

}
