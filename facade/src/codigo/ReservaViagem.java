package codigo;

// Exemplo de uso
public class ReservaViagem {
    public static void main(String[] args) {
        SistemaReservaFacade facade = new SistemaReservaFacade();
        facade.reservarViagem("São Paulo", "Nova York", "Hotel ABC", 2);
    }
}