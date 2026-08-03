public class Argumento {
    public static void main(String[] args) {

        if(args.length != 2){
            IO.println("Passagem de parâmetro inválida, deve seguir o seguinte formato:");
            IO.println("    java Argumento.java *nota1* *nota2*");
            System.exit(1);
        }

        double avaliacao1 = Double.parseDouble(args[0]);

        double avaliacao2 = Double.parseDouble(args[1]);

        double media = Math.round((avaliacao1 + avaliacao2) / 2);

        String mensagem = String.format("A média final é: %.2f", media);
        IO.println(mensagem);

        String resultado = (media >= 6) ? "aprovado!" : "reprovado!";
        IO.println("Você está " + resultado);
    }
}
