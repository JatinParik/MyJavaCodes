import java.util.*;

public class InvertedAndRotatedHalfPyramid {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter number of Rows :");
     int m = sc.nextInt();
    
    
     for(int i =m ; i>=1 ; i--) {
        for(int j =1 ; j<=m-i ; j++) {
            System.out.print(" ");
         }
       for(int j=1 ; j<=i ; j++) {
          System.out.print("*");
       } System.out.println();
     }
    }
}
