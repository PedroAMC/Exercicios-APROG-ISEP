import java.util.Scanner;

public class exB {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int nAlunos, nDisciplinas, nPositivas;
        String disciplina;

        do {
            nAlunos = ler.nextInt();
        } while (nAlunos < 0);

        do {
            nDisciplinas = ler.nextInt();
        } while (nDisciplinas < 0);

            for (int i = 1; i <= nDisciplinas; i++){
            disciplina = ler.next();
            do {
                nPositivas = ler.nextInt();
            } while (nPositivas < 0);

            info(disciplina, nPositivas, nAlunos);

        }

    }

    public static void info(String disciplina, int positivas, int nAlunos){
        int negativas = nAlunos - positivas;
        String astPositivo = "";
        String astNegativo = "";

        System.out.println("Disciplina: " + disciplina);
        for(int i = 1; i <= positivas; i++){
            astPositivo = astPositivo + "*";
        }
        for(int i = 1; i <= negativas; i++){
            astNegativo = astNegativo + "*";
        }
        System.out.println("- Positivas: " + astPositivo);
        System.out.println("- Negativas: " + astNegativo);



    }
}
