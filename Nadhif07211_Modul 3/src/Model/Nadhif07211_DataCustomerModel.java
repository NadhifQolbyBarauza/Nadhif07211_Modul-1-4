package Model;

import Entity.Nadhif07211_DataCustomerEntity;
import Entity.Nadhif07211_ServiceEntity;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Nadhif07211_DataCustomerModel implements Nadhif07211_ModelInterfaces {
    private static Scanner input = new Scanner (System.in);
    private ArrayList<Nadhif07211_DataCustomerEntity> datacustomerArrayList;
    
    public Nadhif07211_DataCustomerModel(){
    datacustomerArrayList = new ArrayList<Nadhif07211_DataCustomerEntity>();
        }
    public void insertDataDataCustomer(Nadhif07211_DataCustomerEntity datacustomer){
        datacustomerArrayList.add(datacustomer);
    }
    public ArrayList<Nadhif07211_DataCustomerEntity> getdatacustomerArrayList(){
        return datacustomerArrayList;
    }

    @Override
 public void login(){
        for(Nadhif07211_DataCustomerEntity datacustomer : datacustomerArrayList){
        System.out.println(" NOPLAT : "+datacustomer.getCustomer().getnoplat()+"\n NAMA CUSTOMER : "
         +datacustomer.getCustomer().getnamacustomer()+"\n ALAMAT : "+datacustomer.getCustomer().getalamat()+
            "\n SERVICE : "+Nadhif07211_ServiceEntity.Service[datacustomer.getIndexService()]);
        }   
    }
  public int cekData(String noplat, String namacustomer){
        int loop = 0;
        if(datacustomerArrayList.size() ==0){
            loop = -1;
        }else{
            for(int i = 0; i <datacustomerArrayList.size(); i++){
            if(datacustomerArrayList.get(i).getCustomer().getnoplat().equals(noplat)){
                loop = i;
                break;
            }else{
                loop = -2;
                }
            }
        }   return loop;
    }
  
    public Nadhif07211_DataCustomerEntity showDataCustomer(int index){
        return datacustomerArrayList.get(index);
    }

    private int carinoplat(String noplat){
        int index=-1;
        for(int i=0;i <datacustomerArrayList.size();i++) {
           if(noplat.equals(datacustomerArrayList.get(i).getCustomer().getnoplat()))
               index=i;
       }
       return index;
    }
    
        public void update(String noplat){
        if(carinoplat(noplat)!=-1){
             for(int i=0;i<Nadhif07211_ServiceEntity.Service.length;i++){
                        System.out.println(i+". "+Nadhif07211_ServiceEntity.Service[i]);
                    }
            System.out.print(" UPDATE SERVICE : ");
            int servicebaru=input.nextInt();
            datacustomerArrayList.get(carinoplat(noplat)).setIndexService(servicebaru);
        }
        else {
            System.out.println(" DATA TIDAK DITEMUKAN");
        }
    } 
}