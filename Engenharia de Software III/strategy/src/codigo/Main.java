package codigo;

public class Main {
    public static void main(String[] args) {
        // Criação dos personagens
        Personagem personagem1 = new Personagem();
        Personagem personagem2 = new Personagem();

        // Define as estratégias de ataque para os personagens
        personagem1.setAtaqueStrategy(new AtaqueSoco());
        personagem2.setAtaqueStrategy(new AtaqueArma());

        // Personagem 1 executa seu ataque
        personagem1.executarAtaque();

        // Personagem 2 executa seu ataque
        personagem2.executarAtaque();

        // Altera a estratégia de ataque do personagem 1
        personagem1.setAtaqueStrategy(new AtaqueChute());

        // Personagem 1 executa seu novo ataque
        personagem1.executarAtaque();
    }
}