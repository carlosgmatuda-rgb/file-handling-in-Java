import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*
        FileWrite = Stream de escrite de caracteres de arquivos
        * Cria/recria o arquivo: new FileWrite(caminho);
        * Acrescenta ao arquivo existente: new Filewrite(path, true);

        BufferedWrite = Mais rapido porque tem aquele esquema que trata mais rápido
         */

        String[] linhas = new String[] { "Bom dia", "Boa tarde", "Boa noite"}; // criando lista
        String caminho = "C:\\Users\\Carlos\\IdeaProjects\\out.txt"; // criando arquivo e gravando dados

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho/*, true*/))) { // para apenas gravar dnv apenas adicionar o true
             for (String linha : linhas) {
                 bw.write(linha);
                 bw.newLine();
             }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}