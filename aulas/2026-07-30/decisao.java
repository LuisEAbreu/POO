void main(){
    int mes;

    do {
        mes = Integer.parseInt(IO.readln("Entre com o número do mês: "));

        if(mes > 12 || mes < 1)
            IO.println("Valor inválido");

    } while (mes > 12 || mes < 1);

    String porExtenso = switch(mes){
        case 1 -> "Janeiro";
        case 2 -> "Fevereiro";
        case 3 -> "Março";
        case 4 -> "Abril";
        case 5 -> "Maio";
        case 6 -> "Junho";
        case 7 -> "Julho";
        case 8 -> "Agosto";
        case 9 -> "Setembro";
        case 10 -> "Outubro";
        case 11 -> "Novembro";
        case 12 -> "Dezembro";
        default -> "Inválido";
    };

    String mensagem = String.format("O número do mês %d é %s", mes, porExtenso);

    IO.println(mensagem);
}