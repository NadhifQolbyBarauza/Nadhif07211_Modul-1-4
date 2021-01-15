package Model;

import Entity.Nadhif07211_CustomerEntity;
import java.util.ArrayList;

public class Nadhif07211_CustomerModel implements Nadhif07211_ModelInterfaces {
    private ArrayList<Nadhif07211_CustomerEntity> customerEntityArrayList;
    
    public Nadhif07211_CustomerModel(){
        customerEntityArrayList = new ArrayList<Nadhif07211_CustomerEntity>();
    }
    public void insert(Nadhif07211_CustomerEntity customer){
    customerEntityArrayList.add(customer);
}

    public int read(String noplat){
        int loop = 0;
        while(!customerEntityArrayList.get(loop).getnoplat().equals(noplat)){
            loop++;
        }
        return loop;
    }

    @Override
 public void login(){
        for(Nadhif07211_CustomerEntity customerEntity : 
                customerEntityArrayList){
            System.out.println(" NO PLAT : "+customerEntity.
                    getnoplat()+"\n NAMA CUSTOMER : "
            +customerEntity.getnamacustomer()+"\n ALAMAT : "+
                    customerEntity.getalamat());
        }
    }
 
 public int cekData(String noplat, String namacustomer){
        int loop = 0;
        while (!customerEntityArrayList.get(loop).getnoplat().equals(noplat) && 
                !customerEntityArrayList.get(loop).getnamacustomer().
                        equals(namacustomer)){
            loop++;
        }
        return loop;
    }
 
    public Nadhif07211_CustomerEntity getcustomerEntityArrayList(int index){
        return customerEntityArrayList.get(index);
    }
      
    public void delete(String noplat)
    {
        for(int i=0;i<customerEntityArrayList.size();i++)
        {
            if(noplat.equals(customerEntityArrayList.get(i).getnoplat()))
            {
                customerEntityArrayList.remove(i);
                System.out.println("DATA CUSTOMER DELETE");
            }
            else
            {
                System.out.println("DATA CUSTOMER NOT AVAILABLE");
            }
        }
    }
}