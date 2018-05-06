
package Laba2;
import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        int m, n, k, p;
        
            Scanner sc = new Scanner(System.in); 
                System.out.print("Введите первое число: ");
                m = sc.nextInt(); 
                System.out.print("Введите второе число: ");
                n = sc.nextInt();
                System.out.print("Введите третье число: ");
                k = sc.nextInt();
                System.out.print("Введите четвертое число: ");
                p = sc.nextInt();
           
        
        System.out.println("Минимум:"+min(m,n,k,p));
    }
     public static int min(int a, int b, int c, int d) {
          int temp = min(a, b);
        if (c < temp && c < d)
            return c;
        else if (d < temp && d < c)
            return d;
        else
            return temp;
     }
     public static int min(int a, int b)
    {
        if (a<b)
            return a;
        else
            return b; 
    }   
}
