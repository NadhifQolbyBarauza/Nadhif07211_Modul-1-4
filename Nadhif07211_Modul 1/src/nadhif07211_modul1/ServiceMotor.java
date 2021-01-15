package nadhif07211_modul1;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceMotor {
    static Scanner input = new Scanner (System.in);
    static ArrayList <Nadhif07211_DataCustomerEntity> DataCustomer = new ArrayList ();
    static ArrayList <Nadhif07211_MacamServiceEntity> PilihanService = new ArrayList ();

    public static void main(String[] args) {
        System.out.println("Bengkel Mas Nadhif Ganteng\n");
        int pil;
        
        do{
            System.out.println("1. Memasukkan Data Customer");
            System.out.println("2. Tampil Data Customer Bengkel");
            System.out.println("3. Update Data Customer Bengkel");
            System.out.println("4. Delete Data Customer Bengkel");
            System.out.println("5. Exit");
            System.out.println("\nMasukkan Pilihan = ");
            pil = input.nextInt();
            switch (pil){
                case 1:
                    daftar();
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
            }
        }while(pil!=5);
    }
    
    static void daftar (){
        System.out.print("Nama Customer = ");
        String Nadhif07211_Nama = input.next();
        System.out.print("No Plat Customer = ");
        String Nadhif07211_NoPlat = input.next();
        System.out.print("Alamat Customer = ");
        String Nadhif07211_Alamat = input.next();
        System.out.println();
            for (int Nadhif07211_i=0;Nadhif07211_i<Nadhif07211_MacamServiceEntity.MacamService.length;Nadhif07211_i++){
                System.out.println(Nadhif07211_i+"."+Nadhif07211_MacamServiceEntity.MacamService[Nadhif07211_i]);
            }
            System.out.println("Pilih Macam Service = ");
            int Nadhif07211_pilih = input.nextInt();
            DataCustomer.add(new Nadhif07211_DataCustomerEntity(Nadhif07211_Nama, Nadhif07211_NoPlat, Nadhif07211_Alamat, 
                    Nadhif07211_pilih));
    }
    
    static void view (){
        System.out.println(DataCustomer.size());
        for(int Nadhif07211_i=0;Nadhif07211_i<DataCustomer.size();Nadhif07211_i++){
            System.out.println("Nama = "+DataCustomer.get(Nadhif07211_i).Nadhif07211_Nama);
            System.out.println("No Plat = "+DataCustomer.get(Nadhif07211_i).Nadhif07211_NoPlat);
            System.out.println("Alamat = "+DataCustomer.get(Nadhif07211_i).Nadhif07211_Alamat);
            System.out.println("Menu Pilihan ="+Nadhif07211_MacamServiceEntity.MacamService[DataCustomer.get(Nadhif07211_i).Nadhif07211_pilih]);
            System.out.println();
        }
 }
    static void update (){
        System.out.println("Update data index ke = ");
        int Nadhif07211_index = input.nextInt();
        System.out.print("Masukkan Nama Customer = ");
        String Nadhif07211_Nama = input.next();
        System.out.print("Masukkan No Plat = ");
        String Nadhif07211_NoPlat = input.next();
        System.out.print("Masukkan Alamat = ");
        String Nadhif07211_Alamat = input.next();
            for (int Nadhif07211_i=0;Nadhif07211_i<Nadhif07211_MacamServiceEntity.MacamService.length;Nadhif07211_i++){
                System.out.println(Nadhif07211_i+"."+Nadhif07211_MacamServiceEntity.MacamService[Nadhif07211_i]);
            }
            System.out.print("Pilih Service c= ");
            int Nadhif07211_pilih = input.nextInt();
            DataCustomer.set(Nadhif07211_index, new Nadhif07211_DataCustomerEntity(Nadhif07211_Nama,Nadhif07211_NoPlat,Nadhif07211_Alamat,Nadhif07211_pilih));
    }
    
    static void delete (){
        System.out.print("Hapus index ke ");
        int Nadhif07211_index = input.nextInt();
        DataCustomer.remove(Nadhif07211_index);
    }
}
