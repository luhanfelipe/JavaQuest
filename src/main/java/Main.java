public class Main {

    public static void main(String[] args) {

        Personagem guerreiro = new Guerreiro("Aragorn", 120, 25);
        Personagem mago = new Mago("Gandalf", 80, 35);

        System.out.println("=== COMBATE ===");

        guerreiro.atacar();
        mago.atacar();
    }
}
