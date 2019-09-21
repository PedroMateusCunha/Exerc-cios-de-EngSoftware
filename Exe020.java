/*
Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo
por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor
das vendas por ele efetuadas. Escrever um algoritmo que leia o número de carros por
ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe por
carro vendido. Calcule e escreva o salário final do vendedor.
*/

import java.util.Scanner;

public class Exe020 {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        custoTotal2();
    }

    static void custoTotal2() {
        System.out.print("\n[ ! ] Numero de Carros Vendidos: ");
        int numeroDeCarrosVendidos = sc.nextInt();
        System.out.print("[ ! ] Valor Total de Vendas: ");
        double valorTotalDeVendas = sc.nextDouble();
        System.out.print("[ ! ] Salario Fixo: ");
        double salarioFixo = sc.nextDouble();
        System.out.print("[ ! ] Comissao por Carro: ");
        double comissaoPorCarro = sc.nextDouble();
        double salarioTotal = (salarioFixo + comissaoPorCarro*numeroDeCarrosVendidos
                                +valorTotalDeVendas*0.05);
        System.out.printf("\n\n[ *** ] Salario Total: R$ %.2f\n\n", salarioTotal);
    }

}