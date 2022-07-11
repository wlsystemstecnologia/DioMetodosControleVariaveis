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
public class TipoVar {

    public static void main(String args[]) {

        int i;
        // int i; não pode pois tem mesmo nome de cima
        int I; // não dá erro pois é diferente do primeiro case sensitive
        int _1a;
        int $aq; //ferindo as boas praticas apenas exemplo

        i = 10;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10;
        //j = 15; tentando mudar j que é final e não pode mudar

        int quantidadeProduto = 50;

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

    }

}
