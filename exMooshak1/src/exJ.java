import java.util.Scanner;

public class exJ {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int n,num,numInicial,dig;
        double percent,mPercent,qtDig = 0,qtDiv = 0;

        n = ler.nextInt();


        if (n > 0){
            mPercent = 0;
            for(int x = 1; x <= n;x++){
                do {
                    numInicial = ler.nextInt();
                } while (numInicial <= 0);
                num = numInicial;
                while (num > 0){
                    dig = num % 10;
                    num = num/10;
                    qtDig++;
                    if (dig != 0){
                        if(numInicial % dig == 0){
                            qtDiv++;
                        }
                    }
                }
                percent = qtDiv/qtDig * 100;
                if (percent > mPercent){
                    mPercent = percent;
                }
                System.out.printf("%.2f%%\n", percent);
                qtDig = 0;
                qtDiv = 0;
            }
            System.out.printf("(%.2f%%)\n", mPercent);

        }




    }
}
