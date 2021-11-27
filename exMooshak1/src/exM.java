import java.util.Scanner;

public class exM {
    public static void main(String[] args) {

        int n, num, num1 = 0, num2 = 1, qtNum = 2;
        Scanner ler = new Scanner(System.in);

        do {
            n = ler.nextInt();
        } while (n < 0);


        if (n == 1){
            System.out.println("0");
        }else if (n == 2){
            System.out.println("0");
            System.out.println("1");
        }else if (n != 0){
            System.out.println("0");
            System.out.println("1");
            while (qtNum < n){
                num = num1 + num2;
                System.out.println(num);
                num1 = num2;
                num2 = num;
                qtNum++;
        }

        }
    }
}
