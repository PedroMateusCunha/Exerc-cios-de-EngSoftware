/*
Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual
de reajuste. Calcular e escrever o valor do novo salário.
*/

import java.util.Scanner;

public class Exe018 {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        votos();
    }

    static void votos() {
        System.out.print("[ ! ] Salario Mensal: ");
		Double salarioMensal = sc.nextDouble();
		System.out.print("[ ! ] Porcentagem de Aumento: ");
        Double aumento = sc.nextDouble();
        aumento = salarioMensal*(aumento/100);
        Double salarioTotal = salarioMensal + aumento;
        System.out.printf("\n\n[ *** ] Salario Atual: R$ %.2f\n", salarioMensal);
        System.out.printf("[ *** ] Aumento: R$ %.2f\n", aumento);
        System.out.printf("[ *** ] Salario Total: R$ %.2f\n\n", salarioTotal);
    }
    
}