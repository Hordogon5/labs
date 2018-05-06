
package Laba3;
public class task1 {
    public static void main(String[] args) {
        int array[]=new int[10];
        for(int i=0,n=2; i<10; n=n+2,i++){
            array[i]=n;
	}
	for(int i=0; i<10; i++) {
            System.out.print(array[i]+" ");
	}
            System.out.println();
	for(int i=0; i<10; i++) {
            System.out.println(array[i]);               
        }
    }
}