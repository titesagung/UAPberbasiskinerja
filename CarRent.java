/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author Asus
 */
public class CarRent {
    private Car car;
    private CarRider rider;
    private int rentDur;
    
    public CarRent(Car car, CarRider rider, int rentDur){
        this.car = car;
        this.rider = rider;
        this.rentDur = rentDur;
    }
    
    public Car getCar() {
        return car;
    }
    
    public int getRentDur() {
        return rentDur;
    }
    
    public CarRider getRider() {
        return rider;
    }
    
}
