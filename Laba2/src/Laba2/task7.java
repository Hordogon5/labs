
package Laba2;
import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите x: ");
        x = sc.nextInt();         
        System.out.print("Введите y: ");
        y = sc.nextInt();                 
        if (x>0)
            if(y>0)
                System.out.println("первая четверть");
            else System.out.println("четвертая четверть");
        else 
            if (y>0)
                System.out.println("вторая четверть");
            else System.out.println("третья четверть");          
    }   
}
