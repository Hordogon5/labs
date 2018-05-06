
package task3;

public class Human extends Ape{
    public String name;
    public Human(double weight,int age, String gender,String color,String name) {
        super(weight, age, gender, color);
        name=name;
    }
    public void vivod() {
        System.out.println("Вес:"+weight);   
        System.out.println("Возраст:"+age);
        System.out.println("Пол:"+gender);
        System.out.println("Имя:"+name);
        System.out.println("Цвет:"+color);
    }       
}
