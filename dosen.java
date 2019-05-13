package constructor.newpackage;
public class dosen extends pegawai{
    private int jumlah_hadir;

    public dosen(int jumlah_hadir, String nik, String nama) {
        super(nik, nama);
        this.jumlah_hadir = jumlah_hadir;
    }

    public int getJumlah_hadir() {
        return jumlah_hadir;
    }

    public int gaji_dosen(){
        return getJumlah_hadir()*gaji();
    }
    
}

