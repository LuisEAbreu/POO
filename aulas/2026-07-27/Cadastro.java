void main(){
    int idade = Integer.parseInt(IO.readln("Entre com sua idade: "));
    char sexo = IO.readln("Entre com seu sexo (M ou F): ").charAt(0);

    if(sexo == 'm' && idade >= 18)
        IO.println("Apresente certificado de dispensa ou reservista.");
    else
        IO.println("Tudo certo.");
}