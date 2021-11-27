import java.util.Scanner;

public class exL {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String frase;
        frase = ler.nextLine();
        System.out.println(qtPalavras(frase));


    }

    public  static int qtPalavras(String frase){

        int qtPalavras = 0;
        boolean espaçoEncontrado = false;
        frase = frase.trim();
        if (frase.length() > 0){
            qtPalavras = 1;
        }

        for (int i = 0; i < frase.length(); i++){
            if (frase.charAt(i) == ' ' && espaçoEncontrado == false){
                qtPalavras++;
                espaçoEncontrado = true;
            } else if (frase.charAt(i) != ' '){
                espaçoEncontrado = false;
            }

        }
        return qtPalavras;
    }
}
