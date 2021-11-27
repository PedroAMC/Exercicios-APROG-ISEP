import java.util.Scanner;

public class exA {

    public static void main(String[] args) {

        int num,somaPar,digito;
        somaPar = 0;

        Scanner ler = new Scanner(System.in);

        do {
            num = ler.nextInt();
        } while (num <= 0);

        while (num > 0){
            digito = num % 10;
            num = num/10;
            if (digito % 2 == 0){
                somaPar = somaPar + digito;
            }

        }

        System.out.println(somaPar);
    }
}
