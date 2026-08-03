public class Media{
    public static void main(String[] args) {
        double avaliacao1 = Double.parseDouble(IO.readln("Entre com a nota da avaliação 1: "));

        double avaliacao2 = Double.parseDouble(IO.readln("Entre com a nota da avaliação 2: "));

        double media = Math.round((avaliacao1 + avaliacao2) / 2);

        String mensagem = String.format("A média final é: %.2f", media);
        IO.println(mensagem);

        String resultado = (media >= 6) ? "aprovado!" : "reprovado!";
        IO.println("Você está " + resultado);
    }
}
