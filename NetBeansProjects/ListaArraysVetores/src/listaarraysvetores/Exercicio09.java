/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 05 EM JAVA - Arrays
Roger Araujo dos Reis Turma: A
Exercício 9: Dados dois vetores A e B de mesma dimensão, fazer um programa que calcule e imprima o produto de
cada elemento de A pelo correspondente elemento de B. O resultado deve ser armazenado em um vetor C.
*/
package listaarraysvetores;

public class Exercicio09 {
    
    public static void main(String[] args) {
        
        int valor = Funcoes.inteiro();
        int[] tamanhoA = Funcoes.tamanhoInteiro(valor);
        int[] tamanhoB = Funcoes.tamanhoInteiro(valor);
        int[] populadoA = Funcoes.populaVetor(tamanhoA);
        int[] populadoB = Funcoes.populaVetor(tamanhoB);
        int[] populado = Funcoes.tamanhoInteiro(valor);
        int[] vezes = Funcoes.vetormaisvetor(populado, populadoA, populadoB);
        Funcoes.imprimir(populado);
    }
    
}
