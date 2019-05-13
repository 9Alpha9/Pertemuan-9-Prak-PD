package tugas;
public class Yamaha extends motor {
    private int harga, jm;

    public Yamaha(int harga, int jm, String nama, String jenis) {
        super(nama, jenis);
        this.harga = 18000000;
        this.jm = jm;
    }

    public int getHarga() {
        return harga;
    }

    public int getJumlah_beli() {
        return jm;
    }

   public int totalYamaha(){
       return this.harga * jm;
   }
}
