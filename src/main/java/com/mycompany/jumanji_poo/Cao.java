package com.mycompany.jumanji_poo;

public class Cao extends Animal implements Canis {

    public Cao(String nome) {
        super(nome);
        setAtratividadeBase(1500);
        setEsperancaVida(15);
        setViasExtincao(false);
        setIdade(numAleatorioArray(getEsperancaVida()));
    }

    public Cao() {
        setAtratividadeBase(1500);
        setEsperancaVida(15);
        setViasExtincao(false);
        setIdade(numAleatorioArray(getEsperancaVida()));
    }

    @Override
    public void uivar() {
        System.out.println("auuuu");
    }

}