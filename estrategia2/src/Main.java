import minhaInterface.*;

public class Main {
    public static void main(String[] args) {
        // Criando o personagem
        Character character = new Character();

        // Definindo uma estratégia de ataque com espada
        AttackStrategy swordAttack = new SwordAttackStrategy();
        character.setAttackStrategy(swordAttack);
        character.attack(); // Saída: "Atacando com uma espada!"

        // Definindo uma estratégia de ataque com arco e flechas
        AttackStrategy bowAttack = new BowAttackStrategy();
        character.setAttackStrategy(bowAttack);
        character.attack(); // Saída: "Atacando com um arco e flechas!"

        // Definindo uma estratégia de ataque com magia
        AttackStrategy magicAttack = new MagicAttackStrategy();
        character.setAttackStrategy(magicAttack);
        character.attack(); // Saída: "Atacando com magia!"
    }
}