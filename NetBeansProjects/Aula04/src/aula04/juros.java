package aula04;

import java.util.Scanner;

public class juros {

    static double[] jurosTabela = {0.20, 0.21, 0.19, 0.18, 0.03, 0.08, 0.10, 0.15, 0.20, 0.30, 0.32, 0.40};
    static double[] produtos;

    static void ler(double[] produtos) {

        Scanner imput = new Scanner(System.in);

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("valor[" + (i + 1) + "]:");
            produtos[i] = imput.nextDouble();
        }
    }

    static void aplicarJuros(double[] jurosTabela, double[] produtos) {

        for (int i = 0; i < produtos.length; i++) {
            for (int j = 0; j < jurosTabela.length; j++) {
                produtos[i] = produtos[i] * jurosTabela[j];

            }
        }
    }

    public static void main(String[] args) {
        double[]
    }
}
