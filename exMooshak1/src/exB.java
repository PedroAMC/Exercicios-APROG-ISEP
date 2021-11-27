import java.util.Scanner;

public class exB {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int num, digito, somaPar;
        somaPar = 0;
        num = ler.nextInt();

        while (num > 0) {
            while (num > 0) {
                digito = num % 10;
                num = num / 10;
                if (digito % 2 == 0) {
                    somaPar = somaPar + digito;
                }
            }

            System.out.println(somaPar);
            num = ler.nextInt();
            somaPar = 0;
        }

    }
}

