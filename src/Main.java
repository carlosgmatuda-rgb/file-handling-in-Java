import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // EXPLICAÇÃO FileReader e BufferedReader (lembrando é obrigatorio fechar o Streams pelo menos no java)
        // FileReader = Stream de leitura de caracteres a partir de arquivos
        // BufferedReader = instanciado apartir do FileReader implementando algumar otimização como um esquema rápido

        // Fazendo em forma verbosa:

        String caminho = "C:\\Users\\Carlos\\IdeaProjects\\in.txt";
        // Processo manual
        FileReader fr = null;
        BufferedReader br = null;

        try { // Para abrir aquivo e ler ele
            fr = new FileReader(caminho);
            br = new BufferedReader(fr); //instaciado apartir do FileReader, deixa mais flexível o sistema

            String linha = br.readLine(); // ler uma linha do arquivo e se estiver no final retorna null
            // então para isso iremos testar em forma de while

            while (linha != null) {
                System.out.println(linha);
                linha = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro : " + e.getMessage());
        } finally {
            // nessas duas parte para fehcar br fr podem acontecer exceptions na streams
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println("Erro : " + e.getMessage());
            }
        }
    }
}