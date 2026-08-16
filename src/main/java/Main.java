public class Main {

    public static void main(String[] args) {

        Guerreiro guerreiro = new Guerreiro("Aragorn", 120, 25);
        Mago mago = new Mago("Gandalf", 80, 35);

        System.out.println("=== GUERREIRO ===");
        guerreiro.mostrarStatus();
        guerreiro.atacarComEspada();

        System.out.println();

        System.out.println("=== MAGO ===");
        mago.mostrarStatus();
        mago.lancarFeitico();
    }
}
