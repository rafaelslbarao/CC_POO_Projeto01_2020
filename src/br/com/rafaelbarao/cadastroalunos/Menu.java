package br.com.rafaelbarao.cadastroalunos;

import br.com.rafaelbarao.cadastroalunos.Console;
import br.com.rafaelbarao.cadastroalunos.OpcaoMenu;

import java.util.ArrayList;

public class Menu {
    private Console console;

    public Menu(Console console) {
        this.console = console;
    }

    private void imprimeMenu(ArrayList<OpcaoMenu> listaOpcoes) {
        console.escreveConsole("");
        console.escreveConsole("#######################");
        //
        for (OpcaoMenu opcaoMenu : listaOpcoes) {
            console.escreveConsole(opcaoMenu.getLayoutImpressao());
        }
        console.escreveConsole("");
    }

    private OpcaoMenu leOpcaoValida(ArrayList<OpcaoMenu> listaOpcoes) {
        OpcaoMenu opcaoRetorno = null;
        //
        do {
            console.escreveConsole("Digite opção: ");
            Integer opcaoDigitada = console.leNumeroInteiro();
            for (OpcaoMenu opcaoMenu : listaOpcoes) {
                if (opcaoDigitada.equals(opcaoMenu.getOpcao())) {
                    opcaoRetorno = opcaoMenu;
                    break;
                }
            }
            if (opcaoRetorno == null)
                console.escreveConsole("Opção Inválida");
        }
        while (opcaoRetorno == null);
        //
        return opcaoRetorno;
    }

    public OpcaoMenu imprimeMenuLeOpcaoValida(ArrayList<OpcaoMenu> listaOpcoes)
    {
        imprimeMenu(listaOpcoes);
        return leOpcaoValida(listaOpcoes);
    }

    private String nomeMenu;

    public String getNomeMenu() {
        return nomeMenu;
    }

    public void setNomeMenu(String nomeMenu) {
        this.nomeMenu = nomeMenu;
    }
}
