public class Main {
    public static void main(String[] args) {
        Personagem personagem = new Personagem("Aria", "Guerreira", 1);

        System.out.println("Personagem criado com sucesso!");
        System.out.println("Nome: " + personagem.getNome());
        System.out.println("Classe: " + personagem.getClasse());
        System.out.println("Nível: " + personagem.getNivel());
    }
}
