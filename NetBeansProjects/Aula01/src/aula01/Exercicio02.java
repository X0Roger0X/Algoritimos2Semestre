package aula01;

public class Exercicio02 {

    static String interseccao(int a[], int b[]) {

        StringBuilder res = new StringBuilder();
        boolean achou;
        for (int i = 0; i < a.length; i++) {
            achou = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    achou = true;
                    break;
                }
            }
            if (!achou) {
                res.append(a[i] + " ");
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {

        int[] a = {7, 2, 5, 8, 4};
        int[] b = {4, 2, 9, 5};
        System.out.println(interseccao(a, b) + "");
    }

}
