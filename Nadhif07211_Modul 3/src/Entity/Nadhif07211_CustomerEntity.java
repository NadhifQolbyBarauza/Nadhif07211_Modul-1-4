package Entity;

import java.util.Date;

public class Nadhif07211_CustomerEntity {
   protected String noplat,namacustomer,alamat;
   
   public Nadhif07211_CustomerEntity(String noplat, String namacustomer,String alamat){
        this.noplat = noplat;
        this.namacustomer = namacustomer;
        this.alamat = alamat;
    }   
    public String getnoplat(){
        return noplat;
    }   
    public void setnopalt(String noplat) {
        this.noplat = noplat;
    }
    public String getnamacustomer() {
        return namacustomer;
    }
    public void setnamacustomer(String namacustomer) {
        this.namacustomer = namacustomer;
    }
    public String getalamat() {
        return alamat;
    }
    public void setalamat(String alamat) {
        this.alamat = alamat;
    }   
}