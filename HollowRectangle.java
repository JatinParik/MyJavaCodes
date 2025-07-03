import java.util.*;

public class HollowRectangle {
    public static void main(String args []) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter number of Columns :");
     int m = sc.nextInt();
     System.out.println("Enter number of Rows :");
     int n = sc.nextInt();
    for(int i = 1 ; i<=m ; i++) {
        System.out.print("*");
    }
    System.out.println("");
    for(int j = 1 ; j<=n-2 ; j++) {
        System.out.print("*");
        for(int i = 1 ; i<=m-2 ; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println("");
    }
    for(int i = 1 ; i<=m ; i++) {
        System.out.print("*");
    }

    }
}
