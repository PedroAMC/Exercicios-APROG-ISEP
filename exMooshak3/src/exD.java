import java.util.Scanner;

public class exD {


    public static void main(String[] args) {
        int [] notas = escreverResultados();
        mostrarResultados(fazerResultados(notas));

    }

    public static int[] escreverResultados (){
        Scanner ler = new Scanner(System.in);
        int n;
        do{
            n = ler.nextInt();
        } while (n < 0);

        int[] notas = new int [n];

        for (int i = 0; i < n; i++){
            do {
                notas[i] = ler.nextInt();
            } while (notas[i] < 0 || notas[i] > 20);

        }
        return notas;
    }
    public static int[] fazerResultados (int[] notas){
        int[] freqNotas = new int[21];

        for (int i = 0; i < notas.length; i++){
           int pos = notas[i];
           freqNotas[pos] = freqNotas[pos] + 1;
        }
        return freqNotas;

    }
    public static void mostrarResultados (int[] freqNotas){
        for (int a = 0; a < freqNotas.length; a++){
            System.out.println(a + " " + freqNotas[a]);
        }
    }
}

