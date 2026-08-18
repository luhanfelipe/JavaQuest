public class Guerreiro extends Personagem {

    public Guerreiro(String nome, int vida, int ataque) {
        super(nome, vida, ataque);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " atacou com sua espada!");
    }
}
