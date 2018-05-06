
package Laba2;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) { 
        int m,n;
        System.out.print("Введите m: ");
        Scanner sc1 = new Scanner(System.in);
        m = sc1.nextInt();
        System.out.print("Введите n: ");
        Scanner sc2 = new Scanner(System.in);
        n = sc2.nextInt();
     
        for (int i=0; i<m ; i++) {
            for (int j=0; j<n; j++){ 
                System.out.print(8);
            }   
            System.out.println();
        }
    }  
}
