package br.com.josue.cm;

import br.com.josue.cm.model.Tabuleiro;
import br.com.josue.cm.vision.TabuleiroConsole;

public class Aplicacao {

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
        new TabuleiroConsole(tabuleiro);
    }
}
