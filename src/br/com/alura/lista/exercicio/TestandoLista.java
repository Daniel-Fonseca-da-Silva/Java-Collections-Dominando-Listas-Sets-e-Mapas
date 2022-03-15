package br.com.alura.lista.exercicio;

import java.util.ArrayList;
import java.util.List;

public class TestandoLista {

    public static void main(String[] args) {
        List<String> cursosFavoritos = new ArrayList<>();
        cursosFavoritos.add("Docker");
        cursosFavoritos.add("Spring Boot");
        cursosFavoritos.add("Principios de SOLID");

        cursosFavoritos.forEach(cursoFavorito -> {
            System.out.println(cursoFavorito);
        });

    }

}