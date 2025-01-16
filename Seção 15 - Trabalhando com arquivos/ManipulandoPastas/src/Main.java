import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        //Pegar todas as pastas do caminho informado
        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        //Agora somente os arquivos, não as pastas
        File[] files = path.listFiles(File::isFile);

        System.out.println("FILES: ");
        for (File file : files) {
            System.out.println(file);
        }

        //Criar uma subpasta
        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Diretório criado: " + success);

        //Obter o caminho do arquivo
        System.out.println("getPath: " + path.getPath()); //O caminho completo
        System.out.println("getParent: " + path.getParent()); // Só o caminho, sem o nome do arquivo
        System.out.println("getName: " + path.getName()); //Somente o nome do arquivo

        sc.close();
    }
}