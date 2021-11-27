import java.util.Scanner;

public class exO {
    public static void main(String[] args) {

        int n, ingredientes, ogIngredientes, pizza, nPizza, nPizza1 = 0, ogPizza, dig, dig1;
        boolean comestivel;
        Scanner ler = new Scanner(System.in);

        do {
            ingredientes = ler.nextInt();
        } while (ingredientes < 0);

        ogIngredientes = ingredientes;
        do {
            n = ler.nextInt();
        } while (n < 0);

        for (nPizza = 1; nPizza <= n; nPizza++) {
            comestivel = true;
            ingredientes = ogIngredientes;
            pizza = ler.nextInt();
            ogPizza = pizza;
            while (ingredientes > 0 && comestivel == true) {
                pizza = ogPizza;
                dig = ingredientes % 10;
                ingredientes = ingredientes / 10;
                while (pizza > 0 && comestivel == true) {
                    dig1 = pizza % 10;
                    pizza = pizza / 10;
                    if (dig1 == dig) {
                        comestivel = false;
                    } else {
                        comestivel = true;
                    }

                }


            }
            if (comestivel == true) {
                nPizza1++;
                System.out.println("Sugestao #" + nPizza1 + ":" + ogPizza);
            }
        }
    }
}
