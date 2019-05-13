package constructor.newpackage;
import java.io.*;
public class inheritance {
    public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        
    
    dosen d = new dosen(0, "", "");
        System.out.print("Input NIK             = " );
        String nik = br.readLine();
        System.out.print("Input NAMA            = " );
        String nama = br.readLine();
        System.out.print("Input Jumlah Hadir    = " );
        int jumlah_hadir = Integer.parseInt(br.readLine());
        
       d = new dosen(jumlah_hadir, nik, nama);
       
        System.out.print("Gaji Dosen    = "+d.gaji_dosen());
    }
    
}
