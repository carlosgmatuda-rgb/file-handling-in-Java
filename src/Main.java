import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /* Bloco try-with-resources
         É um bloco try que declara um ou mais recursos, e garante que esses recursos serão fechados
         ao final do bloco

         ATENÇÃO com try-with-resources não prescisa utilizar finally
         */

        String caminho = "C:\\Users\\Carlos\\IdeaProjects\\in.txt";

        //bloco try-with-resources mais enxuto
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))){ // Para abrir aquivo e ler ele

            String linha = br.readLine(); // ler uma linha do arquivo se estiver no final retorna null
            // então para isso iremos testar em forma de while

            while (linha != null) {
                System.out.println(linha);
                linha = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro : " + e.getMessage());
        }
    }
}