/*
A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco)
prestações sem juros. Faça um algoritmo que receba um valor de uma
compra e mostre o valor das prestações.
*/

import java.util.Scanner;

public class Exe007 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        rendimento();
    }

    static void rendimento() {
        System.out.print("\n\n[ ! ] Valor da compra: R$ ");
        double compra = sc.nextDouble();
        double prestacao = compra/5;
        System.out.print("\n");
        int i;
        for(i=1;i<6;i++){
        System.out.printf("[ %d ] Prestação %d : R$ %.2f\n", i, i, prestacao);
        }

        
    }

}
