/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tipo_Variaveis;


public class escopoDemo {

     public static void main(String[] args) {

         int x; //conhecida pelo código dentro da main()
         
         x = 10;
         
         if(x == 10){ // inicia novo escopo
             int y = 20; // conhecida apenas no bloco
             
             System.out.println("x and y: " + x + " " + y);
             x = y * 2;
         }
         
         //y = 100; erro fora do escopo
         System.out.println(x);
         
         
         
    }
    
}
