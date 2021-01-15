package Model;

import Entity.Nadhif07211_CustomerServiceEntity;
import java.util.ArrayList;

public class CustomerModel {
    private ArrayList <Nadhif07211_CustomerServiceEntity> customerServiceEntityArrayList;
    
    public CustomerModel(){
        customerServiceEntityArrayList = new ArrayList<Nadhif07211_CustomerServiceEntityArrayList>();
    }
    
    public void insertCustomer(Nadhif07211_CustomerServiceEntity customerservice){
        customerServiceEntityArrayList.add(customerservice);
    }
    
    public Nadhif07211_CustomerServiceEntityArrayList getCustomerServiceArrayList(int index){
        return customerServiceEntityArrayList.get(index);
    }
    
    public void delete(int index){
        customerServiceEntityArrayList.remove(index);
    }
    
}
