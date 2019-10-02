package revisao;

public class Exercicio5a {

    public static int linear(int x, int v[], int i) { //A

        if (i == v.length) {
            return -1;
        }
        if (x == v[i]) {
            return i;
        }
        return linear(x, v, i + 1);
    }

    static int menor(int v[], int n) { //B

        if (n == 1) {
            return v[0];
        }
        int x = menor(v, n - 1);
        if (x < v[n - 1]) {
            return x;
        } else {
            return v[n - 1];
        }
    }

    static int soma(int v[], int n) { //C

        if (n == v.length) {
            return 0;
        }
        return v[n] + soma(v, n + 1);
    }

    static float media(int v[], int n) { //D

        if (n == v.length) {
            return 0;
        }
        float soma = v[n] + soma(v, n + 1);
        if (n == 0) {
            return soma / v.length;

        }
        return soma;
    }

    public static void main(String[] args) {

        int n = 0;
        int v[] = {2, 8, 7, 1, 5};
        System.out.println(menor(v, n));

    }

}
