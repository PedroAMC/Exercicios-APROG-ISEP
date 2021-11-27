import java.util.Scanner;

public class exI {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        String[][] proprietarios = lerProprietarios();
        encontrarProprietario(proprietarios);


    }
    public static String[][] lerProprietarios(){
        String[][] proprietarios = new String[3][4];
        for (int i = 0; i < proprietarios.length; i++){
            for(int j = 0; j < proprietarios[i].length; j++){
                proprietarios[i][j] = ler.nextLine();
            }
        }
        return proprietarios;
    }
    public static void encontrarProprietario(String[][] proprietarios){
        boolean encontrado = false;
        String proprietario = ler.nextLine();
        for (int i = 0; i < proprietarios.length; i++){
            for(int j = 0; j < proprietarios[i].length; j++){
                if (proprietario.equals(proprietarios[i][j])){
                    encontrado = true;
                    System.out.println("nome=" + proprietario);
                    System.out.println("entrada=" + i);
                    System.out.println("piso=" + j);
                }
            }

        }
        if (encontrado == false){
            System.out.println("Nao mora no predio");
        }
    }
}
