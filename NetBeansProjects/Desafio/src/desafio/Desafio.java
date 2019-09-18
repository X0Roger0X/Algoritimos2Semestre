package desafio;

import java.util.Scanner;
import java.util.Random;

public class Desafio {

    static Scanner imput = new Scanner(System.in);
    static Random random = new Random();

    static int imput() {

        int inteiro = imput.nextInt();
        return inteiro;
    }

    static int[][] criarMatriz(int linha, int coluna) {

        int[][] matriz = new int[linha][coluna];

        return matriz;
    }

    static int[][] populada(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100);

            }

        }
        return matriz;

    }

    static void magico(int[][] matriz) {

        boolean magico = true;
        int primeiraLinha = 0;
        int primeiraColuna = 0;

        for (int i = 0; i < matriz.length; i++) {

            int totalLinha = 0;
            int totalColuna = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0) {
                    primeiraLinha += matriz[i][j];
                    primeiraColuna += matriz[j][i];
                }
                totalLinha += matriz[i][j];
                totalColuna += matriz[j][i];
            }
            if (totalLinha != primeiraLinha || totalLinha != totalColuna || totalColuna != primeiraColuna || primeiraColuna != primeiraLinha) {
                magico = false;
            }
        }
        if (magico) {
            System.out.println("É um quadrado mágico");
        } else {
            System.out.println("Não é um quadrado mágico");
        }
    }

    static void soma(int[][] matriz) {

        int somaL = 0, somaDP = 0, somaDS = 0;
        int[] somaC = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (i == j) {
                    somaDP += matriz[i][j];
                }

                if (j + i == matriz.length - 1) {
                    somaDS += matriz[i][j];
                }

                somaL += matriz[i][j];
                somaC[j] += matriz[i][j];

            }
            System.out.printf("Soma da linha[%d]: " + somaL + "\n", i);
            somaL = 0;
        }

        for (int i = 0; i < somaC.length; i++) {
            System.out.printf("Soma da coluna[%d]: " + somaC[i] + "\n", i);

        }
        System.out.println("Soma da diagonal Principal: " + somaDP);
        System.out.println("Soma da diagonal Secundaria: " + somaDS);
    }

    static void imprimi(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                //inicio da formatação
                if (j == 0) {
                    System.out.print("[");
                }
                //logica EX. fazer soma, validar impar ou par
                System.out.printf("%d", matriz[i][j]);
                //fim da formatação
                if (j == matriz[i].length - 1) {
                    System.out.print("]\n");
                } else {
                    System.out.print(",");
                }
            }
        }

    }

    static void maiorMenor(int[][] matriz) {

        int[] maior = new int[matriz.length];
        int[] menor = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
            }
        }

        System.out.println("Maior valor = " + maior);
        System.out.println("Menor valor = " + menor);
    }

    public static void main(String[] args) {

        System.out.println("Insira o numero de Linhas");
        int linha = imput();
        System.out.println("Insira o numero de Colunas");
        int coluna = imput();
        int[][] matriz = criarMatriz(linha, coluna);
        populada(matriz);
        imprimi(matriz);
        soma(matriz);
        magico(matriz);
    }

}
