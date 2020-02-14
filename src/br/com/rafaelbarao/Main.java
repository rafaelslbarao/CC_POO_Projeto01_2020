package br.com.rafaelbarao;

public class Main {

    public static void main(String[] args) {
        // Criação de uma instância de um objeto da classe Marca
        Marca marcaVolskswagen = new Marca();
        marcaVolskswagen.nome = "Volkswagen";

        // Criação de uma instância de um objeto da classe Modelo
        Modelo modeloFusca = new Modelo();
        modeloFusca.ano = 1980;
        modeloFusca.marca = marcaVolskswagen;
        modeloFusca.nome = "Fusca";

        // Criação de uma instância de um objeto da classe Carro
        Carro carroFusca = new Carro(
                "AAA1111",
                "AZUL",
                modeloFusca,
                0,
                false,
                false,
                false,
                false,
                false
        );

        carroFusca.locomove();

        while(true) {
            Console console = new Console();
            console.escreveConsole("Digite um número inteiro");
            console.leNumeroInteiro();
            console.escreveConsole("Digite um texto");
            console.leTextoDigitado();
            console.escreveConsole("Digite um número double");
            console.leNumeroDouble();
        }
        //
    }
}
