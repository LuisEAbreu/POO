void main(){
    int a = Integer.parseInt(IO.readln("Entre com o primeiro valor: "));
    int b = Integer.parseInt(IO.readln("Entre com o segundo valor: "));
    
    IO.println("a + b = " + (a+b) );

    if(a > b)
        IO.println("o primeiro valor é o maior entre os dois números fornecidos.");
    if(a < b)
        IO.println("o segundo valor é o maior entre os dois números fornecidos.");
    else 
        IO.println("os dois valores são iguais.");
}