public class strings {
    public static void main(String args[])
    {
        String first = "Shubham";
        String last = "Desai";
        String Fullname = first+" "+last;
        System.out.println(Fullname);

        if(first.equals(last))
        {
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }

        System.out.println(first.substring(0,4));

        StringBuilder sb = new StringBuilder("Shubham");
        sb.append("Desai");
        System.err.println(sb);
        sb.insert(0,'s');
        System.out.println(sb);
        sb.delete(0,1);
        System.out.println(sb);
        System.out.println(sb.length());


    }
    
}
