package bolha;

public class Bolha {

    public static void ordenadoBolha(int[] v) {

        for (int i = 1; i < v.length; i++) {
            for (int j = 0; j < v.length - i; j++) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }

    public static void imprimir(int[] v) {

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] v = {1, 5, 2, 8, 6, 4, 7, 9, 3,};
        ordenadoBolha(v);
        imprimir(v);

    }

}
