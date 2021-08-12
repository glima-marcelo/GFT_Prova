package prova2.classepadrao;

public class Funcionario {

    public String Nome;
    public String Cargo;
    public Double Salario;
    public String RegimeTrabalho;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double salario) {
        Salario = salario;
    }

    public String getRegimeTrabalho() {
        return RegimeTrabalho;
    }

    public void setRegimeTrabalho(String regimeTrabalho) {
        RegimeTrabalho = regimeTrabalho;
    }
}
