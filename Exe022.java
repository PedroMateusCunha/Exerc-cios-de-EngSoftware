/*
Ler um valor e escrever se é positivo ou negativo (considere o valor zero como
positivo).
*/

import java.util.Scanner;

public class Exe022 {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        sinal();
    }

    static void sinal() {
        System.out.print("\n[ ! ] Insira um número Inteiro: ");
        int numero = sc.nextInt();
        if (numero >= 0) {
            System.out.println("[ * ] POSITIVO!");
        } else {
            System.out.println("[ * ] NEGATIVO!");
        }
    }

}