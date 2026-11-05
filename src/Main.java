
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Informações do caminho do arquivo
        // C:\\Users\\Carlos\\IdeaProjects\\out.txt
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a pasta: ");
        String pasta = sc.nextLine();

        File pastaFile = new File(pasta);

        System.out.println("getName: " + pastaFile.getName()); // pegar o nome
        System.out.println("getParent: " + pastaFile.getParent());// para pegar apenas o caminho
        System.out.println("getPath: " + pastaFile.getPath());// se quiser todo o caminho
        System.out.println();
        sc.close();
    }
}