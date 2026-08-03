import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        while(leitor.hasNextLine()){
            String linha = leitor.nextLine();

            String[] vetAlunos = linha.split(";");

            Double media = ((Double.parseDouble(vetAlunos[2]) + Double.parseDouble(vetAlunos[3])) / 2);

            String mensagem = (media >= 6) ? "aprovad" : "reprovad";

            char genero = (vetAlunos[1].equals("m")) ? 'o' : 'a';
            
            String saida = String.format("%s %s%c!", vetAlunos[0], mensagem, genero);
            IO.println(saida);
        }

        leitor.close();
    }    
}
