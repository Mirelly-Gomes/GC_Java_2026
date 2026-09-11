package classes;

public class Bezerro extends VacaMae {

    public Bezerro(int id, String nome, String raca, int idade, String status, String som) {
        super(id, nome, raca, idade, status, som);
    }

    @Override
    public void mostrarDados() {
        System.out.println("ID: " + id + " - " + nome + " (Bezerro)");
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade);
        System.out.println("Status: " + status);
        System.out.println("Som: " + som);
    }

    @Override
    public void coletarProduto() {
        System.out.println("O bezerro " + nome + " ainda não produz leite.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O bezerro faz: " + som);
    }
}
