package Model;

import Entity.Nadhif07211_AdminEntity;
import Entity.Nadhif07211_CustomerServiceEntity;
import java.util.ArrayList;

    public class Nadhif07211_AdminModel implements Nadhif07211_ModelInterfaces{
        private ArrayList<Nadhif07211_AdminEntity> adminEntityArrayList;
        
        // array list atas ini pindahan dari  main
//       public Nadhif07211_CustomerServiceEntity (){
//            datacustomer1 = new ArrayList<Nadhif07211_CustomerServiceEntity>();
//        }
        
        public Nadhif07211_AdminModel(){
            adminEntityArrayList = new ArrayList<Nadhif07211_AdminEntity>();
            
        }
        
        public void insertAdmin(Nadhif07211_AdminEntity admin){
            adminEntityArrayList.add(admin);
        }
        
//        @Override
    
//        public void view()
//       {
//           for (Nadhif07211_AdminEntity admin : adminEntityArrayList)
//           {
//               System.out.print(admin.getNama());
//               System.out.print(admin.getId());
//               System.out.println();
//           }
//       }
        public int cekData(String nama, String id){
            int loop = 0;
            for(Nadhif07211_AdminEntity admin : adminEntityArrayList){
                if(admin.getNama().equals(nama) && admin.getId().equals(id)){
                    break;
                }else{
                    loop++;
                }
            }
            return loop;
        }
        
        public Nadhif07211_AdminEntity getAdminEntityArrayList(int index){
            return adminEntityArrayList.get(index);
        }

}