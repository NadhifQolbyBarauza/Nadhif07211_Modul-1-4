package nadhif07211_modul2;

import Entity.*;
import Model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Nadhif07211_Modul2 {
    
private static Nadhif07211_AdminModel
        adminModel = new Nadhif07211_AdminModel();
        static public ArrayList<Nadhif07211_CustomerServiceEntity> datacustomer1 = new ArrayList();
        static int cekAdmin;
        static Scanner input = new Scanner(System.in);
        public static void main(String[] args) {
            System.out.println("Bengkel Mas Nadhif");
            System.out.println("------------------");
            int pil;
                do{
                    System.out.println("1. ADMIN");
                    System.out.println("2. EXIT");
                    System.out.print("PILIH = ");
                    pil = input.nextInt();
                    System.out.println("------------------");
                switch(pil){
                        case 1:
                        if(pil == 1){
                        dataAdmin();
                        AdminLogin();
                }
            }
        }while(pil!=2);
}
        
    static void dataAdmin(){
            String nama[] = {"mangujang","ipulpool"};
            String id[] = {"354354","789789"};
                for(int i=0;i<nama.length;i++){
                adminModel.insertAdmin(new Nadhif07211_AdminEntity(nama[i],id[i]));
    }
}
    
    static void AdminLogin(){
        int pil;
        System.out.print("Masukkan Nama Admin : ");
        String nama = input.next();
        System.out.print("ID Admin : ");
        String id = input.next();
        cekAdmin = adminModel.cekData(nama,id);
        do{
            System.out.println("1. INPUT DATA CUSTOMER");
            System.out.println("2. VIEW DATA CUSTOMER");
            System.out.println("3. HAPUS DATACUSTOMER");
            System.out.println("4. UPDATE DATACUSTOMER");
            System.out.println("5. EXIT");
            System.out.print("PILIH = ");
                pil = input.nextInt();
            System.out.println("------------------");
                switch(pil){
                    case 1 : Data();
                            break;
                    case 2 : view();
                            break;
                    case 3 :
            System.out.print("INPUT NAMA CUSTOMER = ");
                    String datacustomer = input.next();
                            hapus(datacustomer);
                            break;
                    case 4 :
            System.out.print("INPUT NAMA CUSTOMER = ");
String namacustomer =
input.next(); //tak tambahi sendiri stringnya
for(int
i=0;i<datacustomer1.size();i++)
{
if(namacustomer.equals(datacustomer1.get(i).getNamacustomer()))
{
System.out.print("INPUT NO PLAT BARU : ");
String newnoplat
= input.next();
System.out.print("INPUT ALAMAT BARU : ");
String newalamat
= input.next();
System.out.print("INPUT SERVICE BARU : ");
String newservice
= input.next();
System.out.println("------------------");
update(namacustomer,newnoplat,newalamat,newservice);
}
else
{

System.out.println("Data tidak ada");
System.out.println("------------------");
}
}
break;
}
}
while(pil!=5);
}
static void Data(){
System.out.print("INPUT NAMA CUSTOMER: ");
String namacustomer = input.next();
System.out.print("INPUT NO PLAT : ");
String noplat = input.next();
System.out.print("INPUT ALAMAT : ");
String alamat = input.next();
System.out.print("INPUT SERVICE : ");
String service = input.next();
System.out.print("");
datacustomer1.add(new
Nadhif07211_CustomerServiceEntity(namacustomer,noplat,alamat,service));
}
static void view(){
System.out.println("--ALL DATA--");
System.out.println("------------------");
for(int
i=0;i<datacustomer1.size();i++){
System.out.println("NAMA CUSTOMER : "+datacustomer1.get(i).getNamacustomer());
System.out.println("NO PLAT : "+datacustomer1.get(i).getNoplat());
System.out.println("ALAMAT : "+datacustomer1.get(i).getAlamat());
System.out.println("SERVICE : "+datacustomer1.get(i).getService());
"+ "System.out.println(\"-------------\n" +"-----\");\n" +
"}\n" +
"}\n" +
"static void hapus(String namacustomer){\n" +
"for(int\n" +
"i=0;i<datacustomer1.size();i++){\n" +
"if(namacustomer.equals(datacustomer1.get(i).g\n" +
"etNamacustomer())){\n" +
"datacustomer1.remove(i);\n" +
"System.out.println(\"Data\n" +
"Customer Telah Di Hapus\");\n" +
"System.out.println(\"---------\n" +
"---------\");\n" +
"}\n" +
"else{\n" +
"System.out.println(\"Data\n" +
"Tidak Ada\");\n" +
"System.out.println(\"---------\n" +
"---------\");\n" +
"}\n" +
"}\n" +
"}\n" +
"static void update(String\n" +
"namacustomer,String newnoplat,String\n" +
"newalamat,String newservice){\n" +
"for(int\n" +
"i=0;i<datacustomer1.size();i++){\n" +
"if(namacustomer.equals(datacustomer1.get(i).g\n" +
"etNamacustomer())){\n" +
"datacustomer1.get(i).noplat =\n" +
"newnoplat;\n" +
"datacustomer1.get(i).alamat =\n" +
"newalamat;\n" +
"datacustomer1.get(i).service\n" +
"= newservice;\n" +
"System.out.println(\"Data\n" +
"Sudah Update\");\n" +
"System.out.println(\"---------\n" +"---------\");\n" +
"}\n" +
"}\n" +
"}\n" +
"}





}





























/*package nadhif07211_modul2;

//import Controller.AdminController;
//import Controller.AllObjectModel;
import Entity.*;
import Model.*;
import java.util.ArrayList;
import java.util.Scanner;

    public class Nadhif07211_Modul2 {
        private static Nadhif07211_AdminModel adminModel = new Nadhif07211_AdminModel();
//        public static AdminController admin = new AdminController();
        static int cekAdmin; //kayaknya ini ngga butuh deh
        public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Welcome To Bengkel Mas Nadhif");
        int pil;
        do{
            System.out.println("1. ADMIN");
            System.out.println("2. EXIT");
            System.out.print("PILIH = ");
            pil = input.nextInt();
            switch(pil){
                case 1:
                    if(pil == 1){
                        admin.dataAdmin();
                        AdminLogin();
                    }
            }
        }while(pil!=2);
    }
       
    // --- udah pindah ke admin controller ---
        static void dataAdmin(){
        String nama[] = {"mangujang","ipulpool"};
        String id[] = {"354354","789789"};
        for(int i=0;i<nama.length;i++){
            adminModel.insertAdmin(new Nadhif07211_AdminEntity(nama[i],id[i]));
        }
    }
    
    static void AdminLogin(){
        int pil;
        System.out.print("Masukkan Nama Admin : ");
        String nama = input.next();
        System.out.print("ID Admin : ");
        String id = input.next();
        cekAdmin = adminModel.cekData(nama,id);
        do{
            System.out.println("1. INPUT DATA CUSTOMER");
            System.out.println("2. VIEW DATA CUSTOMER");
            System.out.println("3. HAPUS DATA CUSTOMER");
            System.out.println("4. UPDATE DATA CUSTOMER");
            System.out.println("5. EXIT");
            System.out.print("PILIH = ");
            pil = input.nextInt();
            switch(pil){
                case 1 : Data();
                    break;
                case 2 : view();
                    break;
                case 3 : System.out.print("INPUT NAMA CUSTOMER = ");
                         String datacustomer = input.next();
                         hapus(datacustomer);
                    break;
                case 4 :
                    System.out.print("INPUT NAMA CUSTOMER = ");
                    String namacustomer = input.next(); //tak tambahi sendiri string nya
                    for(int i=0;i<datacustomer1.size();i++)
                    {
                        if(namacustomer.equals(datacustomer1.get(i).getNamacustomer()))
                        {
                            System.out.print("INPUT NO PLAT BARU : ");
                            String newnoplat = input.next();
                            System.out.print("INPUT ALAMAT BARU : ");
                            String newalamat = input.next();
                            System.out.print("INPUT SERVICE BARU : ");
                            String newservice = input.next();
                            update(namacustomer,newnoplat,newalamat,newservice);
                        }
                        else
                        {
                            System.out.println("Data tidak ada");
                            System.out.println("------------------");
                        }
                    }
                break;
            }
        }
        while(pil!=5);
    }
    
    static void Data(){
        System.out.print("INPUT NAMA CUSTOMER : ");
        String namacustomer = input.next();
        System.out.print("INPUT NO PLAT : ");
        String noplat = input.next();
        System.out.print("INPUT ALAMAT : ");
        String alamat = input.next();
        System.out.print("INPUT SERVICE : ");
        String service = input.next();
        datacustomer1.add(new Nadhif07211_CustomerServiceEntity(namacustomer,noplat,alamat,service));
    }
    
    static void view(){
        System.out.println("--ALL DATA--");
        for(int i=0;i<datacustomer1.size();i++){
            System.out.println("NAMA CUSTOMER : "+datacustomer1.get(i).getNamacustomer());
            System.out.println("NO PLAT : "+datacustomer1.get(i).getNoplat());
            System.out.println("ALAMAT : "+datacustomer1.get(i).getAlamat());
            System.out.println("SERVICE : "+datacustomer1.get(i).getService());
            System.out.println("------------------");
        }
    }
    
    static void hapus(String namacustomer){
        for(int i=0;i<datacustomer1.size();i++){
            if(namacustomer.equals(datacustomer1.get(i).getNamacustomer())){
                datacustomer1.remove(i);
                System.out.println("Data Customer Telah Di Hapus");

            }
            else{
                System.out.println("Data Tidak Ada");
            }
        }
    }
    
    static void update(String namacustomer,String newnoplat,String newalamat,String newservice){
        for(int i=0;i<datacustomer1.size();i++){
            if(namacustomer.equals(datacustomer1.get(i).getNamacustomer())){
                datacustomer1.get(i).noplat = newnoplat;
                datacustomer1.get(i).alamat = newalamat;
                datacustomer1.get(i).service = newservice;
                System.out.println("Data Sudah Update");
                
            }
        }
    }
}
*/