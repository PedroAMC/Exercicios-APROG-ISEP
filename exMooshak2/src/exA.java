import java.util.Scanner;

public class exA {
    public static void main(String[] args) {
        int N, nNumeros, num;
        final int K = 5;
        double media, soma = 0;

        Scanner ler = new Scanner(System.in);
        do {
            N = ler.nextInt();
        } while (N <= 0);

        nNumeros = 0;
        num = ler.nextInt();

        while ((qtDigitos(num) < N) && nNumeros <= K){
            soma = soma + num;
            nNumeros++;
            num = ler.nextInt();

        }

        if(nNumeros > 0){
            media = soma/nNumeros;
        }else{
            media = soma;
        }

        System.out.printf("%.2f\n", media);


    }

    public static int qtDigitos(int num){
        int qtDig = 0;
        while (num > 0) {
            num = num / 10;
            qtDig++;
        }
        return qtDig;
    }
}
