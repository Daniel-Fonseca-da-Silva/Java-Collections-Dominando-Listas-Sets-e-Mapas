package br.com.alura.lista.exercicio;

import br.com.alura.lista.exercicio.model.Database;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExercicioListaDeAula {

    public static void main(String[] args) {

        Database db1 = new Database("PostgreSQL Database", LocalDate.of(2022, 02, 10), LocalDate.of(2022, 2, 20));
        Database db2 = new Database("MongoDB Database", LocalDate.of(2022, 02, 05), LocalDate.of(2022, 2, 15));
        Database db3 = new Database("Oracle Database", LocalDate.of(2022, 01, 1), LocalDate.of(2022, 1, 10));

        List<Database> aulasDB = new ArrayList<>();
        aulasDB.add(db1);
        aulasDB.add(db2);
        aulasDB.add(db3);

        System.out.println(aulasDB);

        Collections.sort(aulasDB, Comparator.comparing(Database::getName));
        System.out.println(aulasDB);

        aulasDB.sort(Comparator.comparing(Database::getDataInicio));
        System.out.println(aulasDB);

    }

}
