import java.io.File;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // explicação de arquivos lendo com Classes File e Scanner
        //File = Representação abstrata de um arquivo e seu caminho
        //Scanner = Utilizar para leitor de texto além de poder ser usados para ler dados (polimorfismo com scanner)
        // IOException = tratamento para entrada e saida de arquivo (obrigação para tratar no try)

        File file = new File("Coloque seu diretório");
        // instanciação do caminho do arquivo
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNext()) { // teste de nova linha no arquivo
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally { // se der um erro de processo no aruivo ou outro o try vai cortar e cair no catch e o scanner nn vai ser fechado
            if (sc != null) { // boa prática para dar nullPoint
                sc.close(); // recurso fechado independete se deu try ou não
            }
        }
    }
}