package br.com.alura.lista;

import br.com.alura.lista.model.Aula;
import br.com.alura.lista.model.Curso;

import java.util.List;

public class TestandoCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Typescript do básico ao avançado", "Daniel Fonseca");

        javaColecoes.adiciona(new Aula("Golang", 6));
        javaColecoes.adiciona(new Aula("Amazon s3", 8));
        javaColecoes.adiciona(new Aula("Ruby e oo", 24));

        System.out.println(javaColecoes.getAulas());

        System.out.println(javaColecoes.getAulas());
    }

}
