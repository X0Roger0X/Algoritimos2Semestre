package recursao;

public class Recursividade {

    public static int fatorial(int n) {
//base da recursão (condição de parada)
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static int fibonacci(int n) {

        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        System.out.println(fibonacci(27));
    }

}
