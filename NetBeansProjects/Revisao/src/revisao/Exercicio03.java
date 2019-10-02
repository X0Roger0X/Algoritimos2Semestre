package revisao;

public class Exercicio03 {

    public static int busca(int x, int v[], int i, int f) {

        if (i > f) {
            return -1;
        }
        int m = (i = f) / 2;
        if (x == v[m]) {
            return m;
        }
        if (x < v[m]) {
            return busca(x, v, i, m - 1);
        } else {
            return busca(x, v, m + 1, f);
        }

    }

    public static void main(String[] args) {

        int v[] = {2, 4, 10, 13, 15};
        int x = 13;
        int i = 0;
        int f = v.length - 1;

        busca(x, v, i, f);

    }

}
