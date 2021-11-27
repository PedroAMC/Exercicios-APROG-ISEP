import java.util.Scanner;

public class exE {
    public static void main(String[] args) {

        int oct,dig,ord = 0,x,decimal = 0;
        Scanner ler = new Scanner(System.in);
        oct = ler.nextInt();


        while (oct > 0){
            while (oct > 0){
                dig = oct % 10;
                oct = oct/10;
                x = (int) Math.pow(8,ord);
                decimal = decimal + (dig * x);
                ord ++;
            }

            System.out.println(decimal);
            oct = ler.nextInt();
            decimal = 0;
            ord = 0;
        }

        }


    }

