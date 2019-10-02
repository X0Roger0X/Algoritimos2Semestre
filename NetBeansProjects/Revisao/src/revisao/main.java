package revisao;

public class main {

    public static int pot(int b, int e) {

        if (e == 0) {
            return 1;
        }

        return b * pot(b, e - 1);

    }

    public static void main(String[] args) {

        int b = 2;
        int e = 3;

        System.out.println(pot(b, e));

    }

}
