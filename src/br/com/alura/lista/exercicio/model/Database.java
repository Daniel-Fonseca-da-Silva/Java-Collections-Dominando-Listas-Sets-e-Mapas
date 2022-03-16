package br.com.alura.lista.exercicio.model;

import java.time.LocalDate;

public class Database implements Comparable<Database>{

    private String name;
    private LocalDate dataInicio;
    private LocalDate dataFinal;

    public Database(String name, LocalDate dataInicio, LocalDate dataFinal) {
        this.name = name;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    @Override
    public String toString() {
        return "Database{" +
                "name='" + name + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataFinal=" + dataFinal +
                '}';
    }

    @Override
    public int compareTo(Database outraDatabase) {
        return name.compareTo(outraDatabase.getName());
    }
}
