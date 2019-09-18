package listaarraysvetores;

import java.util.Scanner;

public class Funcoes {

    static Scanner entrada = new Scanner(System.in);

    static int inteiro() { // entrada de valores
        System.out.println("Digite um valor inteiro: ");
        int inteiro = entrada.nextInt();
        return inteiro;

    }

    static int[] tamanhoInteiro(int valor) { //define o tamanho do vetor 

        int[] vetor = new int[valor];

        for (int i = 0; i < valor; i++) {
            vetor[i] = i;

        }
        return vetor;
    }

    static int[] populaVetor(int[] tamanho) { // popula o vetor de numeros inteiros criado 

        for (int i = 0; i < tamanho.length; i++) {
            System.out.println("informe um valor: ");
            tamanho[i] = entrada.nextInt();
        }
        return tamanho;
    }

    static int somaInt(int[] populado) { // soma de valores inteiros 

        int soma = 0;

        for (int i = 0; i < populado.length; i++) {
            soma = soma + populado[i];
        }

        return soma;
    }

    static int[] vetormaisvetor(int[] populado, int[] populadoA, int[] populadoB) { // soma de vetores 

        for (int i = 0; i < populadoA.length; i++) {
            for (int j = 0; j < populadoB.length; j++) {
                populado[i] = populadoA[i] * populadoB[j];
            }
        }

        return populado;
    }

    static int multiInt(int[] populado) { //multiplicação de valores inteiros 

        int multi = 1;

        for (int i = 0; i < populado.length; i++) {
            multi = multi * populado[i];
        }

        return multi;
    }

    static int multiVetor(int[] populado, int imput) { //multiplicação do valor dentro do vetor

        int multi = imput;

        for (int i = 0; i < populado.length; i++) {
            int resultado = multi * populado[i];
            populado[i] = resultado;
            System.out.println(populado[i]);
        }
        return multi;

    }

    static int media(int soma, int valor) { // media de valores inteiros 

        int media = soma / valor;
        return media;

    }

    static int maior(int[] populado) { // verifica o maior valor dentro do vetor 

        int maior = 0;

        for (int i = 0; i < populado.length; i++) {
            if (populado[i] > maior) {
                maior = populado[i];
            }
        }

        return maior;
    }

    static double menor(double[] popula) { // verifica o menor valor dentro do vetor 

        double menor = popula[0];

        for (int i = 0; i < popula.length; i++) {
            if (popula[i] < menor) {
                menor = popula[i];
            }
        }

        return menor;
    }

    static void verificacao(int[] populado, int imput) { //verifica se o valor digitado consta no vetor 

        for (int i = 0; i < populado.length; i++) {
            if (imput == populado[i]) {
                System.out.println("valor " + imput + " consta no vetor");
            }
        }
    }

    static void imprimir(int[] populado) { // imprimi o vetor criado

        for (int i = 0; i < populado.length; i++) {
            System.out.println(populado[i]);
        }
    }

    static int reais() { //  entrada de valores para numeros reais
        System.out.println("Digite um valor inteiro: ");
        int reais = entrada.nextInt();
        return reais;

    }

    static double[] tamanhoReais(int reais) { //define o tamanho do vetor 

        double[] vetor = new double[reais];

        for (int i = 0; i < reais; i++) {
            vetor[i] = i;

        }
        return vetor;
    }

    static double somaReais(double[] popula) { // soma de valores reais 

        double soma = 0;

        for (int i = 0; i < popula.length; i++) {
            soma = soma + popula[i];
        }

        return soma;
    }

    static double media(double soma, int reais) { // media de valores reais 

        double media = soma / reais;
        return media;

    }

    static double[] popularReais(double[] tamanho) { // popula o vetor com valores reais

        for (int i = 0; i < tamanho.length; i++) {
            System.out.println("informe um valor: ");
            tamanho[i] = entrada.nextDouble();
        }
        return tamanho;
    }

    static double multireais(double[] popula, int reais) {

        double multi = 1;

        for (int i = 1; i < popula.length; i += 2) {
            multi = multi * popula[i];
        }
        return multi;
    }

    static void comparar(double[] popula, double media) {

        double maior = media;
        for (int i = 0; i < popula.length; i += 2) {
            if (maior > popula[i]) {
                System.out.println(popula[i]);
            }
        }

    }

    static void imprimirReais(double[] popula) { // // imprimi o vetor criado com números reais

        for (int i = 0; i < popula.length; i++) {
            System.out.println(popula[i]);
        }
    }

}
