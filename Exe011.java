/*
Analise os algoritmos abaixo e diga o que será impresso na tela ao serem executados:
*/

import java.util.Scanner;

public class Exe011 {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        algoritmo();
    }

    static void algoritmo() {
        int A=100;
        int B=120;
        int C, X, Y, Z=0;
        System.out.println(B);
        B = 234;
        System.out.printf("[ (a) ] %d, %d\n\n", A, B);

        A = 23;
        B = 56;
        C = A+B;
        B = 34;
        A = 67;
        System.out.printf("[ (b) ] %d, %d, %d\n\n", A, B, C);

        A = 300;
        B = 200;
        C = A+B;
        System.out.println(C);
        B = 140;
        System.out.printf("%d, %d\n", B, C);
        C = A + B;
        System.out.printf("[ (c) ] %d, %d, %d\n\n", A, B, C);

        X = 1;
        Y = 23;
        Z = Y-Z;
        System.out.println(Z);
        X = 5;
        Y = X+Z;
        System.out.printf("[ (d) ] %d, %d, %d\n\n", X, Y, Z);
    }



}