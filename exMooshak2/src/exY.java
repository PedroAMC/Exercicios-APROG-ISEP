import java.util.Scanner;

public class exY {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int num1,num2;

        num1 = lerValorInteiroPositivo();
        num2 = lerValorInteiroPositivo();
        mostrarTabuadasDoIntervalo(num1,num2);

    }

    public static int lerValorInteiroPositivo () {


        int numero;
        do {
            numero = ler.nextInt();
        } while (numero<=0);

        return (numero);
    }

    public static void mostrarTabuadasDoIntervalo (int lim1, int lim2){
        int menor,maior,num;

        if (lim1>lim2){

            maior=lim1;
            menor=lim2;
        }else {
            maior = lim2;
            menor = lim1;
        }

        for (num=menor; num<=maior; num++){
            mostrarTabuada(num);
        }
    }

    public static void mostrarTabuada (int numero){
        int i;

        System.out.println("Tabuada de " + numero);
        for (i=1;i<=10;i++){
            System.out.println(numero + " x " +i+ " = " + (i*numero));
        }
    }


}
