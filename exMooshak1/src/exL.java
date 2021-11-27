import java.util.Scanner;

public class exL {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int n, num, soma = 0, div, qtPerfeito = 0;

        do {
            n = ler.nextInt();
        } while (n <= 0);


            for (num = 2; qtPerfeito < n; num++) {
                for (div = 1; div <= num; div++) {
                    if ((num % div) == 0) {
                        soma = soma + div;
                    }
                }
                if (soma == num) {
                    System.out.println(num);
                    qtPerfeito++;
                }
                soma = 0;
            }

    }
}
