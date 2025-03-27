import java.util.HashMap;
import java.util.Map;
public class Gudang <T> {
    Map <T, Item<T>> barang;

    public Gudang(){
        barang = new HashMap<>();

    }

    public void addItem(Item<T> item){
        barang.put(item.getCode(), item);
        System.out.println(item.getName() + " berhasil ditambahkan");
    }

    public void removeItem(T code){
        if(barang.containsKey(code)){
            barang.remove(code);
            System.out.println(barang.get(code).getName() + "Berhasil dihapus!!");
        }
        else{
            System.out.println("Data tidak ditemukan");
        }
    }

    public void addStock(T code, int number){
        if(barang.containsKey(code)){
            barang.get(code).addStock(number);
            System.out.println("Stok" + barang.get(code).getName() + "berhasil ditambahkan!");
        }
        else{
            System.out.println("Data tidak ditemukan");
        }
    }

    public void removeStock(T code, int number){
        if(barang.containsKey(code)){
            barang.remove(code).removeStock(number);;;
        }
        else{
            System.out.println("Data tidak ditemukan");
        }
    }

    public void printItem(){
        for(Item<T> item:barang.values()){
            System.out.println(item.infoItem());
        }
    }

        


}


