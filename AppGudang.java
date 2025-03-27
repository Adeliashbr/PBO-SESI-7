public class AppGudang {
    public static void main(String[] args) {
        Gudang<String> gudang = new Gudang<>();

        gudang.addItem(
            new Item<String>("A001", "Buku", 20)
        );
        gudang.addItem(
            new Item<String>("A002", "Laptop", 70)   
        );

        gudang.printItem();

        gudang.addStock("A001", 50);

        gudang.printItem();

    }

}
