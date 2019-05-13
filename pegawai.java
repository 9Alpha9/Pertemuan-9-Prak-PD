package constructor.newpackage;
public class pegawai {
    public String nik, nama;
    
    //Constructor
    public pegawai(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }
    //Getter
    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }
    
    //Mehitung Gaji
    //Method
    public int gaji(){
        return 200000;
    }
    
}
