package br.com.rafaelbarao;

import java.util.Scanner;

public class Console {
    private Scanner scanner;

    public Console() {
        scanner = new Scanner(System.in);
    }

    public String leTextoDigitado() {
        return scanner.nextLine();
    }

    public Integer leNumeroInteiro() {
        Integer valorLido = scanner.nextInt();
        scanner.nextLine();
        return valorLido;
    }

    public Double leNumeroDouble() {
        Double valorLido = scanner.nextDouble();
        scanner.nextLine();
        return valorLido;
    }

    public void escreveConsole(String texto) {
        System.out.println(texto);
    }
}
