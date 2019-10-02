package revisao;

public class Exercicio02 {

    public static void bin(int n) {

        if (n < 2) {
            System.out.print(n);
        } else {
            bin(n / 2);
            System.out.print(n % 2);

        }
    }

    public static void main(String[] args) {

        int n = 13;
        bin(n);

    }

}
