package engtelecom.poo;

public class App {
    public static void main(String[] args) {
        int tamanho = Integer.parseInt(IO.readln("Tamanho da matriz: "));

        int[][] matriz = new int[tamanho][tamanho];

        for(int i=0; i<tamanho; i++){
            for(int j=0; j<tamanho; j++){
                matriz[i][j] = (i == j) ? 1 : 0;
            }
        }

        for(int[] linha : matriz){
            for (int valor : linha)
                IO.print(valor);
            IO.println();
        }
    }
}
