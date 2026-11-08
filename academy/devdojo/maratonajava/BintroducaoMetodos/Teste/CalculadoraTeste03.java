package academy.devdojo.maratonajava.BintroducaoMetodos.Teste;

import academy.devdojo.maratonajava.BintroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideDoisNumeros(20,5);

        System.out.println(result);
    }

}
