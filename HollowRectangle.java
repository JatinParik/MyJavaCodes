import java.util.*;

public class HollowRectangle {
    public static void main(String args []) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter number of Columns :");
     int m = sc.nextInt();
     System.out.println("Enter number of Rows :");
     int n = sc.nextInt();
     for(int i = 1 ; i<=n ; i++) {
        for(int j =1 ; j<=m ; j++) {
            if (i==1 || j==1 || i==n || j==m) {
                System.out.print("*");
            } else {
                  System.out.print(" ");
              }
        } System.out.println("");
     }

    }
}
