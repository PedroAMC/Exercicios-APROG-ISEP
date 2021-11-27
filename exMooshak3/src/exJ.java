import java.util.Scanner;

public class exJ {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        String[] nomes = new String[30];
        int[] salarios = new int[30];
        int nFuncionarios = escreverFuncionarios(nomes, salarios);
        compararSalarios(nomes, salarios, nFuncionarios);



    }

    public static int escreverFuncionarios(String[] nomes, int[] salarios){
        int nFuncionarios = 0;
        String nome;
        nome = ler.nextLine();
        while (!(nome.equals("FIM")) && nFuncionarios < 30){
            salarios[nFuncionarios] = ler.nextInt();
            ler.nextLine();
            nomes[nFuncionarios] = nome;
            nome = ler.nextLine();
            nFuncionarios++;

        }

        return nFuncionarios;
    }

    public static void compararSalarios(String[] nomes, int[] salarios, int nFuncionarios){
        int salario1 = 0, salario2 = 0, salario3 = 0;
        String nome1 = "", nome2 = "", nome3 = "";
        for (int i = 0; i < nFuncionarios; i++){
            if (salarios[i] > salario1){
                nome3 = nome2;
                nome2 = nome1;
                nome1 = nomes[i];
                salario3 = salario2;
                salario2 = salario1;
                salario1 = salarios[i];
            } else if (salarios[i] == salario1){
                if (nomes[i].compareTo(nome1) < 0){
                    nome3 = nome2;
                    nome2 = nome1;
                    nome1 = nomes[i];
                    salario3 = salario2;
                    salario2 = salario1;
                    salario1 = salarios[i];
                } else {
                    nome3 = nome2;
                    nome2 = nomes[i];
                    salario3 = salario2;
                    salario2 = salarios[i];
                }
            } else  if (salarios[i] > salario2){
                nome3 = nome2;
                nome2 = nomes[i];
                salario3 = salario2;
                salario2 = salarios[i];
            } else if (salarios[i] == salario2){
                if (nomes[i].compareTo(nome2) < 0){
                    nome3 = nome2;
                    nome2 = nomes[i];
                    salario3 = salario2;
                    salario2 = salarios[i];
                } else {
                    nome3 = nomes[i];
                    salario3 = salarios[i];
                }
            }else  if (salarios[i] > salario3){
                nome3 = nomes[i];
                salario3 = salarios[i];
            } else if (salarios[i] == salario2){
                if (nomes[i].compareTo(nome2) < 0){
                    nome3 = nomes[i];
                    salario3 = salarios[i];
                }
            }


        }
        System.out.println("#1:" + nome1 + ":" + salario1);
        System.out.println("#2:" + nome2 + ":" + salario2);
        System.out.println("#3:" + nome3 + ":" + salario3);
    }
}
