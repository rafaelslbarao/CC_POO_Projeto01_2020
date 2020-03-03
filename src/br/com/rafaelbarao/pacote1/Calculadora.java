package br.com.rafaelbarao.pacote1;

public class Calculadora {

    public int soma(int valor1, int valor2) {
        return valor1 + valor2 + 50;
    }

    public int soma(int valor1, int valor2, int valor3) {
        return soma(soma(valor1, valor2), valor3);
    }

    public double soma(double valor1, double valor2) {
        return valor1 + valor2;
    }
}
