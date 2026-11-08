package academy.devdojo.maratonajava.Aintroducaoclasses;

import java.util.Scanner;
public class aula03MatrizesAtividade {

    public static void main(String[] args) {

        double[][] dias = new double[3][2];
        Scanner temperaturas = new Scanner(System.in);

        // 1. Preencher a matriz
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println("Digite a temperatura do dia "
                        + (i + 1) + ", período " + (j + 1) + ":");

                dias[i][j] = temperaturas.nextDouble();
            }
        }

        // 2. Exibir as temperaturas
        System.out.println("\nTemperaturas registradas:");

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println("Dia " + (i + 1)
                        + ", período " + (j + 1)
                        + ": " + dias[i][j] + "°C");
                System.out.println("-----------");
            }
        }

        // 3. Calcular as médias
        double somaGeral = 0;

        for (int i = 0; i < dias.length; i++) {
            double somaDia = 0;

            for (int j = 0; j < dias[i].length; j++) {
                somaDia += dias[i][j];
                somaGeral += dias[i][j];
            }

            double mediaDia = somaDia / dias[i].length;

            System.out.println("Média do dia " + (i + 1)
                    + ": " + mediaDia + "°C");
            System.out.println("-----------");
        }

        // 4. Calcular a média geral
        double mediaGeral = somaGeral
                / (dias.length * dias[0].length);

        System.out.println("Média geral: "
                + mediaGeral + "°C");
        System.out.println("-----------");

        temperaturas.close();
    }
}
