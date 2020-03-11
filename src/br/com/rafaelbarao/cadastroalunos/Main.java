package br.com.rafaelbarao.cadastroalunos;

import br.com.rafaelbarao.cadastroalunos.controladores.AlunoControlador;

import java.util.ArrayList;

public class Main {
    private static Menu menu;
    private static Console console;
    private static ArrayList<OpcaoMenu> menuPrincipal;
    private static ArrayList<OpcaoMenu> menuRelatorios;
    private static AlunoControlador alunoControlador;

    public static void main(String[] args) {
        inicializaConsole();
        inicializaMenus();
        inicializaMenu();
        inicializaControladores();
        //
        abreMenuPrincipal();
    }

    private static void inicializaConsole() {
        console = new Console();
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
        menuRelatorios.add(new OpcaoMenu(99, "Voltar"));
    }

    private static void inicializaMenu() {
        menu = new Menu(console);
    }

    private static void inicializaControladores()
    {
        alunoControlador = new AlunoControlador(console);
    }

    private static void abreMenuPrincipal() {
        OpcaoMenu menuSelecionado;
        do {
            menuSelecionado = menu.imprimeMenuLeOpcaoValida(menuPrincipal);
            //
            switch (menuSelecionado.getOpcao().intValue()) {
                case 1:
                    alunoControlador.cadastraAluno();
                    break;
                case 2:
                    alunoControlador.excluiAluno();
                    break;
                case 3:
                    alunoControlador.editaAluno();
                    break;
                case 4:
                    abreMenuRelatorios();
                    break;
            }
        }
        while (!menuSelecionado.getOpcao().equals(99));
    }

    private static void abreMenuRelatorios() {
        OpcaoMenu menuSelecionado;
        do {
            menuSelecionado = menu.imprimeMenuLeOpcaoValida(menuRelatorios);
            //
            switch (menuSelecionado.getOpcao().intValue()) {
                case 1:
                    alunoControlador.imprimeRelatorioCodigos();
                    break;
                case 2:
                    alunoControlador.imprimeRelatorioNomes();
                    break;
            }
        }
        while (!menuSelecionado.getOpcao().equals(99));
    }
}