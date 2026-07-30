void main(){
    String[] meses = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};

    int opcao;

    do {
        opcao = Integer.parseInt(IO.readln("Entre com o número do mês: "));

        if(opcao > 12 || opcao < 1)
            IO.println("Valor inválido");

    } while (opcao > 12 || opcao < 1);

    String mensagem = String.format("O número do mês %d é %s", opcao, meses[opcao-1]);

    IO.println(mensagem);

    for(int i = 0; i < meses.length; i++)
        System.out.println(meses[i]);
    
    for(String valor : meses)
        System.out.println(valor);
}