import java.util.Scanner;

public class exK {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int n, qtDiv = 0, div;

        do {
            n = ler.nextInt();
        } while (n <= 0);

        for(int num = 1; num <= n; num++){
            for(div = 2;div < num; div++){

                if(num % div == 0){

                    qtDiv++;
                    break;
                }
            }
            if(qtDiv == 0 && num !=1){
                System.out.println(num);
            }
            qtDiv = 0;


        }
    }
}
