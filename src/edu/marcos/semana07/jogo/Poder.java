package edu.marcos.semana07.jogo;

public enum Poder {
    FOGO(200,"\033[1;31mFOGO\033[m", 1400){
        public void executarUltimate(Poder inimigo){
            System.out.println("Inimigo queimou e perdeu \033[1;31m70hp\033[m!");
            inimigo.receberDano(70);
        }
    },
    RAIO(150,"\033[1;33mRAIO\033[m", 1700){
        public void executarUltimate(Poder inimigo){
            System.out.println("Inimigo levou um raio de alta potência!! perdeu \033[1;31m120hp\033[m!");
            inimigo.receberDano(120);
        }
    },
    VOID(400, "\033[1;35mVOID\033[m", 900){
        public void executarUltimate(Poder inimigo){
            System.out.println("INIMIGO FOI SUGADO POR 2 PORTAIS!! perdeu \033[1;31m400hp\033[m!");
            inimigo.receberDano(400);
        }
    };

   private int dano;
   private String tipoPoder;
   private int hp;

    Poder(int dano, String tipoPoder, int hp) {
        this.dano = dano;
        this.tipoPoder = tipoPoder;
        this.hp = hp;

    }

    public int getDano() {
        return dano;
    }
    private int jogadas;
    public int carregarUltimate(){
        return jogadas++;
    }
    public boolean podeUsarUltimate(){
        return carregarUltimate() == 3;
    }


    public String getTipoPoder() {
        return tipoPoder;
    }
    public void receberDano(int dano) {
        this.hp -= dano;
    }

    public int getHp() {
        return hp;
    }
    public abstract  void executarUltimate(Poder inimigo);

    public String toString() {
        return "===== " + this.getTipoPoder() + " ====="+ "\n\033[1;32mHP: \033[m"+ this.getHp() + "\n\033[1;31mDANO: \033[m"+ this.getDano();
    }
}
