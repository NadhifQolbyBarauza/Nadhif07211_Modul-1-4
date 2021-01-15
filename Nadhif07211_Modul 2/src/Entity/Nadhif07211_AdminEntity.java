package Entity;

public class Nadhif07211_AdminEntity extends Nadhif07211_AbstractEntity {
    
    public Nadhif07211_AdminEntity(String nama,String id) {
        super (nama,id);
    }
    @Override
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
}