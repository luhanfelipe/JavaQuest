public class Mago extends Personagem {

    public Mago(String nome, int vida, int ataque) {
        super(nome, vida, ataque);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " lançou um feitiço!");
    }
}
