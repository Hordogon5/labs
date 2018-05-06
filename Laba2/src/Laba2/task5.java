
package Laba2;
import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        String name1, name2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое имя:");
        name1=sc.nextLine();
        System.out.println("Введите второе имя:");
        name2=sc.nextLine();
        Long(name1,name2);
    }
    public static void Long(String s1, String s2) {
        if(s1.equals(s2)){
           System.out.println("имена идентичны"); 
        } else if (s1.length()==s2.length())
           System.out.println("имена равны"); 
    }       
}

