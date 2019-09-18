/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 05 EM JAVA - Arrays
Roger Araujo dos Reis Turma: A
Exercício 10: Dado um vetor de números reais e um número real, fazer um programa que multiplique os elementos de
posição ímpar do vetor pelo número real dado e imprima o resultado.
*/
package listaarraysvetores;

public class Exercicio10 {
    
    public static void main(String[] args) {
        
        int reais = Funcoes.reais();
        double[] tamanho = Funcoes.tamanhoReais(reais);
        double[] popula = Funcoes.popularReais(tamanho);
        double multi = Funcoes.multireais(popula, reais);
        System.out.println(multi);
    }
}
