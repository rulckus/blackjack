package br.com.joaocarloslima.vinteum.model;

public class Carta {

    private final int numero;
    private final Naipe naipe;

    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public int getNumero() {
        return numero;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public int getValor() {
        return Math.min(numero, 10);
    }

    public String getImagem() {
        String nome = switch (numero) {
            case 1 -> "Ace";
            case 11 -> "Jack";
            case 12 -> "Queen";
            case 13 -> "King";
            default -> String.valueOf(numero);
        };
        return nome + naipe + ".png";
    }

}
