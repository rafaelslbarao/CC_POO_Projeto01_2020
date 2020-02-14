package br.com.rafaelbarao;

public class Carro {
    String placa;
    String cor;
    Modelo modelo;
    Integer hodometro;
    Boolean portaDianteiraEsquerda;
    Boolean portaTraseiraEsquerda;
    Boolean portaDianteiraDireita;
    Boolean portaTraseiraDireita;
    Boolean portaMalas;

    public Carro(String placa, String cor, Modelo modelo, Integer hodometro, Boolean portaDianteiraEsquerda, Boolean portaTraseiraEsquerda, Boolean portaDianteiraDireita, Boolean portaTraseiraDireita, Boolean portaMalas) {
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
        this.hodometro = hodometro;
        this.portaDianteiraEsquerda = portaDianteiraEsquerda;
        this.portaTraseiraEsquerda = portaTraseiraEsquerda;
        this.portaDianteiraDireita = portaDianteiraDireita;
        this.portaTraseiraDireita = portaTraseiraDireita;
        this.portaMalas = portaMalas;
    }

    Boolean abreFechaPortaDianteiraEsquerda() {
        portaDianteiraEsquerda = !portaDianteiraEsquerda;
        return true;
    }

    Boolean abreFechaPortaDianteiraDireita() {
        portaDianteiraDireita = !portaDianteiraDireita;
        return true;
    }

    Boolean abreFechaPortaTraseiraDireita() {
        portaTraseiraDireita = !portaTraseiraDireita;
        return true;
    }

    Boolean abreFechaPortaTraseiraEsquerda() {
        portaTraseiraEsquerda = !portaTraseiraEsquerda;
        return true;
    }

    Boolean abreFechaPortaMapas() {
        portaMalas = !portaMalas;
        return true;
    }

    void locomove()
    {
        hodometro++;
    }


}
