package Entity;

public abstract class Nadhif07211_AbstractEntity {
    public String nama,id;
    
    public Nadhif07211_AbstractEntity(String nama, String id){
        this.nama = nama;
        this.id = id;
    }
    
    public Nadhif07211_AbstractEntity(){
    }
    public abstract String getNama();
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getId(){
        return id;
    }
    public void setId(String Id){
        this.id = id;
    }
}