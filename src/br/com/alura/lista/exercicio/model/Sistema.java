package br.com.alura.lista.exercicio.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sistema {

    private String nome;
    private String versao;

    private List<Database> databases = new LinkedList<>();

    public Sistema(String nome, String versao) {
        this.nome = nome;
        this.versao = versao;
    }

    public String getNome() {
        return nome;
    }

    public String getVersao() {
        return versao;
    }

    public List<Database> getDatabases() {
        return Collections.unmodifiableList(databases);
    }

    public void adiciona(Database databases) {
        this.databases.add(databases);
    }

    @Override
    public String toString() {
        return "Sistema{" +
                "nome='" + nome + '\'' +
                ", versao='" + versao + '\'' +
                ", databases=" + databases +
                '}';
    }
}
