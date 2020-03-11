package br.com.rafaelbarao.cadastroalunos.controladores;

import br.com.rafaelbarao.cadastroalunos.Console;
import br.com.rafaelbarao.cadastroalunos.entidades.Aluno;

import java.util.ArrayList;

public class AlunoControlador {
    private ArrayList<Aluno> lstAlunos;
    private Console console;

    public AlunoControlador(Console console) {
        lstAlunos = new ArrayList<>();
        this.console = console;
    }

    public void cadastraAluno() {
        console.escreveConsole("Informe o código:");
        Integer codigo = null;
        while (codigo == null) {
            Integer codigoTmp = console.leNumeroInteiro();
            boolean existente = verificaCodigoJaExistente(codigoTmp);
            if (existente)
                console.escreveConsole("Código já cadastrado. Informe um novo código:");
            else
                codigo = codigoTmp;
        }
        //
        console.escreveConsole("Informe o nome:");
        String nome = console.leLinhaTexto();
        //
        Aluno aluno = new Aluno(codigo, nome);
        lstAlunos.add(aluno);
        //
        console.escreveConsole("Cadastro realizado com sucesso!");
    }

    public boolean verificaCodigoJaExistente(Integer codigo) {
        for (int index = 0; index < lstAlunos.size(); index++) {
            Aluno aluno = lstAlunos.get(index);
            if (aluno.getCodigo().equals(codigo))
                return true;
        }
        return false;
    }

    public void excluiAluno() {
        console.escreveConsole("Informe o código:");
        Integer codigoTmp = console.leNumeroInteiro();
        //
        Aluno alunoParaExcluir = buscaAlunoPorCodigo(codigoTmp);
        if (alunoParaExcluir == null) {
            console.escreveConsole("Aluno não encontrado!");
        } else {
            lstAlunos.remove(alunoParaExcluir);
            console.escreveConsole(
                    "Exclusão realizada com sucesso! [" + alunoParaExcluir.getNome() + "]");
        }
    }

    public void editaAluno() {
        console.escreveConsole("Informe o código:");
        Integer codigoTmp = console.leNumeroInteiro();

        Aluno alunoParaEditar = buscaAlunoPorCodigo(codigoTmp);
        if (alunoParaEditar == null) {
            console.escreveConsole("Aluno não existe!");
        } else {
            console.escreveConsole("Informe o novo nome:");
            String novoNome = console.leLinhaTexto();
            alunoParaEditar.setNome(novoNome);
            console.escreveConsole("Nome do aluno alterado!");
        }
    }

    private Aluno buscaAlunoPorCodigo(Integer codigo) {
        for (int index = 0; index < lstAlunos.size(); index++) {
            Aluno aluno = lstAlunos.get(index);
            //
            if (aluno.getCodigo().equals(codigo)) {
                return aluno;
            }
        }
        return null;
    }

    public void imprimeRelatorioCodigos() {
        console.escreveConsole("# Lista de Códigos # ");
        for (int index = 0; index < lstAlunos.size(); index++) {
            Aluno aluno = lstAlunos.get(index);
            console.escreveConsole(aluno.getCodigo().toString());
        }
    }

    public void imprimeRelatorioNomes() {
        console.escreveConsole("# Lista de Nomes # ");
        for (int index = 0; index < lstAlunos.size(); index++) {
            Aluno aluno = lstAlunos.get(index);
            console.escreveConsole(aluno.getNome());
        }
    }
}
