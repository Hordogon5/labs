/*
Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них
(Поиск минимума выполняется в функции).
 */
package Laba2;
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        int m,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
         m = sc.nextInt();
        System.out.print("Введите второе число: ");
        n = sc.nextInt();
        System.out.println("Минимум:"+min(m,n));  
    }
    public static int min(int a, int b) {
        if (a<b)
            return a;
        else
            return b;
    }   
}
