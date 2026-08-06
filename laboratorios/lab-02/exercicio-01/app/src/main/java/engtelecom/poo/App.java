package engtelecom.poo;

public class App {
    public static void main(String[] args) {
        int dia = Integer.parseInt(IO.readln("Entre com o dia: "));
        String mesEscrito = IO.readln("Entre com o mês: ");

        /*
        Outono: Começa em 20 de março e termina em 21 de junho.
        (dia >= 20 && mes >= 3) && (dia < 21 && mes <= 6)

        Inverno: Começa em 21 de junho e termina em 22 de setembro.
        (dia >= 21 && mes >= 6) && (dia < 22 && mes <= 9)

        Primavera: Começa em 22 de setembro e termina em 21 de dezembro.
        (dia >= 22 && mes >= 9) && (dia < 21 && mes <= 12)

        Verão: Começa em 21 de dezembro e termina em 20 de março
        (dia >= 20 && mes >= 3) && (dia < 20 && mes <= 3)

        */

        IO.println("");
    }
}
