import java.util.Scanner;

public class exE {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int N, maiorNdigitos = 0, num1, num2, mNum1 = 0, mNum2 = 0;

        do {
            N = ler.nextInt();
        } while (N < 0);

        for (int i = 1; i <= N; i++){
            num1 = ler.nextInt();
            num2 = ler.nextInt();

            if (digitosComuns(num1, num2) >= maiorNdigitos){

                maiorNdigitos = digitosComuns(num1, num2);
                mNum1 = num1;
                mNum2 = num2;
            }

        }

        if (maiorNdigitos == 0){

            System.out.println("sem resultados");
        } else {

            System.out.println(mNum1 + "/" + mNum2);
        }




    }

    public static int digitosComuns(int num1, int num2){
        int nDigitos = 0, dig1, dig2;

        while (num1 > 0 && num2 > 0) {

            dig1 = num1 % 10;
            num1 = num1 / 10;
            dig2 = num2 % 10;
            num2 = num2 / 10;
            if (dig1 == dig2){
                nDigitos++;
            }
        }


        return nDigitos;
    }
}
