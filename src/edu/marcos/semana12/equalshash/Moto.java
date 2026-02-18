package edu.marcos.semana12.equalshash;

import java.util.Objects;

public class Moto {
    private String marca;

    public Moto(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Moto moto = (Moto) o;
        return Objects.equals(marca, moto.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(marca);
    }

}
