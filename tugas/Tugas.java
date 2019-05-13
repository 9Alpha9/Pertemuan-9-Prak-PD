package tugas;
import java.io.*;
public class Tugas {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        
        Honda H = new Honda(0,0,"","");
        System.out.println("--- HONDA ---");
        System.out.print("Nama              = ");
        String nama = br.readLine();
        System.out.print("Jenis Motor       = ");
        String jenis = br.readLine();
        System.out.print("Jumlah Beli       = ");
        int jumlah_beli = Integer.parseInt(br.readLine());
        
        H = new Honda(0, jumlah_beli, nama, jenis);
        System.out.print("Total Pembelian   = "+H.totalHonda());
        
        System.out.println("");
        System.out.println("-----------");
        
        Yamaha Y = new Yamaha(0,0,"","");
        System.out.println("--- Yamaha ---");
        System.out.print("Nama              = ");
        String nm = br.readLine();
        System.out.print("Jenis Motor       = ");
        String js = br.readLine();
        System.out.print("Jumlah Beli       = ");
        int jm = Integer.parseInt(br.readLine());
        
        Y = new Yamaha(0, jm, nama, jenis);
        System.out.print("Total Pembelian   = "+Y.totalYamaha());
        
        
        
//        d = new dosen(jumlah_hadir, nik, nama);
        
//        persegi p = new persegi(0);
//        System.out.println("Masukkan Sisi    = ");
//        int sisi = Integer.parseInt(br.readLine());
//        
//        p = new persegi(sisi);
//        System.out.println("Luas Persegi    = "+p.LuasPersegi());
    }
    
}
