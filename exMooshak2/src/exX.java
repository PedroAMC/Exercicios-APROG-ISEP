import java.util.Scanner;

public class exX {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String frase;
        int count = -1;
        do {
            count ++;
            frase = ler.nextLine();
        } while (!ePalindromo(frase));
        System.out.println(count);
    }
    public static boolean ePalindromo(String frase){
        for(int i = 0; i < frase.length() / 2; i++){
            if(frase.charAt(i) != frase.charAt(frase.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}