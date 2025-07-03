import java.util.*;

public class SolidRectanglePattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Columns of rectangle :");
        int m = sc.nextInt();
        System.out.println("Enter number of Rows of rectangle :");  
        int n = sc.nextInt();
        for( int i = 1 ; i<=n ; i++) {
            for(int j = 1 ; j<=m ; j++) {
            System.out.print("*");
          } System.out.print("\n");
        }   
      }   
}
