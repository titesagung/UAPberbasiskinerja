/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author Asus
 */
public class MainClass {
    public static void main(String[] args){
        CarRider ming = new CarRider("Lin Ming", 19, "08000000000");
        CarRider youhan = new CarRider("Bei Youhan", 20, "081111111111");
        CarRider ling = new CarRider("Ling'er", 31, "081222222222");
        
        CarData data = new CarData();
        data.addCar("SUV", "N 1111 AB", "Honda");
        data.addCar("SPORT", "N 2222 AB", "SSC Tuatara");
        data.addCar("TRUCK", "N 3333 AB", "Suzuki");
        
        data.list0fCar();
        
        
        RentArchive arsip = new RentArchive();
        arsip.rent(ming,data.carlist.get(1), 9);
        arsip.rent(youhan, data.carlist.get(0), 3);
        arsip.rent(ling, data.carlist.get(1),1);
        
        System.out.println("");
        
        
    } 
}
