/*
Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples
e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que
nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada.
*/

import java.util.Scanner;

public class Exe024 {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        notas();
    }

    static void notas() {
        System.out.print("\n[ ! ] NOTA 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("[ ! ] NOTA 2: ");
        double nota2 = sc.nextDouble();
        double media = (nota1+nota2)/2;

        if (media >= 6) {
            System.out.printf("\n\n[ * ] APROVADO!: Media: %.1f\n", media);
        } else {
            System.out.printf("\n\n[ * ] REPROVADO!: Media: %.1f\n", media);
        }
    }

}