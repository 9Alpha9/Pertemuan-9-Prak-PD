package tugas;
public class Honda extends motor{
    private int harga, jumlah_beli;

    public Honda(int harga, int jumlah_beli, String nama, String jenis) {
        super(nama, jenis);
        this.harga = 21000000;
        this.jumlah_beli = jumlah_beli;
    }

    public int getHarga() {
        return harga;
    }

    public int getJumlah_beli() {
        return jumlah_beli;
    }
    public int totalHonda(){
        return this.harga * jumlah_beli;
    }
    
    
}
