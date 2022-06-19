/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class CarData {
        List<Car> carlist = new ArrayList<>();
        
        public void addCar(String carType, String polNum, String merk){
            carlist.add(new Car(carType, polNum, merk, true));
        }
        public void list0fCar(){
            System.out.println("----------------------------");
            System.out.println("DAFTAR MOBIL");
            System.out.println("----------------------------");
            
            for (Car car : carlist){
                System.out.println("TIPE MOBIL : " + car.getCarType());
                System.out.println("NO POLISI : " + car.getpolNum());
                System.out.println("MERK MOBIL : " + car.getMerk());
                System.out.println("----------------------------\n");
            }
        }
    }
