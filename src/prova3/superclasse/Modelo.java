package prova3.superclasse;

public class Modelo {

    public String Nome;
    public Double Altura;
    public Double Peso;
    public Integer Idade;
    private String GravaMalhacao;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Double getAltura() {
        return Altura;
    }

    public void setAltura(Double altura) {
        Altura = altura;
    }

    public Double getPeso() {
        return Peso;
    }

    public void setPeso(Double peso) {
        Peso = peso;
    }

    public Integer getIdade() {
        return Idade;
    }

    public String getGravaMalhacao() {
        return GravaMalhacao;
    }

    public void setGravaMalhacao(String gravaMalhacao) {
        GravaMalhacao = gravaMalhacao;
    }

    public void setIdade(Integer idade) {
        Idade = idade;


    }
}
