import java.util.Scanner;

public class exF {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        double deposito;
        Double[] juros = new Double[6];
        lerJuros(juros);
        do {
            deposito = ler.nextDouble();
        } while (deposito < 0);

        calcularMontanteFinal(juros, deposito);





    }
    public static void lerJuros(Double[] juros){
        for (int i = 0; i < juros.length; i++){
            juros[i] = ler.nextDouble();
        }
    }

    public static void calcularMontanteFinal(Double[] juros, double deposito){
        double montanteFinal = deposito;
        for (int i = 0; i < juros.length; i++){
            montanteFinal = montanteFinal + montanteFinal * juros[i];
        }
        System.out.printf("valor final=%.2f\n", montanteFinal);

    }
}
