package algoritimo10;

import java.io.BufferedReader;
import java.io.FileReader;

public class Exercicio01 {

    public static void main(String[] args) throws Exception {

        FileReader arquivo = new FileReader("Vetor.txt");
        BufferedReader leBufferizado = new BufferedReader(arquivo);
        String linha = leBufferizado.readLine();
        System.out.println(linha);

    }

}
