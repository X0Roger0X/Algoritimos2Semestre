/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 05 EM JAVA - Arrays
Roger Araujo dos Reis Turma: A
Exercício 11: Dado um vetor de números reais, fazer um programa que imprima os números maiores do que a média
dos elementos que estão nas posições pares do vetor.
*/
package listaarraysvetores;

public class Exercicio11 {
    
    public static void main(String[] args) {
        
        int reais = Funcoes.reais();
        double[] tamanho = Funcoes.tamanhoReais(reais);
        double[] popula = Funcoes.popularReais(tamanho);
        double soma = Funcoes.somaReais(popula);
        double media = Funcoes.media(soma, reais);
        Funcoes.comparar(popula, media);
    }
    
}
