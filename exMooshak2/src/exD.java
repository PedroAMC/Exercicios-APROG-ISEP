import java.util.Scanner;

public class exD {
    public static void main(String[] args) {
        int m, n;
        Scanner ler = new Scanner(System.in);


        m = ler.nextInt();
        n = ler.nextInt();


        if (m >= n){
            System.out.println("C(" + m + "," + n + ")=" + combinacoes(m,n));
            System.out.println("P(" + m + "," + n + ")=" + permutacoes(m,n));
        }



    }
    public static int permutacoes(int m, int n){
        int permutacao;
        permutacao = (fatorial(m) / (fatorial(m - n)));

        return permutacao;
    }
    public static int combinacoes(int m, int n){
        int combinacao;
        combinacao = (fatorial(m) / (fatorial(n) * (fatorial(m - n))));

        return combinacao;
    }


    public static int fatorial(int num){
        int valor = 1;
        while (num > 1){
            valor = valor * num;
            num--;

        }
        return valor;
    }
}
