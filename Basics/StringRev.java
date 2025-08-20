public class StringRev {

    public static void main(String[] args) {

        /*
            String str = "Hello";

          char [] arr = str.toCharArray();

          
          for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr.toString());
          }
        
        */
        String str = "Hello";

        StringBuilder sb = new StringBuilder(str);
            sb.append('a');
            sb.reverse();
            System.out.println(sb);

    }
    
  

}
