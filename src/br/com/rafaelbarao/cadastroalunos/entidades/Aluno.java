package br.com.rafaelbarao.cadastroalunos.entidades;

public class Aluno {
    private Integer codigo;
    private String nome;

    public Aluno() {
    }

    public Aluno(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
