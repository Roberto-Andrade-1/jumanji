package Animais;

import Genoma.Canis;

public class Cao extends Animal implements Canis {

    private static double atratividadeBase;
    private static boolean viasExtincao;
    private static final int ESPERANCA_VIDA = 15;
    private static final int APETITE_REPRODUTIVO = 60;

    public Cao(String nome) {
        super(nome);
        setAtratividadeBase(1500);
        setViasExtincao(false);
        setIdade(numAleatorioArray(getEsperancaVida()));
    }

    public Cao(int idAnimal, int idade, String nome, String SEXO, boolean ALBINISMO, boolean VITILIGO,
            boolean MELANISMO, boolean HETEROCROMIA, boolean SIAMES) {
        super(idAnimal, idade, nome, SEXO, ALBINISMO, VITILIGO, MELANISMO, HETEROCROMIA, SIAMES);
        setAtratividadeBase(1500);
        setViasExtincao(false);
        setIdade(numAleatorioArray(getEsperancaVida()));
    }

    public Cao() {
        setAtratividadeBase(1500);
        setViasExtincao(false);
        setIdade(numAleatorioArray(getEsperancaVida()));
    }

    public Cao(int idade) {
        setAtratividadeBase(1500);
        // num aleatorio de 0 a 15
        setIdade(idade);
        setViasExtincao(false);
    }

    public int getEsperancaVida() {
        return ESPERANCA_VIDA;
    }

    @Override
    public void uivar() {
        System.out.println("auuuu");
    }

    public static double getAtratividadeBase() {
        return atratividadeBase;
    }

    public static void setAtratividadeBase(double atratividadeBase) {
        Cao.atratividadeBase = atratividadeBase;
    }

    @Override
    public double retornaAtratividade() {
        double total = getAtratividadeBase();

        if (isViasExtincao()) {
            total += getAtratividadeBase() * 0.5;
        }

        // bebe
        if (getIdade() <= Math.round(getEsperancaVida() / 5)) {
            total += getAtratividadeBase() * 0.5;
        }

        // velho
        else if (getIdade() > Math.round(getEsperancaVida() * (3 / 4))) {
            total -= getAtratividadeBase() - (getAtratividadeBase() * 0.25);
        }

        // Mutações
        if (isAlbinismo()) {
            total += getAtratividadeBase() * 0.5;
        }
        if (isHeterocromia()) {
            total += getAtratividadeBase() * 0.35;
        }
        if (isMelanismo()) {
            total += getAtratividadeBase() * 0.5;
        }
        if (isVitiligo()) {
            total += getAtratividadeBase() * 0.25;
        }
        if (isSiames()) {
            total += getAtratividadeBase() * 0.1;
        }

        return total;
    }

    @Override
    public double retornaCusto() {
        // Random rand=new Random();
        double total = getAtratividadeBase() / 5 + CUSTO_CANIS;
        if (isAlbinismo())
            total += getAtratividadeBase() / 5;
        if (isSiames())
            total += getAtratividadeBase() / 8;
        if (isHeterocromia())
            total += getAtratividadeBase() / 6;
        if (isMelanismo())
            total += getAtratividadeBase() / 6;
        if (isVitiligo())
            total += getAtratividadeBase() / 8;
        if (isViasExtincao())
            total += getAtratividadeBase() / 3;
        if (getIdade() <= Math.round(getEsperancaVida() / 5))
            total += getAtratividadeBase() / 4;
        else if (getIdade() > Math.round(getEsperancaVida() * (3 / 4)))
            total -= getAtratividadeBase() / 10;
        return Math.round(total * 100) / 100;
    }

    @Override
    public int retornaEsperancaVida() {
        return ESPERANCA_VIDA;
    }

    @Override
    public int retornaApetiteReprodutivo() {
        return APETITE_REPRODUTIVO;
    }

    public static boolean isViasExtincao() {
        return viasExtincao;
    }

    public static void setViasExtincao(boolean viasExtincao) {
        Cao.viasExtincao = viasExtincao;
    }

    public static int getApetiteReprodutivo() {
        return APETITE_REPRODUTIVO;
    }
}