package algoritimo10;

public class Algoritimo10 {

    public static int diferencaAbsoluta(int[] V) {

        int menor = V[0];
        int maior = V[0];

        for (int i = 0; i < V.length; i++) {
            if (V[i] < menor) {
                menor = V[i];
            }
            if (V[i] > maior) {
                maior = V[i];
            }
        }

        return maior - menor;
    }

    public static void main(String[] args) {

        int[] A = {3, 8, 5, 7, 1, 2};
    }

}
