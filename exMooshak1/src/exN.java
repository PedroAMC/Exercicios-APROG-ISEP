import java.util.Scanner;

public class exN {
    public static void main(String[] args) {

        int num, num1, num2, dig, dig1;
        boolean crescente = false;

        Scanner ler = new Scanner(System.in);
        num = ler.nextInt();

        while (num >= 0){
            crescente = false;
            num1 = ler.nextInt();
            if (num1 > num){
                num2 = num1;
                while (num2 > 0) {
                    dig = num2 % 10;
                    dig1 = num2 / 10 % 10;
                    num2 = num2 / 10;
                    if (dig > dig1){
                        crescente = true;
                    } else{
                        crescente = false;
                        break;
                    }
                }

            }
            num = num1;
            if (crescente == true){
                System.out.println(num1);
            }

        }


    }
}
