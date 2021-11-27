import java.util.Scanner;

public class exG {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int N, num;


        N = ler.nextInt();



        for (num = 0; num <= N; num++){
            if (armstrong(num) == true){
                System.out.println(num);
            }
        }

    }

    public static boolean armstrong(int num){
        boolean eArmstrong;
        int dig, nDig = 0, ogNum;
        double soma = 0;
        ogNum = num;
        while (num > 0) {

            num = num / 10;
            nDig++;
        }
        num = ogNum;

        while (num > 0) {

            dig = num % 10;
            num = num / 10;
            soma = soma + Math.pow(dig, nDig);
        }

        if (soma == ogNum) {
            eArmstrong = true;
        } else {
            eArmstrong = false;
        }


        return eArmstrong;
    }
}
