//pemanggilan Constructor (MAIN)
package constructor;
import java.io.*;
public class Constructor {
    public static void main(String[] args)throws IOException {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        persegi p = new persegi(0);
        System.out.println("Masukkan Sisi    = ");
        int sisi = Integer.parseInt(br.readLine());
        
        p = new persegi(sisi);
        System.out.println("Luas Persegi    = "+p.LuasPersegi());
    }
   }