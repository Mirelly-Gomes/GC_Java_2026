import interfaces.Animal;
import classes.*;
import java.util.ArrayList;
import java.util.Scanner;

public class stardewManeger {

    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new VacaMae(1, "Mimosa", "Holandesa", 5, "Saudável", "Muuu"));
        animais.add(new Bezerro(2, "Bento", "Holandesa", 1, "Saudável", "Muuu"));
        animais.add(new Pintinho(3, "Tommy", "Caipira", 1, "Saudável", "Piu piu"));
        animais.add(new VacaMae(4, "Bea", "Jersey", 4, "Saudável", "Muuu"));
        animais.add(new GalinhaMae(5, "Peppa", "Caipira", 2, "Saudável", "Cocoricó"));

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Ver animais do curral");
            System.out.println("2. Comércio (Coletar produtos)");
            System.out.println("3. Sair");
            System.out.print("Escolha sua opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n===== ANIMAIS DO CURRAL =====");
                    for (Animal animal : animais) {
                        animal.mostrarDados();
                        System.out.println("--------------------");
                    }
                    break;

                case 2:
                    System.out.println("\n===== PRODUTOS =====");
                    for (Animal animal : animais) {
                        animal.coletarProduto();
                    }
                    break;

                case 3:
                    System.out.println("Volte sempre!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
