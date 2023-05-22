package codigo;

import minhaInterface.AtaqueStrategy;

// Implementação de uma estratégia de ataque com chutes
class AtaqueChute implements AtaqueStrategy {
    @Override
    public void atacar() {
        System.out.println("Atacando com chutes!");
    }
}