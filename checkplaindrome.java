import java.util.Scanner;

public class checkplaindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String a=sc.nextLine();
        boolean isplain=true;
        int start=0,end=0;
        end=a.length()-1;
        while(start<end) {
            if (a.charAt(start) != a.charAt(end)) {
                isplain =false;
                break;
            }
            start++;
            end--;
        }
            if(isplain==true) {
                System.out.println("plaindroem");

            }
            else {
                System.out.println("notplaindrome");
            }

    }
}
