package br.com.rafaelbarao;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Console console = new Console();
        //
        ArrayList<OpcaoMenu> listOpcaaMenu = new ArrayList<>();
        listOpcaaMenu.add(new OpcaoMenu(1, "OPCAO 1"));
        listOpcaaMenu.add(new OpcaoMenu(2, "OPCAO 2"));
        listOpcaaMenu.add(new OpcaoMenu(3, "OPCAO 3"));
        listOpcaaMenu.add(new OpcaoMenu(4, "OPCAO 4"));
        listOpcaaMenu.add(new OpcaoMenu(5, "OPCAO 5"));
        //
        OpcaoMenu[] arrayOpcoes = new OpcaoMenu[]
                {
                        new OpcaoMenu(1, "OPCAO 1")
                        , new OpcaoMenu(2, "OPCAO 2")
                        , new OpcaoMenu(3, "OPCAO 3")
                        , new OpcaoMenu(4 , "OPCAO 4")
                        , new OpcaoMenu(5 , "OPCAO 5")
                };
        //
        for(OpcaoMenu menuAtual : listOpcaaMenu)
        {
            console.escreveConsole(menuAtual.getLayoutImpressao());
        }


//
//
//        for(int i = 0; i < arrayOpcoes.length; i ++)
//        {
//            OpcaoMenu menuAtual = arrayOpcoes[i];
//            console.escreveConsole(menuAtual.getLayoutImpressao());
//        }
//
//        for(OpcaoMenu menuAtual : arrayOpcoes)
//        {
//            console.escreveConsole(menuAtual.getLayoutImpressao());
//        }

        arrayOpcoes[3] = new OpcaoMenu();
        listOpcaaMenu.add(new OpcaoMenu());
    }


//    public static void main(String[] args) {
//
//        // Criação de uma instância de um objeto da classe Marca
//        Marca marcaVolskswagen = new Marca();
//        marcaVolskswagen.nome = "Volkswagen";
//
//        // Criação de uma instância de um objeto da classe Modelo
//        Modelo modeloFusca = new Modelo();
//        modeloFusca.ano = 1980;
//        modeloFusca.marca = marcaVolskswagen;
//        modeloFusca.nome = "Fusca";
//
//        // Criação de uma instância de um objeto da classe Carro
//        Carro carroFusca = new Carro(
//                "AAA1111",
//                "AZUL",
//                modeloFusca,
//                0,
//                false,
//                false,
//                false,
//                false,
//                false
//        );
//
//        carroFusca.locomove();
//        //
//
//
//
//
//    }
}
