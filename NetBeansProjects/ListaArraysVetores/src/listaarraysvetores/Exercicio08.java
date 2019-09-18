/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 05 EM JAVA - Arrays
Roger Araujo dos Reis Turma: A
Exercício 8: Dado um vetor de números inteiros e um número inteiro, fazer um programa que verifique se o número
está presente no vetor.
*/
package listaarraysvetores;

public class Exercicio08 {
    
    public static void main(String[] args) {
        
        int valor = Funcoes.inteiro();
        int imput = Funcoes.inteiro();
        int[] tamanho = Funcoes.tamanhoInteiro(valor);
        int[] populado = Funcoes.populaVetor(tamanho);
        Funcoes.verificacao(populado, imput);
    }
    
}
