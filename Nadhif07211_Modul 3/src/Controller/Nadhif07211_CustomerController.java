package Controller;

import Entity.Nadhif07211_DataCustomerEntity;
import Entity.Nadhif07211_CustomerEntity;

public class Nadhif07211_CustomerController implements 
        Nadhif07211_ControllerInterfaces {
    int indexLogin=0;
    
        
    public Nadhif07211_CustomerEntity getData(){
        return Nadhif07211_AllObjectModel.customerModel.
                getcustomerEntityArrayList(indexLogin);
        }

        public void daftarservice (int indexService, Nadhif07211_CustomerEntity 
                customer){
       Nadhif07211_AllObjectModel.datacustomerModel.insertDataDataCustomer(new 
        Nadhif07211_DataCustomerEntity(indexService,customer));
        }

    @Override
    public void login (String noplat , String namacustomer){
        indexLogin = Nadhif07211_AllObjectModel.customerModel.cekData(noplat, 
                namacustomer);
    }
      
    public void insert (String noplat, String namacustomer,String alamat){
       Nadhif07211_AllObjectModel.customerModel.insert(new 
        Nadhif07211_CustomerEntity(noplat,namacustomer,alamat));
    }
    
     public Nadhif07211_CustomerEntity customer(){
        return Nadhif07211_AllObjectModel.customerModel.
                getcustomerEntityArrayList(indexLogin);
    }
    
    public int cekDataCustomer(String noplat){
        int cek = Nadhif07211_AllObjectModel.datacustomerModel.
                cekData(noplat, null);
        return cek;
    }

    public Nadhif07211_DataCustomerEntity showDataCustomer (int index){
        return Nadhif07211_AllObjectModel.datacustomerModel.
                showDataCustomer(index);
    }

    public void update(String noplat) {
        Nadhif07211_AllObjectModel.datacustomerModel.update(noplat);
    }
    
    public void delete(String noplat){
        Nadhif07211_AllObjectModel.customerModel.delete(noplat);
    }
}