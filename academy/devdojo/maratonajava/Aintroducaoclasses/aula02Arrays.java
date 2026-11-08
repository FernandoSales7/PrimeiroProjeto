package academy.devdojo.maratonajava.Aintroducaoclasses;

public class aula02Arrays {

    // Uma escola precisa de um programa para armazenar as notas de 3 alunos em 2
    // provas e exibir essas notas na tela.
    // Seu programa deve:
    // Criar e preencher a matriz com as notas.
    // Exibir todas as notas, organizadas por aluno.
    // Calcular e exibir a soma das duas notas de cada aluno.
    // Exibir a média de cada aluno.
    public static void main(String[] args) {

        double[][] notas = new double[3][2];
        notas[0][0] = 7.5;
        notas[0][1] = 8.0;
        notas[1][0] = 6.5;
        notas[1][1] = 7.0;
        notas[2][0] = 9.0;
        notas[2][1] = 8.5;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            double soma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Nota " + (j + 1) + ": " + notas[i][j]);
                soma += notas[i][j];
            }
            System.out.println("Soma: " + soma);
            System.out.println("Média: " + (soma / notas[i].length));
            System.out.println("------------------------");
        }
    }
}
