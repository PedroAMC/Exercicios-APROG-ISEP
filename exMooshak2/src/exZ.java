import java.util.Scanner;

public class exZ {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int num1, num2, copia, count = 0;
        num1 = ler.nextInt();
        num2 = ler.nextInt();
        if(num2 < num1){
            copia = num1;
            num1 = num2;
            num2 = copia;
        }
        for(int i = num1; i <= num2; i++){
            if(isPrimoATempoInteiro(i)){
                count ++;
                System.out.println(i);
            }
        }
        System.out.println("(" + count + ")");
    }
    public static boolean isPrimoATempoInteiro(int num){
        int algarismos = 0, alg, copia;
        copia = num;
        do{
            algarismos ++;
            copia /= 10;
        }while(copia != 0);
        copia = num;
        for(int i = 0; i < algarismos; i++){
            copia = copia / 10 + (copia % 10) * (int)Math.pow(10,(algarismos - 1));
            if(!isPrimo(copia)){
                return false;
            }
        }
        return true;
    }
    public static boolean isPrimo(int num){
        for (int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}