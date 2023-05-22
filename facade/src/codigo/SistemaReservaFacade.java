package codigo;

// Facade: interface simplificada para os subsistemas de reserva
class SistemaReservaFacade {
    private SistemaReservaVoos sistemaReservaVoos;
    private SistemaReservaHoteis sistemaReservaHoteis;

    public SistemaReservaFacade() {
        sistemaReservaVoos = new SistemaReservaVoos();
        sistemaReservaHoteis = new SistemaReservaHoteis();
    }

    public void reservarViagem(String origem, String destino, String hotel, int numeroQuartos) {
        sistemaReservaVoos.verificarDisponibilidade(origem, destino);
        sistemaReservaVoos.selecionarVoo("Voo123");
        sistemaReservaVoos.reservarVoo();

        sistemaReservaHoteis.verificarDisponibilidade(destino, numeroQuartos);
        sistemaReservaHoteis.selecionarHotel(hotel);
        sistemaReservaHoteis.reservarHotel();

        System.out.println("Viagem reservada com sucesso!");
    }
}