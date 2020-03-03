package br.com.rafaelbarao.cadastroalunos;

import java.util.ArrayList;

public class Main {
    private static Menu menu;
    private static ArrayList<OpcaoMenu> menuPrincipal;
    private static ArrayList<OpcaoMenu> menuRelatorios;

    public static void main(String[] args) {
        inicializaMenus();
        inicializaMenu();
        //
        menu.imprimeMenuLeOpcaoValida(menuPrincipal);
    }

    private static void inicializaMenus() {
        menuPrincipal = new ArrayList<OpcaoMenu>();
        menuPrincipal.add(new OpcaoMenu(1, "Cadastrar Aluno"));
        menuPrincipal.add(new OpcaoMenu(2, "Excluir Aluno"));
        menuPrincipal.add(new OpcaoMenu(3, "Editar Aluno"));
        menuPrincipal.add(new OpcaoMenu(4, "Relatórios"));
        menuPrincipal.add(new OpcaoMenu(99, "Sair"));
        //
        menuRelatorios = new ArrayList<OpcaoMenu>();
        menuRelatorios.add(new OpcaoMenu(1, "Listar Códigos Alunos"));
        menuRelatorios.add(new OpcaoMenu(2, "Listar Nomes Alunos"));
        menuRelatorios.add(new OpcaoMenu(3, "Voltar"));
    }

    private static void inicializaMenu() {
        Console console = new Console();
        menu = new Menu(console);
    }
}