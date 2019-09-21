/*
Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem
crescente.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exe027 {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        iguais();
    }

    static void iguais() {
        System.out.print("[ ! ] Insira um Numero Inteiro: ");
		int num1 = sc.nextInt();
		System.out.print("[ ! ] Insira outro Numero Inteiro: ");
        int num2 = sc.nextInt();
        
        while (num2==num1) {
            System.out.println("[ !!! ] Numero Invalido");
            System.out.print("[ ! ] Insira outro Numero Inteiro: ");
            num2 = sc.nextInt();

        }

		List<Integer> listaDeNumeros = new ArrayList<>();
		listaDeNumeros.add(num1);
		listaDeNumeros.add(num2);
		Collections.sort(listaDeNumeros);
		System.out.println("[ *** ] Ordem Crescente: " + listaDeNumeros);
    }

}