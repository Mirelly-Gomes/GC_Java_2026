package classes;

import interfaces.Animal;

public class VacaMae implements Animal {
    int id;
    String nome;
    String raca;
    int idade;
    String status;
    String som;

    public VacaMae(int id, String nome, String raca, int idade, String status, String som) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.status = status;
        this.som = som;
    }

    @Override
    public void mostrarDados() {
        System.out.println("ID: " + id + " - " + nome + " (Vaca)");
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade);
        System.out.println("Status: " + status);
        System.out.println("Som: " + som);
    }

    @Override
    public void coletarProduto() {
        System.out.println("A vaca " + nome + " produziu leite.");
    }

    @Override
    public void emitirSom() {
        System.out.println("A vaquinha faz: " + som);
    }
}
