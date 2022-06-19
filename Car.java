/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author Asus
 */
class Car {
    private boolean status;
    private String carType, polNum, merk;
    
    public Car(String carType, String polNum, String merk, boolean status){
        this.carType = carType;
        this.polNum = polNum;
        this.merk = merk;
        this.status = status;
    }
    
    public String getCarType(){
        return carType;
    }
    
    public String getpolNum(){
        return polNum;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public boolean isStatus(){
        return status;
    }
    
    public void setStatus(boolean status){
        this.status = status;
    }

}
