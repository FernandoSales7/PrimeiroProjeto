package introducao.orientacaoObjetos.Test;

import introducao.orientacaoObjetos.Dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Onix";
        carro1.modelo = "ltz Automático";
        carro1.ano = 2025;

        carro2.nome = "T-cross";
        carro2.modelo = "versão turbo 2.0";
        carro2.ano = 2024;

        System.out.println(carro1.nome + "   " + carro1.modelo + "   " + carro1.ano);

        System.out.println("---------transição de carro 1 pra carro 2----------");

        System.out.println(carro2.nome + "   " + carro2.modelo + "   " + carro2.ano);
    }
}
