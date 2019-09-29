/**
*Cada questao foi solucionada no formato de metodo.
*Confira as questoes no PDF
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class solucoes {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\t\t\t######## SOLUCOES ########");
        System.out.print("[1]\t\t[2]\t\t[3]\t\t[4]\t\t[5]\n");
        System.out.print("[6]\t\t[7]\t\t[8]\t\t[9]\t\t[10]\n");
        System.out.print("[11]\t\t[12]\t\t[13]\t\t[14]\t\t[15]\n");
        System.out.print("[16]\t\t[17]\t\t[18]\t\t[19]\t\t[20]\n");
        System.out.print("[21]\t\t[22]\t\t[23]\t\t[24]\t\t[25]\n");
        System.out.print("[26]\t\t[27]\t\t[28]\t\t[29]\t\t[30]\n");
        System.out.print("[31]\t\t[32]\t\t[33]\t\t[34]\t\t[35]\n");
        System.out.print("[36]\t\t[37]\t\t[38]\t\t[39]\t\t[40]\n");
        System.out.print("[41]\t\t[42]\t\t[43]\t\t[44]\t\t[45]\n");
        System.out.print("[46]\t\t[47]\t\t[48]\t\t[49]\t\t[50]\n");
        System.out.print("[51]\t\t[52]\t\t[53]\t\t[54]\t\t[55]\n");
        System.out.print("\n\n[ ! ] Insira o codigo da questao: ");


        int questao = sc.nextInt();
        switch (questao) {
            case 1:
                q01();
                break;
            case 2:
                q02();
                break;
            case 3:
                q03();
                break;
            case 4:
                q04();
                break;
            case 5:
                q05();
                break;
            case 6:
                q06();
                break;
            case 7:
                q07();
                break;
            case 8:
                q08();
                break;
            case 9:
                q09();
                break;
            case 10:
                q10();
                break;
            case 11:
                q11();
                break;
            case 12:
                q12();
                break;
            case 13:
                q13();
                break;
            case 14:
                q14();
                break;
            case 15:
                q15();
                break;
            case 16:
                q16();
                break;
            case 17:
                q17();
                break;
            case 18:
                q18();
                break;
            case 19:
                q19();
                break;
            case 20:
                q20();
                break;
            case 21:
                q21();
                break;
            case 22:
                q22();
                break;
            case 23:
                q23();
                break;
            case 24:
                q24();
                break;
            case 25:
                q25();
                break;
            case 26:
                q26();
                break;
            case 27:
                q27();
                break;
            case 28:
                q28();
                break;
            case 29:
                q29();
                break;
            case 30:
                q30();
                break;
            case 31:
                q31();
                break;
            case 32:
                q32();
                break;
            case 33:
                q33();
                break;
            case 34:
                q34();
                break;
            case 35:
                q35();
                break;
            case 36:
                q36();
                break;
            case 37:
                q37();
                break;
            case 38:
                q38();
                break;
            case 39:
                q03();
                break;
            case 40:
                q40();
                break;
            case 41:
                q41();
                break;
            case 42:
                q42();
                break;
            case 43:
                q43();
                break;
            case 44:
                q44();
                break;
            case 45:
                q45();
                break;
            case 46:
                q46();
                break;
            case 47:
                q47();
                break;
            case 48:
                q48();
                break;
            case 49:
                q49();
                break;
            case 50:
                q50();
                break;
            case 51:
                q51();
                break;
            case 52:
                q52();
                break;
            case 53:
                q53();
                break;
            case 54:
                q54();
                break;
            case 55:
                q55();
                break;
            default:
                break;
        }
    }

    static void q01() {
        System.out.print("\n\n[ ! ] Insira um número inteiro: ");
        int num1 = sc.nextInt();
        System.out.print("[ ! ] Insira um número inteiro: ");
        int num2 = sc.nextInt();
        System.out.println("\n\n[ + ]: SOMA = " + (num1 + num2));
        System.out.println("[ - ]: SUBTRAÇÃO = " + (num1 - num2));
        System.out.println("[ * ]: MULTIPLICAÇÃO = " + (num1 * num2));
        System.out.println("[ / ]: DIVISÃO = " + (num1 / num2));

    }

    static void q02() {
        System.out.print("\n\n[ ! ] Insira a Distanância em KM: ");
        int km = sc.nextInt();
        System.out.print("[ ! ] Insira a Quantidade de Gasolina em Litros: ");
        int litros = sc.nextInt();
        System.out.println("\n\n[ *** ] Consumo médio de: " + (km / litros) + "km/l");
    }

    static void q03() {
        System.out.print("\n\n[ ! ] Nome: ");
        String nome = sc.nextLine();
        System.out.print("[ ! ] Salário Inicial: ");
        double salarioFixo = sc.nextDouble();
        System.out.print("[ ! ] Total de Vendas: ");
        int totalDeVendas = sc.nextInt();
        System.out.println("\n\n[ *** ] Nome: " + nome + "\nSalário: R$" + (salarioFixo + (totalDeVendas * 0.15)));
    }

    static void q04() {
        System.out.print("\n\n[ ! ] Insira a temperatura em Celcius: ");
        float temperaturaEmCelsius = sc.nextFloat();
        float temperaturaEmFahrenheit;
        temperaturaEmFahrenheit = (9*temperaturaEmCelsius+160)/5;
        System.out.println("\n\n[ *** ] Temperatura em Fahrenheit: " + temperaturaEmFahrenheit + "F");
    }

    static void q05() {
        System.out.print("\n\n[ ! ] Valor atual do Dolar em Real: R$ ");
        float cotacaoAtual = sc.nextFloat();
        System.out.print("[ ! ] Quantidade em Dolar: U$$ ");
        float quantidadeDeDolar = sc.nextFloat();
        float valorEmReal = quantidadeDeDolar * cotacaoAtual;
        System.out.println("\n\n[ *** ] Reais R$: " + valorEmReal);
    }

    static void q06() {
        System.out.print("\n\n[ ! ] Valor depositado: R$ ");
        double deposito = sc.nextDouble();
        double rendimento = deposito +( deposito * 0.17);
        System.out.println("\n\n[ *** ] Valor total R$: " + rendimento);
    }

    static void q07() {
        System.out.print("\n\n[ ! ] Valor da compra: R$ ");
        double compra = sc.nextDouble();
        double prestacao = compra/5;
        System.out.print("\n");
        int i;
        for(i=1;i<6;i++){
        System.out.printf("[ %d ] Prestação %d : R$ %.2f\n", i, i, prestacao);
        } 
    }

    static void q08() {
        System.out.print("\n\n[ ! ] Insira o custo do produto: R$ ");
        float custo = sc.nextFloat();
        System.out.print("[ ! ] Insira o percentual de venda: ");
        float percentual = sc.nextFloat();
        System.out.printf("\n\n[ *** ] Valor de venda %.2f", custo+(custo*(percentual/100)));
    }

    static void q09() {
        System.out.print("\n[ ! ] Insira o custo de fábrica: R$ ");
        double custoDeFabrica = sc.nextDouble();
        double impostos = custoDeFabrica+custoDeFabrica*0.45;
        double percentagemDoDistribuidor = impostos + impostos*0.28;
        System.out.printf("\n\n[ *** ] Valor de compra: R$ %.2f\n", percentagemDoDistribuidor);
    }

    static void q10() {
        int A=10;
        int B=20;
        int temp;
        temp = A;
        A=B;
        B=temp;
        System.out.printf("\n\n[ *** ] A:%d B:%d\n", A,B);
    }

    static void q11() {
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

    static void q12() {
        float A1 = (4/2)+(2/4), A2 = 4/2+2/4;
        float B1 = 4/(2+2)/4, B2 = 4/2+2/4;
        float C1 = (4+2)*2-4, C2 = 4+2*2-4;
        if (A1 == A2) {
            System.out.println("A1=A2");
        }else{
            System.out.println("A1!=A2");
        }
        if (B1 == B2) {
            System.out.println("B1=B2");
        }else{
            System.out.println("B1!=B2");
        }
        if (C1 == C2) {
            System.out.println("C1=C2\n\n");
        }else{
            System.out.println("C1!=C2\n\n");
        }
        System.out.printf("A1:%f, A2:%f, B1:%f, B2:%f, C1:%f, C2:%f\n", A1,A2,B1,B2,C1,C2);
    }

    static void q13() {
        double a = 6*(3+2);
		double b = 6 * (3+2) + 2;
		double c = 2 + 3 * 6 / (2 + 4);
		double d = 2*8/(3+1);
		double e = 3+(16-2)/(2*(9-2));
		double f = 6/3 + 8/2;
		double g = (3+8/2)*4+3*2;
		double h = 6*3*3+6-10;
		double i = (10*8+3)*9;
        double j = -12*-4+3*-4;
        System.out.printf("a:%.1f, b:%.1f, c:%.1f, d:%.1f, e:%.1f, f:%.1f, g:%.1f, h:%.1f, i:%.1f, j:%.1f\n\n", a, b, c, d, e, f, g, h, i, j);
    }

    static void q14() {
        System.out.print("[ ! ] Insira um número Inteiro: ");
        int val = sc.nextInt();
        System.out.printf("\n\n[ *** ] A:%d S:%d\n", val-1,val+1);
    }

    static void q15() {
        System.out.print("[ ! ] Base: ");
        double b = sc.nextInt();
        System.out.print("[ ! ] Altura: ");
        double h = sc.nextInt();
        System.out.printf("\n\n[ *** ] Area do Retangulo: %.2f\n\n", b*h);
    }

    static void q16() {
        System.out.print("[ ! ] Anos: ");
		int anos = sc.nextInt();
		System.out.print("[ ! ] Meses: ");
		int meses = sc.nextInt();
		System.out.print("[ ! ] Dias: ");
		int dias = sc.nextInt();
		System.out.println("[ *** ]Idade em dias: " + ((365 * anos) + (meses * 30) + dias));
    }

    static void q17() {
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

    static void q18() {
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

    static void q19() {
        System.out.print("\n[ ! ] Insira o custo de fábrica: R$ ");
        double custoDeFabrica = sc.nextDouble();
        double impostos = custoDeFabrica+custoDeFabrica*0.45;
        double percentagemDoDistribuidor = impostos + impostos*0.28;
        System.out.printf("\n\n[ *** ] Valor de compra: R$ %.2f\n", percentagemDoDistribuidor);
    }

    static void q20() {
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

    static void q21() {
        System.out.print("\n[ ! ] Insira um número Inteiro: ");
        int numero = sc.nextInt();
        if (numero > 10) {
            System.out.println("\n\n[ * ] E MAIOR QUE 10!");
        } else {
            System.out.println("[ * ] NAO E MAIOR QUE 10!");
        }
    }

    static void q22() {
        System.out.print("\n[ ! ] Insira um número Inteiro: ");
        int numero = sc.nextInt();
        if (numero >= 0) {
            System.out.println("[ * ] POSITIVO!");
        } else {
            System.out.println("[ * ] NEGATIVO!");
        }
    }
    static void q23() {
        System.out.print("\n[ ! ] Quantidade de Macas: ");
        double numero = sc.nextDouble();
        if (numero >= 12) {
            System.out.printf("[ * ] Preço: R$ %.2f\n", numero*1);
        } else {
            System.out.printf("[ * ] Preço: R$ %.2f\n", numero*1.3);
        }
    }

    static void q24() {
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

    static void q25() {
        System.out.print("\n[ ! ] Ano Atual: ");
        int anoAtual = sc.nextInt();
        System.out.print("[ ! ] Ano de Nascimento: ");
        int anoNascimento = sc.nextInt();
        int idade = anoAtual-anoNascimento;
        if (idade >= 16) {
            System.out.printf("\n\n[ * ] %d | Pode Votar\n", idade);
        } else {
            System.out.printf("\n\n[ * ] %d | Não pode Votar\n", idade);
        }
    }

    static void q26() {
        System.out.print("[ ! ] Insira um Numero Inteiro: ");
		int num1 = sc.nextInt();
		System.out.print("[ ! ] Insira outro Numero Inteiro: ");
        int num2 = sc.nextInt();
		while (num2==num1) {
            System.out.println("[ !!! ] Numero Invalido");
            System.out.print("[ ! ] Insira outro Numero Inteiro: ");
            num2 = sc.nextInt();
        }
        if (num1 > num2) {
            System.out.println("\n\n[ *** ] Maior: " + num1);
        } else {
            System.out.println("\n\n[ *** ] Maior: " + num2);
        }
    }

    static void q27() {
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

    static void q28() {
        System.out.print("[ ! ] Hora de incio da partida: ");
		int inicio = sc.nextInt();
		System.out.print("[ ! ] Hora do termino da partida: ");
        int fim = sc.nextInt();
        int duracao = (24-inicio) + fim;
        System.out.printf("[ *** ] Duracao da Partida: %d horas\n\n", duracao);
    }

    static void q29() {
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

    static void q30() {
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

    static void q31() {
		System.out.print("[ ! ] Salario Fixo: ");
		double salarioFixo = sc.nextDouble();
		System.out.print("[ ! ] Valor de Vendas: ");
		double valorDeVendas = sc.nextDouble();
		double bonus = (valorDeVendas-1500) * 0.05;
		double salarioFinal = 0;
		if (bonus > 0) {
			salarioFinal = salarioFixo + (1500*0.03) + bonus;
		} else {
			salarioFinal = salarioFixo + (valorDeVendas * 0.03);
		}
		System.out.println("[ *** ] Salario final: R$" + salarioFinal);
    }
    
    static void q32() {
		System.out.print("[ ? ] Numero da conta: ");
		String numeroConta = sc.next();
		System.out.print("[ + ] Saldo: ");
		double saldo = sc.nextDouble();
		System.out.print("[ - ] Debito: ");
		double debito = sc.nextDouble();
		System.out.print("[ ~ ] Credito: ");
		double credito = sc.nextDouble();
		double saldoAtual = saldo - debito + credito;
		if (saldo > 0) System.out.println("[ +++ ] Saldo positio");
		else System.out.println("[ --- ] Saldo negativo");
		System.out.printf("\n\n[ *** ] Conta: %s\tSaldo: R$ %.2f\n", numeroConta, saldoAtual);
    }
    
    static void q33() {
		System.out.print("[ * ] Quantidade atual em estoque: ");
		int qtdEmEstoque = sc.nextInt();
		System.out.print("[ + ] Quantidade maxima em estoque: ");
		int qtdMaxEstoque = sc.nextInt();
		System.out.print("[ - ] Quantidade minima em estoque: ");
		int qtdMinEstoque = sc.nextInt();
		double qtdMediaEstoque = (qtdMaxEstoque - qtdMinEstoque) / 2;
		if (qtdEmEstoque >= qtdMediaEstoque) System.out.println("[ ! ] Nao efetuar compra");
		else System.out.println("[ ! ] Efetuar compra");
    }
    
    static void q34() {
		System.out.print("[ ! ] Valor: ");
		int valor = sc.nextInt();
		if (valor > 0) System.out.println("[ * ] Positivo!");
		else if (valor < 0) System.out.println("[ * ] Negativo!");
		else System.out.println("[ * ] Igual a 0!");
    }
    
    static void q35() {
		List<Integer> valores=new ArrayList<>();
		System.out.print("[ ! ] Valor 1: ");
		int valor1 = sc.nextInt();
		valores.add(valor1);
		System.out.print("[ ! ] Valor 2: ");
		int valor2 = sc.nextInt();
		while(valor2 == valor1) {
			System.out.println("[ !!! ] Valor Inválido");
			System.out.print("[ ! ] Valor 2: ");
			valor2 = sc.nextInt();
		}
		valores.add(valor2);
		System.out.print("[ ! ] Valor 3: ");
		int valor3 = sc.nextInt();
		while(valor3 == valor1 || valor3 == valor2) {
			System.out.println("[ !!! ] Valor Inválido");
			System.out.print("[ ! ] Valor 3: ");
			valor3 = sc.nextInt();
		}
		valores.add(valor3);
		Collections.sort(valores);
		System.out.printf("[ * ] Maior Valor: %d", valores.get(2));
    }
    
    static void q36 () {
		List<Integer> valores=new ArrayList<>();
		System.out.print("[ ! ] Valor 1: ");
		int valor1 = sc.nextInt();
		valores.add(valor1);
		System.out.print("[ ! ] Valor 2: ");
		int valor2 = sc.nextInt();
		while(valor2 == valor1) {
			System.out.println("[ !!! ] Valor Inválido");
			System.out.print("[ ! ] Valor 2: ");
			valor2 = sc.nextInt();
		}
		valores.add(valor2);
		System.out.print("[ ! ] Valor 3: ");
		int valor3 = sc.nextInt();
		while(valor3 == valor1 || valor3 == valor2) {
			System.out.println("[ !!! ] Valor Inválido");
			System.out.print("[ ! ] Valor 3: ");
			valor3 = sc.nextInt();
		}
		valores.add(valor3);
		Collections.sort(valores);
		int somaMaiores = valores.get(1) + valores.get(2);
		System.out.printf("[ *** ] Soma dos 2 Maiores: %d\n", somaMaiores);
	}
    
    static void q37() {
		List<Integer> valores=new ArrayList<>();
		System.out.print("[ ! ] Valor 1: ");
		int valor1 = sc.nextInt();
		valores.add(valor1);
		System.out.print("[ ! ] Valor 2: ");
		int valor2 = sc.nextInt();
		while(valor2 == valor1) {
			System.out.println("[ !!! ] Valor Inválido");
			System.out.print("[ ! ] Valor 2: ");
			valor2 = sc.nextInt();
		}
		valores.add(valor2);
		System.out.print("[ ! ] Valor 3: ");
		int valor3 = sc.nextInt();
		while(valor3 == valor1 || valor3 == valor2) {
			System.out.println("[ !!! ] Valor Inválido");
			System.out.print("[ ! ] Valor 3: ");
			valor3 = sc.nextInt();
		}
		valores.add(valor3);
		Collections.sort(valores);
		System.out.println("[ *** ] Ordem crescente: "+valores);
    }
    
    static void q38() {
		System.out.print("[ ! ] Valor A: ");
		double a = sc.nextDouble();
		System.out.print("[ ! ] Valor B: ");
		double b = sc.nextDouble();
		System.out.print("[ ! ] Valor C: ");
		double c = sc.nextDouble();	
		if ((a + b) > c && (a + c) > b && (b + c) > a) System.out.println("[ *** ] Forma triangulo");
		else System.out.println("[ *** ] Não forma triangulo");
    }
    
    static void q39() {
		System.out.print("[ ! ] Nome time 1: ");
		String time1 = sc.next();
		System.out.print("[ ! ] Numeros de gols: ");
		int gols1 = sc.nextInt();
		System.out.print("[ ! ] Nome time 2: ");
		String time2 = sc.next();
		System.out.print("[ ! ] Numeros de gols: ");
		int gols2 = sc.nextInt();
		if (gols1 > gols2) System.out.printf("[ *** ] Vencedor: Time %s\n", time1);
		else if (gols2 > gols1)System.out.printf("[ *** ] Vencedor: Time %s\n", time2);
		else System.out.println("[ * ] Empate");
    }
    
    static void q40() {
		System.out.print("[ ! ] Valor 1: ");
		int valor1 = sc.nextInt();
		System.out.print("[ ! ] Valor 2: ");
		int valor2 = sc.nextInt();
		if (valor1 > valor2) System.out.println("[ ! ] Primeiro e maior");
		else if (valor2 > valor1) System.out.println("[ ! ] Segundo e maior");
		else System.out.println("[ ! ] Numeros iguais");
    }
    
    static void q41() {
		System.out.print("[ ! ] Valor de x: ");
		int x = sc.nextInt();
		System.out.print("[ ! ] Valor de y: ");
		int y = sc.nextInt();
		int z = (x * y) + 5;
		String resposta;
		if (z <= 0) resposta = "A";
		else if (z <= 100) resposta = "B";
		else resposta = "C";
		System.out.format("[ *** ] z=%d\tresposta=%s\n", z, resposta);
    }
    
    static void q42() {
		System.out.print("[ ! ] Numero de litros: ");
		double litros = sc.nextDouble();
		System.out.print("[ ! ] Tipo combustível:\t\t[A] Alcool\t[G] Gasolina]: ");
		String tipoDeCombustivel = sc.next();
		double valor;
		if (litros > 20) {
			if (tipoDeCombustivel.equals("A")) valor = litros*(2.90-(2.90*0.05));
			else valor = litros*(3.30-(3.30*0.06));
		}else {
			if (tipoDeCombustivel.equals("A")) valor = litros*(2.90-(2.90*0.03));
			else valor = litros*(3.30-(3.30*0.04));
		}
		System.out.printf("[ *** ] TOTAL: R$ %.2f\n", valor);
    }

    static void q43 () {
		List<Integer> idadesHomens = new ArrayList<>();
		List<Integer> idadesMulheres = new ArrayList<>();
		for(int i=0; i<2; i++) {
			System.out.format("[ ! ] Idade homem %d: ", i + 1);
			idadesHomens.add(sc.nextInt());
			if (i!=0 && idadesHomens.get(1) == idadesHomens.get(0))
				while (idadesHomens.get(1) == idadesHomens.get(0)) {
					System.out.println("[ !!! ] Valor Invalido!");
					System.out.format("[ ! ] Idade homem %d: ", i+1);
					idadesHomens.add(sc.nextInt());
				}
		}
		for(int i = 0; i < 2; i++) {
			System.out.format("[ ! ] Idade mulher %d: ", i+1);
			idadesMulheres.add(sc.nextInt());
			if (i > 0 && idadesMulheres.get(1) == idadesMulheres.get(0))
				while (idadesMulheres.get(1) == idadesMulheres.get(0)) {
					System.out.println("[ !!! ] Valor Invalido!");
					System.out.format("[ ! ] Idade mulher %d: ", i + 1);
					idadesMulheres.add(sc.nextInt());
				}
		}
		Collections.sort(idadesHomens);
		Collections.sort(idadesMulheres);
		System.out.println("[ * ] " + (idadesHomens.get(1) + idadesMulheres.get(0)));
		System.out.println("[ * ] " + (idadesHomens.get(0) * idadesMulheres.get(1)));
    }
    
    static void q44() {
		System.out.print("[ ! ] KGs de morango: ");
		int qtdMorango = sc.nextInt();
		System.out.print("[ ! ] KGs de maçãs: ");
		int qtdMaca = sc.nextInt();
		double precoMorango, precoMaca;
		if (qtdMorango <= 5) precoMorango = qtdMorango * 2.50;
		else precoMorango = qtdMorango * 2.20;
		if (qtdMaca <= 5) precoMaca = qtdMaca * 1.80;
		else precoMaca = qtdMaca * 1.50;
		double compraTotal = precoMaca + precoMorango;
		if (compraTotal > 25) compraTotal -= compraTotal * 0.10;
		System.out.format("[ ! ] Compra total: %.2f R$", compraTotal);
    }
    
    static void q45() {
		System.out.print("[ ! ] USER: ");
		int codigo = sc.nextInt();
		while (codigo != 1234) {
			System.out.println("[ !!! ] Usuario invalido");
			System.out.print("[ ! ] USER: ");
			codigo = sc.nextInt();
		}
		System.out.print("[ ! ] Senha: ");
		int senha = sc.nextInt();
		while (senha != 9999) {
			System.out.println("[ !!! ] Senha incorreta");
			System.out.print("[ ! ] Senha: ");
			senha = sc.nextInt();
		}
		System.out.println("[ *** ] Acesso permitido");
    }
    
    static void q46() {
		Boolean A = true, B = true, C = false;
		if ((A && B) || (A ^ B)) System.out.println("[ * ] Verdade");
		else System.out.println("[ * ] Falso");
		if ((A || B) && (A && C)) System.out.println("[ * ] Verdade");
		else System.out.println("[ * ] Falso");
		if (A || C && B || A && !B) System.out.println("[ * ] Verdade");
		else System.out.println("[ * ] Falso");
    }
    
    static void q47() {
		System.out.print("[ ! ] Nome produto: ");
		String nomeProduto = sc.nextLine();
		System.out.print("[ ! ] Preço unitário: ");
		double precoProduto = sc.nextDouble();
		System.out.print("[ ! ] Quantidade: ");
		int qtdProduto = sc.nextInt();
		double total = qtdProduto * precoProduto;
		if (qtdProduto <= 5) total -= total * 0.02;
		else if (qtdProduto > 5 && qtdProduto <= 10) total -= total * 0.03;
		else total -= 0.05;
		System.out.printf("[ *** ] Total a pagar: R$ %.2f", total);
    }
    
    static void q48() {
		System.out.print("[ ! ] Codigo: ");
		int codigo = sc.nextInt();
		System.out.print("[ ! ] Ano nascimento: ");
		int anoNascimento = sc.nextInt();
		System.out.print("[ ! ] Ano ingresso: ");
		int anoIngresso = sc.nextInt();
		System.out.format("[ ! ] Idade %d anos\nTempo trabalho: %d\n", 2019-anoNascimento, 2019-anoIngresso);
		if ((2019 - anoNascimento) >= 65 && (2019 - anoIngresso) >= 30) System.out.println("[ * ] Requerer aposentadoria");
		else System.out.println("[ * ] Não requerer");
    }
    
    static void q49() {
		System.out.print("[ ! ] a: ");
		int a = sc.nextInt();
		System.out.print("[ ! ] b: ");
		int b = sc.nextInt();
		System.out.print("[ ! ] c: ");
		int c = sc.nextInt();
		String mens = null;
		if ((a < b + c) && (b < a + c) && (c < a + b)) {
			if ((a == b) && (b == c)) mens = "Triangulo equilatero";
			else if ((a == b) || (b == c) || (a == c)) mens = "Triangulo isoceles";
			else mens = "Triangulo escaleno";
		}else System.out.println("[ !!! ] Não é possivel formar um triangulo");
		System.out.println(mens);
    }
    
    static void q50() {
		System.out.print("[ ! ] Valor 1: ");
		double valor1 = sc.nextDouble();
		System.out.print("[ ! ] Valor 2: ");
		double valor2 = sc.nextDouble();
		if(valor2 == 0) {
			 do {
				System.out.println("[ !!! ] Valor invalido");
				System.out.print("[ ! ] Valor 2: ");
				valor2 = sc.nextDouble();
			}while(valor2 == 0);
		}
		double resultado = valor1 / valor2;
		System.out.println("[ ! ] Resultado: " + resultado);
    }

    static void q51() {
		System.out.print("[ ! ] Valor 1: ");
		double valor1 = sc.nextDouble();
		System.out.print("[ ! ] Valor 2: ");
		double valor2 = sc.nextDouble();
		while(valor2 == 0) {
			System.out.println("[ !!! ] Valor invalido");
			System.out.print("[ ! ] Valor 2: ");
			valor2 = sc.nextDouble();
		}
		double resultado = valor1 / valor2;
		System.out.println("[ *** ] Resultado: " + resultado);
	}
        
    static void q52() {
		System.out.print("[ ! ] X: ");
		int x = sc.nextInt();
		System.out.print("[ ! ] Y: ");
		int y = sc.nextInt();
		while (y == 0) {
			System.out.println("[ !!! ] VALOR INVALIDO");
			System.out.print("[ ! ] Y: ");
			y = sc.nextInt();
		}
		int z = (x * y) + 5;
		String resposta;
		if (z <= 0) resposta = "A";
		else if (z <= 100) resposta = "B";
		else resposta = "C";
		System.out.format("[ *** ] %d %s\n", z, resposta);
    }
    
    static void q53() {
		System.out.print("[ ! ] Numero de litros: ");
		double litros = sc.nextDouble();
		System.out.print("[ ! ] Tipo combustível:\t\t[A] Alcool\t[G] Gasolina]: ");
		String tipoCombustivel = sc.next();
		while (tipoCombustivel.equals("0")) {
			System.out.println("[ ! ] VALOR INVALIDO");
			System.out.print("[ ! ] Tipo combustível [A-álcool, G-gasolina]: ");
			tipoCombustivel = sc.next();
		}
		double valor;
		if (litros > 20) {
			if (tipoCombustivel.equals("A")) valor = litros * (2.90 - (2.90 * 0.05));
			else valor = litros * (3.30 - (3.30 * 0.06));
		}else {
			if (tipoCombustivel.equals("A")) valor = litros * (2.90 - (2.90 * 0.03));
			else valor = litros * (3.30 - (3.30 * 0.04));
		}
		System.out.printf("[ *** ] TOTAL: R$ %.2f\n", valor);
    }
    
    static void q54() {
		System.out.print("[ ! ] Nota 1: ");
		double nota1 = sc.nextDouble();
		while(nota1 < 0 || nota1 > 10) {
			System.out.println("[ ! ] Nota invalida");
			System.out.print("[ ! ] Nota 1: ");
			nota1 = sc.nextDouble();
		}
		System.out.print("[ ! ] Nota 2: ");
		double nota2 = sc.nextDouble();
		while(nota2 < 0 || nota2 > 10) {
			System.out.println("[ ! ] Nota invalida");
			System.out.print("[ ! ] Nota 2: ");
			nota2 = sc.nextDouble();
		}
		double media = (nota1 + nota2) / 2;
		System.out.println("[ *** ] Media: " + media);
    }
    
    static void q55() {
		String resp;
		do {
			System.out.print("[ ! ] USER: ");
			int codigo = sc.nextInt();
			while (codigo != 1234) {
				System.out.println("[ ! ] Usuario invalido");
				System.out.print("[ ! ] USER: ");
				codigo = sc.nextInt();
			}
			System.out.print("[ ! ] Senha: ");
			int senha = sc.nextInt();
			while (senha != 9999) {
				System.out.println("[ ! ] Senha incorreta");
				System.out.print("[ ! ] Senha: ");
				senha = sc.nextInt();
			}
			System.out.println("[ ! ] Acesso permitido");
			System.out.println("[ ! ] Nova consulta [S/N]??");
			resp = sc.next();
		}while (!resp.equals("N"));
	}

}