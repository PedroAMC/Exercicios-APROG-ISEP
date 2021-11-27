import java.util.Scanner;

public class exD {

    public static void main(String[] args) {

        int num,produto,digito,qtImpar;
        produto = 1;
        qtImpar = 0;

        Scanner ler = new Scanner(System.in);

        num = ler.nextInt();

        while (num > 0) {
            while (num > 0) {
                digito = num % 10;
                num = num / 10;
                if (digito % 2 == 1) {
                    produto = produto * digito;
                    qtImpar = qtImpar + 1;
                }
            }
            if (qtImpar == 0) {
                System.out.println("nao ha algarismos impares");
            } else {
                System.out.println(produto);
            }
            produto = 1;
            qtImpar = 0;
            num = ler.nextInt();
        }
    }
}
