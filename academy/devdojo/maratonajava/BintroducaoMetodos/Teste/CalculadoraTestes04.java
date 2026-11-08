package academy.devdojo.maratonajava.BintroducaoMetodos.Teste;

import academy.devdojo.maratonajava.BintroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTestes04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};

        calculadora.somaArray(numeros);
    }
}
