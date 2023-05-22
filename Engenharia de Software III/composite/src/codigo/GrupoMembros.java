package codigo;

import java.util.ArrayList;
import java.util.List;

import minhaInterface.MembroFamilia;

// Composite: implementação do componente para grupos de membros da família
class GrupoMembros implements MembroFamilia {
    private List<MembroFamilia> membros;

    public GrupoMembros() {
        membros = new ArrayList<>();
    }

    public void adicionarMembro(MembroFamilia membro) {
        membros.add(membro);
    }

    public void removerMembro(MembroFamilia membro) {
        membros.remove(membro);
    }

    @Override
    public void apresentar() {
        System.out.println("Grupo de membros:");
        for (MembroFamilia membro : membros) {
            membro.apresentar();
        }
    }
}
