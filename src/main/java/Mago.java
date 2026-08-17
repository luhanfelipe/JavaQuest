public class Mago extends Personagem {

    public Mago(String nome, int vida, int ataque) {
        super(nome, vida, ataque);
    }

    public void lancarFeitico() {
        System.out.println(getNome() + " lançou um feitiço!");
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " lançou um feitiço!");
    }
}
