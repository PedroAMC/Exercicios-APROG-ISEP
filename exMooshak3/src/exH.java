import java.util.Scanner;

public class exH {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        String instrucao;

        do {
            n = ler.nextInt();
        } while (n < 0);

        int[] sequencia = lerNumeros(n);

        do {
            instrucao = ler.next();
            if (instrucao.equals("direita")) {
                direita(sequencia);
            } else if (instrucao.equals("esquerda")){
                esquerda(sequencia);
            }
        } while (!(instrucao.equals("sair")));


    }


    public static int[] lerNumeros (int n){
        int[] sequencia = new int[n];
        for (int i = 0; i < sequencia.length; i++) {
            sequencia[i] = ler.nextInt();
        }
        return sequencia;
    }

    public static void direita ( int[] sequencia){
        int ultimoNumero = sequencia[sequencia.length - 1];
        String output = "";
        for (int i = sequencia.length - 2; i >= 0; i--) {
            sequencia[i + 1] = sequencia[i];
        }
        sequencia[0] = ultimoNumero;
        for (int i = 0; i < sequencia.length; i++) {
            output = output + "[" + sequencia[i] + "]";
        }
        System.out.println(output);

    }


        public static void esquerda ( int[] sequencia){
            int primeiroNumero = sequencia[0];
            String output = "";
            for (int i = 0; i < sequencia.length - 1; i++) {
                sequencia[i] = sequencia[i + 1];
            }
            sequencia[sequencia.length - 1] = primeiroNumero;
            for (int i = 0; i < sequencia.length; i++) {
                output = output + "[" + sequencia[i] + "]";
            }
            System.out.println(output);
    }

}

