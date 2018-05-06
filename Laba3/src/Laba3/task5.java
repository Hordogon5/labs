
package Laba3;
public class task5 {
    public static void main(String[] args) {
        int[]array[]=new int[7][4];
        int max=0;
        int index=0;
        for(int i=0;i<7;i++){ 
            int p=1; 
            for(int j=0;j<4;j++){
                array[i][j]=(int)(Math.random()*11-5);
                System.out.print(array[i][j]+" ");
                p*=array[i][j];
            }
            System.out.println();
            if (max<Math.abs(p)) {
                max=Math.abs(p);
                index=i;
            } 
        }
        System.out.println("индекс строки: " + index);
    }         
}