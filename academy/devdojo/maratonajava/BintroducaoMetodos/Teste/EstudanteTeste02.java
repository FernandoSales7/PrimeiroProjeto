package academy.devdojo.maratonajava.BintroducaoMetodos.Teste;

import academy.devdojo.maratonajava.BintroducaoMetodos.Dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Goku";
        estudante01.idade = 27;
        estudante01.sexo = 'M';

        estudante02.nome = "Chichi";
        estudante02.idade = 26;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }

}
