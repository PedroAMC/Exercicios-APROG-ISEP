import java.util.Scanner;

public class exG {
    public static void main(String[] args) {

        int num,qtDiv = 0;
        Scanner ler = new Scanner(System.in);

        do {
            num = ler.nextInt();
        } while (num <= 0);

        for(int div = 1;div <= num/2;div++){
            if((num % div) == 0){
                qtDiv++;
                System.out.println(div);
            }
        }
        System.out.println(num);
        qtDiv = qtDiv + 1;
        System.out.println("(" + qtDiv + ")");
    }
}
