/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 05 EM JAVA - Arrays
Roger Araujo dos Reis Turma: A
Exercício 5: Exercício 4: Dado um vetor de números inteiros, fazer um programa que imprima a média dos elementos do vetor.
*/
package listaarraysvetores;

public class Exercicio05 {
    
    public static void main(String[] args) {
        
        int valor = Funcoes.inteiro();
        int[] tamanho = Funcoes.tamanhoInteiro(valor);
        int[] populado = Funcoes.populaVetor(tamanho);
        int soma = Funcoes.somaInt(populado);
        int media = Funcoes.media(soma, valor);
        System.out.println(media);
    }
}
