package br.com.joaocarloslima.vinteum.model;

import java.util.ArrayList;
import java.util.List;


public class Mao {

    private final List<Carta> cartas = new ArrayList<>();

    public void adicionar(Carta carta) {
        cartas.add(carta);
    }

    public int getPontos() {
        int pontos = 0;
        boolean temAs = false;

        for (Carta carta : cartas) {
            pontos += carta.getValor();
            if (carta.getNumero() == 1) {
                temAs = true;
            }
        }

        return temAs && pontos + 10 <= 21 ? pontos + 10 : pontos;
    }

    public boolean estourou() {
        return getPontos() > 21;
    }

    public List<Carta> getCartas() {
        return List.copyOf(cartas);
    }

}
