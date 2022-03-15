package br.com.alura.lista;

import br.com.alura.lista.model.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

    public static void main(String[] args) {
        Aula aula1 = new Aula("Golang", 6);
        Aula aula2 = new Aula("Amazon s3", 8);
        Aula aula3 = new Aula("Ruby e oo", 24);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        System.out.println(aulas);

        Collections.sort(aulas);
        System.out.println(aulas);

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);

        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);

    }

}
