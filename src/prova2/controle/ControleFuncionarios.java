package prova2.controle;
import prova2.classepadrao.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class ControleFuncionarios {
    public static void main(String[] args) {
        Funcionario Pedro = new Funcionario();
        Pedro.setNome("Pedro dos Anjos");
        Pedro.setCargo("Estagiário");
        Pedro.setSalario(800.00);
        Pedro.setRegimeTrabalho("100% home office");

        Funcionario Carlos = new Funcionario();
        Carlos.setNome("Carlos Santana");
        Carlos.setCargo("Junior");
        Carlos.setSalario(1200.00);
        Carlos.setRegimeTrabalho("Presencial");

        Funcionario Maria = new Funcionario();
        Maria.setNome("Maria de Souza");
        Maria.setCargo("Sênior");
        Maria.setSalario(2500.00);
        Maria.setRegimeTrabalho("Híbrido");

        List<Funcionario> folha = new ArrayList<Funcionario>();

        for (Funcionario f : folha) {
            System.out.println(f.getNome()+" - "+f.getCargo()+" - "+f.getSalario()+" - "+f.getRegimeTrabalho());
        }
    }
}
