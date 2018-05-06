
package Laba7_2Abstract;
public abstract class Pet {
    public String name;
    public int age;
    public boolean hungry;
    public abstract void voice();
    
    public static void main(String[] args) {
        PatrolDog dog1=new PatrolDog();
        dog1.voice();      
    }
    
}

