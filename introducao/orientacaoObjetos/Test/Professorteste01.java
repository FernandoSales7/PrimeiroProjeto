package introducao.orientacaoObjetos.Test;

import introducao.orientacaoObjetos.Dominio.Professor;

public class Professorteste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Aurelio";
        professor.idade = 31;
        professor.sexo = 'M';

        System.out.println(professor.nome + "  " + professor.idade + "  " + professor.sexo);

    }
}
