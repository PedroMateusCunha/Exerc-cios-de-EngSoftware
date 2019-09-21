/*
Escreva um algoritmo para ler o número total de eleitores de um município, o número
de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um
representa em relação ao total de eleitores.
*/

import java.util.Scanner;

public class Exe017 {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        votos();
    }

    static void votos() {
        System.out.print("[ ! ] Numero de eleitores: ");
		Double eleitores = sc.nextDouble();
		System.out.print("[ ! ] Votos em Branco: ");
		Double votosBranco = sc.nextDouble();
		System.out.print("[ ! ] Votos Nulos: ");
        Double votosNulos = sc.nextDouble();
        System.out.print("[ ! ] Votos Validos: ");
        Double votosValidos = sc.nextDouble();
        Double percentBrancos = (eleitores/100) * votosBranco;
        Double percentNulos = (eleitores/100) * votosNulos;
        Double percentValidos = (eleitores / 100) * votosValidos;
        System.out.printf("\n\n[ *** ] Votos Validos: %.1f%% \n", percentValidos);
        System.out.printf("[ *** ] Votos Nulos: %.1f%%\n", percentNulos);
        System.out.printf("[ *** ] Votos em Branco: %.1f%%\n\n", percentBrancos);
    }
    
}