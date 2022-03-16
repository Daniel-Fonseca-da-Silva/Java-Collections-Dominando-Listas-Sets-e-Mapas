package br.com.alura.lista;

import br.com.alura.lista.model.Aula;
import br.com.alura.lista.model.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoCurso2 {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Typescript do básico ao avançado", "Daniel Fonseca");

        javaColecoes.adiciona(new Aula("Golang", 6));
        javaColecoes.adiciona(new Aula("Amazon s3", 8));
        javaColecoes.adiciona(new Aula("Ruby e oo", 24));
        javaColecoes.adiciona(new Aula("Basic e net", 15));
        javaColecoes.adiciona(new Aula("C++ e C", 30));
        javaColecoes.adiciona(new Aula("Lua", 22));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);

        System.out.println(aulas);

        System.out.println(javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);
    }

}
