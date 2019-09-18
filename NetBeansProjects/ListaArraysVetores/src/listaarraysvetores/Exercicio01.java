/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 05 EM JAVA - Arrays
Roger Araujo dos Reis Turma: A
Exercício 1:Dado um vetor de números inteiros, fazer um programa que imprime todos os elementos do vetor.
 */
package listaarraysvetores;

public class Exercicio01 {

    public static void main(String[] args) {

        int valor = Funcoes.inteiro();
        int[] tamanho = Funcoes.tamanhoInteiro(valor);
        int[] populado = Funcoes.populaVetor(tamanho);
        Funcoes.imprimir(populado);

    }

}
