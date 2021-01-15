package Entity;

public class Nadhif07211_CustomerServiceEntity {
    public String namacustomer,noplat,alamat,service;

    
    public Nadhif07211_CustomerServiceEntity(String namacustomer,String noplat,String alamat,String service){
        this.namacustomer = namacustomer;
        this.noplat = noplat;
        this.alamat = alamat;
        this.service = service;
    }
    
    public String getNamacustomer(){
        return namacustomer;
    }
    
    public String getNoplat(){
        return noplat;
    }
    
    public String getAlamat (){
        return alamat;
    }
    
    public String getService(){
        return service;
    }
}