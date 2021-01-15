package Main;

import Entity.Nadhif07211_ServiceEntity;
import Controller.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Nadhif07211_Main {
    private static Nadhif07211_CustomerController customer = new 
        Nadhif07211_CustomerController();
    private static Scanner input = new Scanner (System.in);
   
     public static void main(String[] args){
        int loop=0;
        do{
           int pilih = 0 ;
           System.out.print("\n BENGKEL MAS NADHIF" +
                            "\n 1. DAFTAR CUSTOMER" +
                            "\n 2. LOGIN CUSTOMER" +
                            "\n 3. UPDATE DATA CUSTOMER "+
                            "\n 4. READ DATA CUSTOMER "+
                            "\n 5. HAPUS DATA CUSTOMER "+
                            "\n 0. EXIT" +
                            "\n MASUKKAN PILIHAN ANDA : ");
                        pilih = input.nextInt();
                                if(pilih == 1)
                                {
                                    daftar();
                                }
                                else if(pilih == 2)
                                {
                                    logindata();
                                }
                                else if(pilih == 3)
                                {
                                    updateservice();
                                }else if(pilih == 4)
                                {
                                    read();
                                }else if(pilih == 5)
                                {
                                    delete();
                              loop--;
                              }else{
                                break;
            }
        }while (loop != 1);
     }
        
    static void daftar(){
        try{
        System.out.print(" MASUKKAN NO PLAT : ");
        String noplat = input.next();
        System.out.print(" MASUKKAN NAMA CUSTOMER : ");
        String namacustomer = input.next();
        System.out.print(" MASUKKAN ALAMAT : ");
        String alamat = input.next();
        customer.insert(noplat,namacustomer,alamat);
        System.out.println(" DAFTAR BERHASIL !!");
        }catch (Exception exception){
          System.out.println(" FORMAT PENGISIAN DATA SALAH !!");
        }
    }

    static void logindata(){
        System.out.print(" NOPLAT : ");
        String noplat = input.next();
        System.out.print(" NAMA CUSTOMER : ");
        String namacustomer = input.next();
        customer.login(noplat, namacustomer);
        int cek = customer.cekDataCustomer(customer.customer().getnoplat());
        if (cek == -1){
            System.out.println(" SERVICE BELOM DI DAFTARKAN CUY !! ");
                daftarservice();
    }
}
    
    static void daftarservice(){
        System.out.print(" PILIH SERVICE : \n");
        for(int i=0;i<Nadhif07211_ServiceEntity.Service.length;i++){
        System.out.println(i+"."+Nadhif07211_ServiceEntity.Service[i]);
        }
        System.out.print(" PILIH SERVICE : ");
           int  pilservice = input.nextInt();
            customer.daftarservice(pilservice,customer.getData());
        }
   
    static void updateservice(){
        System.out.print(" MASUKKAN NO PLAT : ");
        String noplat = input.next();
        customer.update(noplat);
    }
    
   
    static void delete(){
        customer.delete(customer.customer().getnoplat());
        }
       
    
    static void read(){
        int cek = customer.cekDataCustomer(customer.customer().getnoplat());

            System.out.println(" NO PLAT :"+customer.showDataCustomer(cek).
                    getCustomer().getnoplat());
            System.out.println(" NAMA CUSTOMER :"+customer.
                    showDataCustomer(cek).getCustomer().getnamacustomer());
            System.out.println(" ALAMAT : "+customer.showDataCustomer(cek).
                    getCustomer().getalamat());
            System.out.println(" SERVICE TERSEDIA : "+
                    Nadhif07211_ServiceEntity.Service[customer.
                            showDataCustomer(cek).getIndexService()]);
    }
}