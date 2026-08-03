import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        while(leitor.hasNextLine()){
            String linha = leitor.nextLine().toUpperCase();
            IO.println(linha);
        }

        leitor.close();
    }
}
