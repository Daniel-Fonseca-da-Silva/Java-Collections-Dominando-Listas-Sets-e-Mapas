package br.com.alura.lista.exercicio;

import br.com.alura.lista.exercicio.model.Database;
import br.com.alura.lista.exercicio.model.Sistema;

import java.time.LocalDate;

public class ExercicioListaDeSistema {

    public static void main(String[] args) {

        Sistema sistemas = new Sistema("Linux", "20.04");
        System.out.println(sistemas.getDatabases());

        sistemas.adiciona(new Database("PostgreSQL Database", LocalDate.of(2022, 02, 10), LocalDate.of(2022, 2, 20)));
        sistemas.adiciona(new Database("MongoDB Database", LocalDate.of(2022, 02, 05), LocalDate.of(2022, 2, 15)));
        sistemas.adiciona(new Database("Oracle Database", LocalDate.of(2022, 01, 1), LocalDate.of(2022, 1, 10)));


        System.out.println(sistemas.getDatabases());
    }

}
