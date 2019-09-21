/*
A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que
trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular
com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas
trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário,
que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere
que o mês possua 4 semanas exatas).
*/

import java.util.Scanner;

public class Exe029 {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        horaExtra();
    }

    static void horaExtra() {
        System.out.print("[ ! ] Horas trabalhadas: ");
		double horasTrabalhadas = sc.nextDouble();
		System.out.print("[ ! ] Salario por hora: ");
        double salarioPorHora = sc.nextDouble();
        double valorHora = salarioPorHora + salarioPorHora*0.5;
        if ( horasTrabalhadas > 40 ) {
            System.out.printf("[ *** ] Salario Total: R$ %.2f\n", (salarioPorHora*40*4)+(valorHora*(horasTrabalhadas-40)));
        } else {
            System.out.printf("[ *** ] Salario Total: R$ %.2f\n", horasTrabalhadas*salarioPorHora*4);
        }
    }

}