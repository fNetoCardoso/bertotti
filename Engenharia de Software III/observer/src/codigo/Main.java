package codigo;



public class Main {
    public static void main(String[] args) {
        // Criando o sistema de estoque
        StockSystem stockSystem = new StockSystem();

        // Criando gerentes de estoque (observadores)
        StockManager manager1 = new StockManager("John");
        StockManager manager2 = new StockManager("Alice");

        // Registrando os gerentes de estoque como observadores
        stockSystem.addObserver(manager1);
        stockSystem.addObserver(manager2);

        // Atualizando o estoque de um produto
        stockSystem.setProductQuantity("Product A", 100);

        // Removendo um observador
        stockSystem.removeObserver(manager1);

        // Atualizando novamente o estoque
        stockSystem.setProductQuantity("Product B", 50);

        // Resultado esperado:
        // Stock Manager John received an update:
        // Product: Product A
        // Quantity: 100
        //
        // Stock Manager Alice received an update:
        // Product: Product A
        // Quantity: 100
        //
        // Stock Manager Alice received an update:
        // Product: Product B
        // Quantity: 50
    }
}