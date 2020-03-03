package br.com.rafaelbarao.cadastroalunos;

import java.util.Scanner;

public class Console {
    private Scanner scanner;

    public Console() {
        this.scanner = new Scanner(System.in);
    }

    public Integer leNumeroInteiro() {
        Integer numeroLido = scanner.nextInt();
        scanner.nextLine();
        return numeroLido;
    }

    public Double leNumeroDouble() {
        Double numeroLido = scanner.nextDouble();
        scanner.nextLine();
        return numeroLido;
    }

    public String leLinhaTexto() {
        return scanner.nextLine();
    }

    public void escreveConsole(String texto) {
        System.out.println(texto);
    }

}
