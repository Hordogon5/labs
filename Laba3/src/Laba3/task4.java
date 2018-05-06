
package Laba3;
public class task4 {
    public static void main(String[] args) {
        int[] array[]=new int[8][5];
        for(int i=0;i<8;i++){
            for(int j=0;j<5;j++){
            array[i][j]=(int)(Math.random()*90+10);
            System.out.print(array[i][j]+" ");
            } 
        System.out.println();
        }
    }  
}
