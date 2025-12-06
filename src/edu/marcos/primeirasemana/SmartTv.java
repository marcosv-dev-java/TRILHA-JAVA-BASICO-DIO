package edu.marcos.primeirasemana;

public class SmartTv {
    boolean taLigada;
    int canal = 1;
    int volume = 25;
    public void ligar(){// LIGA A SMART TV
        taLigada = true;
    }

    public void desligar(){// DESLIGA A SMART TV
        taLigada = false;
    }

    public void aumentarVolume(){// AUMENTA O VOLUME
        volume++;
    }

    public void diminuirVolume(){// DIMINUI O VOLUME
        volume--;

    }
    public void subirCanal(){// MUDA O CANAL SUBINDO 1
        canal++;
    }
    public void descerCanal(){// DIMINUI O CANAL DESCENDO 1
        canal--;

    }
    public void escolherCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Mudando canal para: " + canal);
    }


}
