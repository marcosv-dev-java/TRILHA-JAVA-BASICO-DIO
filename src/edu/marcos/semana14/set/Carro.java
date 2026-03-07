package edu.marcos.semana14.set;

import java.util.Objects;

public class Carro implements Comparable<Carro>{
    private String marca;
    private int ano;

    public String getMarca() {
        return marca;
    }

    public Carro() {
    }

    public Carro(String marca) {
        this.marca = marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(marca, carro.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(marca);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }

    @Override
    public int compareTo(Carro o) {
        return this.getMarca().compareTo(o.getMarca());
    }
}
