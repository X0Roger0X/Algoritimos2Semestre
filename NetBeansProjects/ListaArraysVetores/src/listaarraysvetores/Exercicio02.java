/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 05 EM JAVA - Arrays
Roger Araujo dos Reis Turma: A
Exercício 2: Dado um vetor de números reais, fazer um programa que some todos os elementos do vetor e imprima o
resultado.
 */
package listaarraysvetores;

public class Exercicio02 {

    public static void main(String[] args) {

        int reais = Funcoes.reais();
        double[] tamanho = Funcoes.tamanhoReais(reais);
        double[] popula = Funcoes.popularReais(tamanho);
        double soma = Funcoes.somaReais(popula);
        Funcoes.imprimirReais(popula);
        System.out.println(soma);
    }
}
