package academy.devdojo.maratonajava.BintroducaoMetodos.Teste;

import academy.devdojo.maratonajava.BintroducaoMetodos.Dominio.Estudante;
import academy.devdojo.maratonajava.BintroducaoMetodos.Dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Goku";
        estudante01.idade = 27;
        estudante01.sexo = 'M';

        estudante02.nome = "Chichi";
        estudante02.idade = 26;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
        
    }

}
