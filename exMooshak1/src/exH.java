import java.util.Scanner;

public class exH {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int num,qtDiv = 0,div;

        do {
            num = ler.nextInt();
        } while (num <= 0);

        for(div = 2;div < num; div++){

            if(num % div == 0){

                qtDiv++;
                break;
            }
        }

        if(qtDiv == 0 && num !=1){
            System.out.println("primo");
        } else {
            System.out.println("nao e primo");
        }
    }
}
