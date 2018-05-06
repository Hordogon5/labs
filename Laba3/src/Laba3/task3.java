
package Laba3;
public class task3 {
    public static void main(String[] args) {
        int array[]=new int[15];
        for (int i=0;i<array.length;i++) {
            array[i]=(int)(Math.random()*10);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int col=0;
        for(int i=0;i<array.length;i++){
            if (array[i]%2==0 && (array[i]!=0))
                col++; 
        }
        System.out.println("Количество четных чисел: "+col);
    }   
}