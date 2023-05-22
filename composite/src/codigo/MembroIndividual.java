package codigo;
import minhaInterface.*;
// Folha: implementação do componente para membros individuais da família
class MembroIndividual implements MembroFamilia {
    private String nome;

    public MembroIndividual(String nome) {
        this.nome = nome;
    }

    @Override
    public void apresentar() {
        System.out.println("Membro individual: " + nome);
    }
}