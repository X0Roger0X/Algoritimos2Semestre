/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 05 EM JAVA - Arrays
Roger Araujo dos Reis Turma: A
Exercício 4: Dado um vetor de números reais, fazer um programa que imprima o menor elemento do vetor.
 */
package listaarraysvetores;

public class Exercicio04 {

    public static void main(String[] args) {

        int reais = Funcoes.reais();
        double[] tamanho = Funcoes.tamanhoReais(reais);
        double[] popula = Funcoes.popularReais(tamanho);
        double menor = Funcoes.menor(popula);
        System.out.println(menor);

    }
}
