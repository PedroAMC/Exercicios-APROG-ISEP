import java.util.Scanner;

public class exF {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int numInicial, num, num1 = 0, dig;

        do {
            numInicial = ler.nextInt();
        } while (numInicial <= 0);

        num = numInicial;

        while (num != 0) {

            dig = num % 10;
            num1 = num1 * 10 + dig;
            num = num / 10;
        }
        if (num1 == numInicial) {

            System.out.println("capicua");
        } else {

            System.out.println(("nao capicua"));
        }


    }
}

