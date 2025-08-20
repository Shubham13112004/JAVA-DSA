public class fibbonacci {

    static int fab(int n){
        if(n<2){
            return n;
        }
        return fab(n-1)+fab(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fab(5));
    }
}
