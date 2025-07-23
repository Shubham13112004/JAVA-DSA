import java.util.*;

public class Array_List {

    public static void main(String[] args) {

         ArrayList<Integer> list = new ArrayList<Integer>();
        
         //add element
         list.add(3);
         list.add(7);
         list.add(2);
         list.add(1);

         System.out.println(list);

         //get element
         int element = list.get(0);
         
         System.out.println(element);

         //add in beetween

         list.add(1,9);
         System.out.println(list);

         //set element

         list.set(1,8);
         System.out.println(list);

         //remove element
        list.remove(2);
        System.out.println(list);

        //size
        int s=list.size();
        System.out.println(s);

        //loop
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }

        System.out.println( );
        //sorting
        Collections.sort(list);
        System.out.println(list);




         //clear list
         list.clear();
         System.out.println(list);


    }
     
   
    
}
