package constructor;
public class persegi {
    private int sisi;
    
    //constructor
    public persegi(){
       this.sisi = 5;
    }
    public persegi(int s){
       sisi = 5; 
    }
    //Penggunaan Getter, sama dengan penggunaan function
    public int getSisi() {
        return sisi;
    }
    //Method
    public int LuasPersegi(){
        return sisi*sisi;
    }
    
}