package aula04;

import java.util.Random;
import java.util.Scanner;

public class Aula04 {

    static Scanner imput = new Scanner(System.in);
    static Random random = new Random();

    static int imput() {

        int inteiro = imput.nextInt();
        return inteiro;
    }

    static int[][] criarMatriz(int tamanho) {

        int[][] matriz = new int[tamanho][tamanho];

        return matriz;
    }

    static int[][] populada(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10);

            }

        }
        return matriz;

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

    static int[][] soma(int[][] A, int[][] B) {

        int[][] C = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    static int[][] multi(int[][] A, int[][] B) {

        int[][] M = new int[A.length][A[0].length];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                for (int k = 0; k < M.length; k++) {

                    M[i][j] = A[i][k] * B[k][j];

                }
            }
        }
        return M;
    }

    public static void main(String[] args) {

        System.out.println("Insira o tamanho da Matriz: ");
        int tamanho = imput();
        int[][] A = criarMatriz(tamanho);
        int[][] B = criarMatriz(tamanho);
        int[][] C;
        populada(A);
        populada(B);
        System.out.println("A:");
        imprimi(A);
        System.out.println("B:");
        imprimi(B);
        C = soma(A, B);
        System.out.println("C:");
        imprimi(C);
    }

}
