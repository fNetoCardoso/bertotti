package codigo;

import minhaInterface.*;
// Exemplo de uso
public class ArvoreGenealogica {
    public static void main(String[] args) {
        MembroFamilia membro1 = new MembroIndividual("João");
        MembroFamilia membro2 = new MembroIndividual("Maria");
        MembroFamilia membro3 = new MembroIndividual("Pedro");
        
        GrupoMembros grupo1 = new GrupoMembros();
        grupo1.adicionarMembro(membro1);
        grupo1.adicionarMembro(membro2);

        GrupoMembros grupo2 = new GrupoMembros();
        grupo2.adicionarMembro(grupo1);
        grupo2.adicionarMembro(membro3);
        
        grupo2.apresentar();
    }
}