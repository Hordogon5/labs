
package Laba7_2Interface;

public class Pickup implements PassangersAuto,CargoAuto{
    public void transportCargo(){
        System.out.println("Перевозка груза");
    } 
    public void transportPas(){
        System.out.println("Перевозка людей");
    }   
    
}
