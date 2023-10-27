package org.calc_imposto;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        nota nota = new nota();
        Scanner input = new Scanner(System.in);

        nota.setPorcento("%");

        System.out.println("Digite o valor total da nota: ");
        nota.setValor_nota(input.nextDouble());

        System.out.println("Digite o valor total dos produtos");
        nota.setValor_produtos(input.nextDouble());

        System.out.println("Digite o valor do frete (SE NÂO HOUVER DIGITE 0)");
        nota.setValor_frete(input.nextDouble());

        System.out.println("Digite o valor das despesas adicionais (SE NÂO HOUVER DIGITE 0)");
        nota.setValor_despesas_adicionais(input.nextDouble());

        nota.calcula_frete();
        nota.calcula_despesas();
        nota.calcula_imposto();
        System.out.println(nota);
    }
}
