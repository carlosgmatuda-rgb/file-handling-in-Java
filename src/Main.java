import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Manipulação de pastas com File
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma pasta: ");
        String pasta = sc.nextLine();

        File file = new File(pasta);

        File[] pastaFiles = file.listFiles(File::isDirectory); // gerar listagem de pastas
        System.out.println("Pastas:");
        for (File f : pastaFiles) {
            System.out.println(f.getName());
        }

        // para conseguir as listas de arquivos:

        File[] pastaFiles2 = file.listFiles(File::isFile);
        System.out.println("Pastas:");
        for (File f : pastaFiles2) {
            System.out.println(f.getName());
        }

        // criando um sub-pasta a partir da pasta

        boolean x = new File(pasta + "\\subdir").mkdir();
        System.out.println("Diretório criado com sucesso: " + x);
        sc.close();
    }
}