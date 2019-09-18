/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 05 EM JAVA - Arrays
Roger Araujo dos Reis Turma: A
Exercício 6: Dado um vetor de números inteiros, fazer um programa que imprima o produto dos elementos do vetor.
*/
package listaarraysvetores;

public class Exercicio06 {
    
    public static void main(String[] args) {
        
        int valor = Funcoes.inteiro();
        int[] tamanho = Funcoes.tamanhoInteiro(valor);
        int[] populado = Funcoes.populaVetor(tamanho);
        int multi = Funcoes.multiInt(populado);
        System.out.println(multi);
    }
}
