/*
Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e
escrever a área do retângulo.
*/

import java.util.Scanner;

public class Exe015 {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        areaDoRetangulo();
    }

    static void areaDoRetangulo() {
        System.out.print("[ ! ] Base: ");
        double b = sc.nextInt();
        System.out.print("[ ! ] Altura: ");
        double h = sc.nextInt();
        System.out.printf("\n\n[ *** ] Area do Retangulo: %.2f\n\n", b*h);
    }

}