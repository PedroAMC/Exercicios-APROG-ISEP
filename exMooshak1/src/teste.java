import java.util.Scanner;

public class teste {
    public static void main(String[] args) {

        int num, num1, dig, dig1;
        boolean crescente = false;
        Scanner ler = new Scanner(System.in);
        num = ler.nextInt();
        num1 = num;
        while (num > 0) {
            dig = num % 10;
            dig1 = num % 100;
            num = num / 10;
            System.out.println(dig + " " + dig1);
            if (dig > dig1){
                crescente = true;
            } else{
                crescente = false;
            }
        }
        System.out.println(crescente);
        if (crescente == true){
            System.out.println("ola");
            System.out.println(num1);
        }
    }
}
