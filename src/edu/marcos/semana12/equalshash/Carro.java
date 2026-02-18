package edu.marcos.semana12.equalshash;

import java.util.Objects;

public class Carro {
    private String marca;

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
}
