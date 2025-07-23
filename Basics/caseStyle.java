    import java.util.*;
    public class caseStyle {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the character: ");
            char ch = sc.next().trim().charAt(0);

            if(ch>='0'&& ch<='9'){
                System.out.println("Digit");
            }
            if(ch >='a' && ch <='z'){
                System.out.println("LowerCase");
            }
            else{
                System.out.println("UperCase");
            }

        }
    }
