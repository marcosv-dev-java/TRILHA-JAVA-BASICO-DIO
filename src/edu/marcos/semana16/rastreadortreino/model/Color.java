package edu.marcos.semana16.rastreadortreino.model;

public enum Color {
     RED("\033[31m", "\033[1;31m", "\033[41m"),
     GREEN("\033[32m", "\033[1;32m", "\033[42m"),
     YELLOW("\033[33m", "\033[1;33m", "\033[43m"),
     BLUE("\033[34m", "\033[1;34m", "\033[44m"),
     CYAN("\033[36m", "\033[1;36m", "\033[46m");


    public static final String RESET = "\033[m";

     final String normal;
     final String bold;
     final String background;

    Color(String normal, String bold, String background) {
        this.normal = normal;
        this.bold = bold;
        this.background = background;
    }

    public String getNormal() {
        return normal;
    }

    public String getBold() {
        return bold;
    }

    public String getBackground() {
        return background;
    }
}


