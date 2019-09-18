package bolha;

public class Ordenar {

    /*public static void ordenar(int[] v) {

        int aux;

        for (int i = v.length - 1; i > 0; i--) {
            if (v[i] < v[i - 1]) {
                aux = v[i];
                v[i] = v[i - 1];
                v[i - 1] = aux;
            }
        }

    }*/
    public static void ordenar(int[] v) { //Segunda forma de fazer o ordenar

        for (int i = 0; i < v.length; i++) {
            int j = v.length - 1;
            int aux = v[j];

            while (j > 0 && aux < v[j - 1]) {

                v[j] = v[j - 1];
                j--;
            }
            v[j] = aux;
        }
    }

    public static void imprimir(int[] v) {

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] v = {3, 5, 9, 11, 15, 17, 19, 6};
        ordenar(v);
        imprimir(v);

    }
}
