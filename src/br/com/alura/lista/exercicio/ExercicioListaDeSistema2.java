package br.com.alura.lista.exercicio;

import br.com.alura.lista.exercicio.model.Database;
import br.com.alura.lista.exercicio.model.Sistema;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ExercicioListaDeSistema2 {

    public static void main(String[] args) {

        Sistema sistemas = new Sistema("Linux", "20.04");
        System.out.println(sistemas.getDatabases());

        sistemas.adiciona(new Database("PostgreSQL Database", LocalDate.of(2022, 02, 10), LocalDate.of(2022, 2, 20)));
        sistemas.adiciona(new Database("MongoDB Database", LocalDate.of(2022, 02, 05), LocalDate.of(2022, 2, 15)));
        sistemas.adiciona(new Database("Oracle Database", LocalDate.of(2022, 01, 1), LocalDate.of(2022, 1, 10)));

        List<Database> databasesImutaveis = sistemas.getDatabases();
        System.out.println(databasesImutaveis);

        List<Database> databases = new LinkedList<>(databasesImutaveis);
        System.out.println(databases);

        Collections.sort(databases, Comparator.comparing(Database::getDataInicio));
        System.out.println(databases);

        System.out.println(sistemas);

    }

}
