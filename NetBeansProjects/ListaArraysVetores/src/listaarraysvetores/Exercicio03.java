/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 05 EM JAVA - Arrays
Roger Araujo dos Reis Turma: A
Exercício 3: Dado um vetor de números inteiros, fazer um programa que imprima o maior elemento do vetor
 */
package listaarraysvetores;

public class Exercicio03 {

    public static void main(String[] args) {

        int valor = Funcoes.inteiro();
        int[] tamanho = Funcoes.tamanhoInteiro(valor);
        int[] populado = Funcoes.populaVetor(tamanho);
        int maior = Funcoes.maior(populado);
        System.out.println(maior);
    }
}
