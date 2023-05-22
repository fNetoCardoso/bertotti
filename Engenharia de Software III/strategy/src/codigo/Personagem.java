package codigo;

import minhaInterface.AtaqueStrategy;

//Classe que representa o personagem do jogo
class Personagem {
 private AtaqueStrategy ataqueStrategy;

 public void setAtaqueStrategy(AtaqueStrategy ataqueStrategy) {
     this.ataqueStrategy = ataqueStrategy;
 }

 public void executarAtaque() {
     ataqueStrategy.atacar();
 }
}