package codigo;

import minhaInterface.AtaqueStrategy;

// Implementação de uma estratégia de ataque com armas
class AtaqueArma implements AtaqueStrategy {
    @Override
    public void atacar() {
        System.out.println("Atacando com arma!");
    }
}