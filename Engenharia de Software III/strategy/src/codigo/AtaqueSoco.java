package codigo;

// Implementação de uma estratégia de ataque com socos
import minhaInterface.*;
class AtaqueSoco implements AtaqueStrategy {
    @Override
    public void atacar() {
        System.out.println("Atacando com socos!");
    }
}