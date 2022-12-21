package com.mycompany.jumanji_poo;

public class Boi extends Animal {

    public Boi(String nome) {
        super(nome);
        setAtratividadeBase(1000);
        setEsperancaVida(17);
        // num aleatorio de 0 a 17
        setIdade(numAleatorioArray(getEsperancaVida()));
        setViasExtincao(false);
    }

    public Boi() {
        setAtratividadeBase(1000);
        setEsperancaVida(17);
        // num aleatorio de 0 a 17
        setIdade(numAleatorioArray(getEsperancaVida()));
        setViasExtincao(false);
    }

}