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
public class polegadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        long ci;
        long im;
        
        im = 5280 * 12;
        
        ci = im * im * im;
        
        System.out.println("Existem " + 
                ci + " polegadas cubicas em milhas cubicas ");
        
        
    }
    
}
