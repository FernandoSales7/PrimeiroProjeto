package academy.devdojo.maratonajava.BintroducaoMetodos.Dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void multiplicaDoisNumeros(int numero1, int numero2) {
        System.out.println(numero1 * numero2);
    }

    public double divideDoisNumeros(double numero1, double numero2) {
        return numero1 / numero2;

    }

    public void somaArray(int[] numeros) {
        int soma = 0;

        for (int num : numeros) {
            soma = soma + num;
        }
        System.out.println("A soma total é: " + soma);
    }

}