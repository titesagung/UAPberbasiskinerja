/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class RentArchive {
    private List<CarRent> rentData = new ArrayList<>();
    
    public void rent(CarRider rider, Car car, int rentDur){
        if (car.isStatus() == true){
            rentData.add(new CarRent(car, rider, rentDur));
            System.out.println("MOBIL BERHASIL DISEWA");
            car.setStatus(false);
        } else {
            System.out.println("MAAF, MOBIL SUDAH DISEWA");
        }
    }
    
    public void list0fCar(){
        System.out.println("----------------------------");
        System.out.println("INFORMASI PELANGGAN");
        System.out.println("----------------------------");
        
        for (CarRent car : rentData){
            System.out.println("NAMA PEMINJAM : " + car.getRider().getName());
            System.out.println("TIPE MOBIL : " + car.getCar().getCarType());
            System.out.println("NO. POLISI : " + car.getCar().getpolNum());
            System.out.println("LAMA RENTAL : " + car.getRentDur() + "HARI");
            System.out.println("------------------------------------------");
        }
    }
}
