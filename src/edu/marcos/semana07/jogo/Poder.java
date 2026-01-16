package edu.marcos.semana07.jogo;

public enum Poder {
    FOGO(200,"FOGO", 800){
        public void executarUltimate(Poder inimigo){
            System.out.println("Inimigo queimou e perdeu \033[1;31m70hp\033[m!");
            inimigo.receberDano(70);
        }
    },
    RAIO(150,"RAIO", 650){
        public void executarUltimate(Poder inimigo){
            System.out.println("Inimigo levou um raio de alta potência!! perdeu \033[1;31m120hp\033[m!");
            inimigo.receberDano(120);
        }
    },
    VOID(300, "VOID", 300){
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
