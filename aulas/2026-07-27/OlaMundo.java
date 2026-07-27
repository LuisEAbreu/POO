void saudacao(){
    IO.println("Olá Mundo 2");
}

void saudacaoMelhorada(String mensagem){
    IO.println("Olá " + mensagem);
}

void main(){
    IO.println("Olá Mundo!");

    saudacao();

    saudacaoMelhorada("Luis");

    String nome = IO.readln("Entre com seu nome: ");

    saudacaoMelhorada(nome);
}