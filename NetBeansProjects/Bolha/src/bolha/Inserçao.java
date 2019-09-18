package bolha;

public class Inserçao {

    public static void ordenar(int[] v) {

        for (int i = 0; i < v.length; i++) {
            int j = i;
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
