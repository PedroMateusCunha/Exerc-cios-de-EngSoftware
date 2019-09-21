/*

*/

import java.util.Scanner;

public class Exe030 {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        pesoIdeal();
    }

    static void pesoIdeal() {
        System.out.print("[ ! ] Nome: ");
		String nome = sc.next();
		System.out.print("[ ! ] Sexo = [M] [F]: ");
        String sexo = sc.next();
        System.out.print("[ ! ] Altura: ");
        double altura = sc.nextDouble();
        double peso = 0;
        if (sexo.equals("M")) {
            peso = (72.7*altura)-58;
            System.out.printf("[ *** ] Peso Ideal para %s eh de %.2f Kg\n", nome, peso);
        } else {
            if (sexo.equals("F")) {
                peso = (62.1*altura)-44.7;
                System.out.printf("[ *** ] Peso Ideal para %s eh de %.2f Kg\n", nome, peso);
            } else {
                System.out.println("[ !!! ] Opcao Invalida");
            }
        }

    }

}