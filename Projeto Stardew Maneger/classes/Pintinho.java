package classes;

public class Pintinho extends GalinhaMae {

    public Pintinho(int id, String nome, String raca, int idade, String status, String som) {
        super(id, nome, raca, idade, status, som);
    }

    @Override
    public void mostrarDados() {
        System.out.println("ID: " + id + " - " + nome + " (Pintinho)");
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade);
        System.out.println("Status: " + status);
        System.out.println("Som: " + som);
    }

    @Override
    public void coletarProduto() {
        System.out.println("O pintinho " + nome + " ainda não produz ovos.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O pintinho faz: " + som);
    }
}
