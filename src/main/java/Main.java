public class Main {

    public static void main(String[] args) {

        Personagem personagem = new Personagem("Luhan", 100, 20);

        personagem.mostrarStatus();

        System.out.println();

        personagem.setVida(80);
        personagem.setAtaque(25);

        System.out.println("Após algumas alterações:");

        personagem.mostrarStatus();
    }
}
