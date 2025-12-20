package edu.marcos.terceirasemana.escola;
public class Aluno {
    private String nome;
    private double nota;

    public Aluno() {
        // CASO ALUNO NÃO ESTEJA PREENCHIDO ELE VAI SER DECLARADO COMO NÃO DECLARADO E NOTA 0
    this("Não declarado", 0);
    }

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return this.nome;
    }

    public double getNota() {
        return this.nota;
    }

    void setNome(String nome){
        this.nome = nome;
    }
    void setNota(double nota){
        if(nota < 0 || nota > 10){
            System.out.println("\033[1;31mNOTA INVÁLIDA\033[m");
        }
        else{
            this.nota = nota;
        }
    }
        boolean aprovado(){
            if(this.nota >= 6){
                return true;
            }
            else{
                return false;
            }
        }
        String situacao(){
        if (aprovado()){
                return "\033[1;32mAPROVADO\033[m";
            }
        else{
            return "\033[1;31mREPROVADO\033[m";
        }
        }
    }