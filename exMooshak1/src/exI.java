import java.util.Scanner;

public class exI {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int num1, num2,numMaior,numMenor,minimoMultiplo;
        boolean minimoMultiploEncontrado = false;

        do {
            num1 = ler.nextInt();
            num2 = ler.nextInt();
        } while (num1 <= 0 || num2 <= 0);

        if (num1 >= num2){
            numMaior = num1;
            numMenor = num2;
        } else{
            numMaior = num2;
            numMenor = num1;
        }

        if(numMaior % numMenor == 0){
            minimoMultiplo = numMaior;
        } else{
            minimoMultiplo = numMaior;
            while (minimoMultiploEncontrado == false ){
                if (minimoMultiplo % numMaior == 0 && minimoMultiplo % numMenor == 0){
                    minimoMultiploEncontrado = true;
                } else {
                    minimoMultiplo++;
                    System.out.println(minimoMultiplo);
                }
            }
        }

        System.out.println(minimoMultiplo);


    }


}
