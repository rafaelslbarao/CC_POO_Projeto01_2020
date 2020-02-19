package br.com.rafaelbarao;

import java.util.ArrayList;

public class Menu {
    private Console console;

    public Menu(Console console) {
        this.console = console;
    }

    public void imprimeMenu(ArrayList<OpcaoMenu> listaOpcoes) {
        for (OpcaoMenu opcaoMenu : listaOpcoes) {
            console.escreveConsole(opcaoMenu.getLayoutImpressao());
        }
    }

    public OpcaoMenu leOpcaoValida(ArrayList<OpcaoMenu> listaOpcoes) {
        do {
            console.escreveConsole("Digite opção: ");
            Integer opcaoDigitada = console.leNumeroInteiro();



        } while (true);
    }
}
