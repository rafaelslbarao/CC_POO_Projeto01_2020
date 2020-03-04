package br.com.rafaelbarao.cadastroalunos.controladores;

import br.com.rafaelbarao.cadastroalunos.Console;
import br.com.rafaelbarao.cadastroalunos.entidades.Aluno;

import java.util.ArrayList;

public class AlunoControlador {
    private ArrayList<Aluno> listaAlunos;
    private Console console;

    public AlunoControlador(Console console) {
        listaAlunos = new ArrayList<>();
        this.console = console;
    }

    public void cadastraAluno() {
        console.escreveConsole("Informe o código:");
        Integer codigo = console.leNumeroInteiro();
        console.escreveConsole("Informe o nome:");
        String nome = console.leLinhaTexto();
        //
        Aluno aluno = new Aluno(codigo, nome);
        listaAlunos.add(aluno);
        //
        console.escreveConsole("Cadastro realizado com sucesso!");
    }
}
