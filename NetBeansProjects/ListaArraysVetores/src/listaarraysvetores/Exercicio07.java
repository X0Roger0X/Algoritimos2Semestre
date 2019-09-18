/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 05 EM JAVA - Arrays
Roger Araujo dos Reis Turma: A
Exercício 7: Dado um vetor de números inteiros e um número inteiro, fazer um programa que multiplique todos os
elementos do vetor pelo número real dado e imprima o resultado.
 */
package listaarraysvetores;

public class Exercicio07 {

    public static void main(String[] args) {

        int valor = Funcoes.inteiro();
        int imput = Funcoes.inteiro();
        int[] tamanho = Funcoes.tamanhoInteiro(valor);
        int[] populado = Funcoes.populaVetor(tamanho);
        Funcoes.multiVetor(populado, imput);
    }
}
