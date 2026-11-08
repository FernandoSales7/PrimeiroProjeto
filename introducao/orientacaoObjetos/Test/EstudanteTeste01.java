package introducao.orientacaoObjetos.Test;

import introducao.orientacaoObjetos.Dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante aluno = new Estudante();
        aluno.nome = "Fernando";
        aluno.idade = 27;
        aluno.sexo = 'M';

        System.out.print("Meu nome é " + aluno.nome);
        System.out.print(", tenho " + aluno.idade + " anos");
        System.out.print(" e não falo todes, sou do sexo " + aluno.sexo + " :D");

    }

}
