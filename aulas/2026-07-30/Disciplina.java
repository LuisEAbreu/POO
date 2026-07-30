boolean comparaDias(String diaDaSemana){
    String[] semanas = {"seg","ter","qua","qui","sex"};
    boolean retorno;

    for(int i = 0; i < semanas.length; i++){
        retorno = semanas[i].equals(diaDaSemana);

        if(retorno)
            return true;
    }
    return false;
}

void main(){
    String[] diasDaSemana = new String[5];

    String disciplina = IO.readln("Entre com o nome da disciplina: ");

    String aux;
    int i = 0;
    
    do {
        aux = IO.readln("Entre com o dia da semana que você tem aula: ");
        aux = aux.toLowerCase();
        
        if(comparaDias(aux)){
            diasDaSemana[i] = aux;
            i++;
        } else {
            if(!aux.equals("nao"))
                IO.println("Opção inválida");
        }
    } while(!aux.equals("nao"));

    String mensagem = String.format("Na disciplina de %s você tem aulas nos seguintes dias:", disciplina);
    IO.println(mensagem);

    for(int j = 0; j < i; j++ )
        IO.println("- " + diasDaSemana[j]);
}