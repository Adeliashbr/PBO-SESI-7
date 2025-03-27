public class Item <T>{
    T code;
    String name;
    int stock;

    public Item(T code, String name, int stock){
        this.code = code;
        this.name = name;
        this.stock = stock;
    }

    public T getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void addStock(int number){
        this.stock = getStock() + number;
        System.out.println("Stok" + getName() + " berhasil ditambahkan");
        System.out.println("Jumlah stok :" + getStock());
    }

    public void removeStock(int number){
        if(number <= this.stock){
            this.stock = getStock() - number;
            System.out.println("Stok" + getName() + "berhasil dikurangi!!");
        }
        else{
            System.out.println("Stok tidak mencukupi");
        }
    }

    public String infoItem(){
        return "kode:" + getCode() + "|Nama:" + getName() + "Stok:" + getStock(); 

    }

}
