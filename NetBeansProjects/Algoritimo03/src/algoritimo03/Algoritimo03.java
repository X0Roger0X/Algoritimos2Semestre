package algoritimo03;

public class Algoritimo03 {

    static void invertida(int[] vetorA) {

        int aux;
        for (int i = 0; i < vetorA.length / 2; i++) {
            aux = vetorA[i];
            vetorA[i] = vetorA[vetorA.length - 1 - i];
            vetorA[vetorA.length - 1 - i] = aux;
        }
    }

    public static void main(String[] args) {

        int[] vetorA = {3, 8, 7, 5, 4};
    }

}
