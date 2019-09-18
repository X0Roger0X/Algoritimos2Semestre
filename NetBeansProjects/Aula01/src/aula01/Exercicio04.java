package aula01;

public class Exercicio04 {

    public static int[] intercalacao(int[] vA, int[] vB) {
        int n = vA.length;
        int m = vB.length;
        int[] vC = new int[vA.length + vB.length];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (vA[i] < vB[j]) {
                vC[k] = vA[i];
                i++;
            } else {
                vC[k] = vB[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            vC[k] = vA[i];
            i++;
            k++;
        }
        while (j < m) {
            vC[k] = vB[j];
            i++;
            k++;
        }
        return vC;
    }

    public static void main(String[] args) {

        int[] vA = {1, 3, 6, 7};
        int[] vB = {2, 4, 5};

    }
}
