package prova3.superclasse;
import prova3.superclasse.Modelo;

public class Ator extends Modelo {

    public String NivelAtor;
    private String GravaNovela;

    public String getNivelAtor() {
        return NivelAtor;
    }

    public String getGravaNovela() {
        return GravaNovela;
    }

    public void setGravaNovela(String gravaNovela) {
        GravaNovela = gravaNovela;
    }

    public void setNivelAtor(String nivelAtor) {
        NivelAtor = nivelAtor;


    }
}
