
package Laba4;

public class task3 {
    public static int[] bubbleSort(int[]array) {
        for (int i=array.length-1; i>1; i--)
            for (int j=0; j<i; j++)
                if (array[j] > array[j+1]) {
                int tmp=array[j];
                array[j]=array[j+1];
                array[j+1]=tmp;
            }
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
        return null;
    }      
    public static void main(String[] args) {
        int[]array=new int[10];
        for(int i=0; i<array.length; i++){
            array[i]=(int)(Math.random()*9);
        }
        bubbleSort(array);    
    }  
}
