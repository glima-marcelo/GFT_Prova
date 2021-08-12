package prova1;

import java.time.LocalDate;
import java.util.Scanner;

public class ControleVacina {
    public static void main(String[] args) {
        System.out.println("Olá usuário do sistema de vacinação, consulte aqui a data de sua próxima vacinação.");
        System.out.println("");

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o laboratório fabricante da sua vacina, Coronavac ou Jansenn apenas.");
        int confirma = 1;
        //vacina;

        while (confirma == 1) {
            String vacina = sc.nextLine();
            if (vacina.equals("Coronavac") || vacina.equals("Jansenn")) {
                confirma = 0;
            } else {
                confirma = 1;
                System.out.println("Vacina não encontrada! Verifique e digite novamente.");
            }
            System.out.println("Informe a data em que foi vacinado no formato dd. MM. AAAA.");
            LocalDate data = LocalDate.parse(sc.nextLine());
            if (vacina.equals("Coronavac")) {
                int intervalo = 14;
                LocalDate data2 = data.plusDays(intervalo);
                System.out.println("A vacina tomada foi a Coronavac.");
                System.out.println("A data da primeira dose foi em "+data);
                System.out.println("A data da segunda data será em "+data2);
            } else if (vacina.equals("Jansenn")) {
                System.out.println("A vacina tomada foi a Jansenn.");
                System.out.println("É uma vacina de dose única que foi em "+data);
            }
        }
    }
}
