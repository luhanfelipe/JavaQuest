public class Main {

    public static void main(String[] args) {
        Personagem personagem = new Personagem("Luhan");

        System.out.println("Nome: " + personagem.getNome());

        personagem.setNome("Arthur");

        System.out.println("Novo nome: " + personagem.getNome());
    }

}
