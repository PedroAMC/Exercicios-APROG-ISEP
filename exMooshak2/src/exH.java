import java.util.Scanner;

public class exH {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        final int MAX_TENTATIVAS = 5;
        int tentativas = 1;
        int num = ler.nextInt();
        boolean flag = eCapicua(num);

        while (!flag && (tentativas < MAX_TENTATIVAS)){
            tentativas = tentativas + 1;
            num = ler.nextInt();
            flag = eCapicua(num);

        }

        if (tentativas < MAX_TENTATIVAS){
            System.out.println("capicua");
        }else{
            System.out.println("tentativas excedidas");
        }
    }

    public static boolean eCapicua(int numInicial){
        boolean capicua;
        int num, num1 = 0, dig;

        num = numInicial;

        while (num != 0) {

            dig = num % 10;
            num1 = num1 * 10 + dig;
            num = num / 10;
        }
        if (num1 == numInicial) {

            capicua = true;
        } else {

            capicua = false;
        }

        return capicua;
    }
}
