
package Laba3;
public class task2 {
    public static void main(String[] args) {
        int array[]=new int[50];
        for(int i=0,n=1; i<array.length; n=n+2,i++){
            array[i]=n;
	}
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i]+" ");
	}
         System.out.println();
        for(int i=array.length-1; i>=0; i--) {
            System.out.print(array[i]+" ");
	}   
    }   
}
