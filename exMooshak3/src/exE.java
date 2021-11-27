import java.util.Scanner;

public class exE {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {

        double[] salarios = new double[19];
        String nomes[] = new String[19];
        int nElementos = lerResultados(nomes, salarios);
        double media = mediaSalarios(salarios, nElementos);
        salariosMenorMedia(salarios, nomes, nElementos, media);



    }
    public static int lerResultados(String[] nomes, double[] venc){
        int nElm = 0;
        String nome = ler.next();
        while (!(nome.equals("fim")) && nElm < 20){
            nomes[nElm] = nome;
            venc[nElm] = ler.nextDouble();
            nElm++;
            nome = ler.next();
        }

        return nElm;
    }

    public static double mediaSalarios(double[] salarios, int nSalarios){
        double totalSalarios = 0;
        double mediaSalarios;
        for (int i = 0; i < nSalarios; i++){
            totalSalarios = totalSalarios + salarios[i];
        }
        mediaSalarios = totalSalarios / nSalarios;

        return  mediaSalarios;
    }

    public static void salariosMenorMedia(double[] salarios, String[] nomes, int nElementos, double media){
        System.out.printf("%.1f\n", media);
        for (int i = 0; i < nElementos; i++){
            if (salarios[i] < media){
                System.out.println(nomes[i]);
            }
        }
    }
}
