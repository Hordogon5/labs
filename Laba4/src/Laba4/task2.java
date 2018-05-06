
package Laba4;
import java.util.Scanner;
public class task2 {
    public static int[][] vivod(int[][]array) {
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
       
               System.out.println();  
        } 
        return array;
    }
    public static int random(int a, int b) {
        int c;
        c = (int)(Math.random()*((b+1)-a)+a);
        return c;
    }
    public static void main(String[] args) {
        int a, b;
        while(true) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Введите a: ");
                a = sc.nextInt();
                System.out.print("Введите b: ");
                b = sc.nextInt();   
            break;    
            }
            catch (Exception e) {
                System.out.println("Exception");
            }
        }
        System.out.print("Отрезок: ["+a+";");
        System.out.println(b+"]");
        int array[][] = new int[5][10];
            for(int i=0; i<array.length; i++) {
                for(int j=0; j<array[i].length; j++){
                    array[i][j]=(int)(random(a,b)); 
                }
            }
            vivod(array);
    }   
}