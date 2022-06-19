/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author Asus
 */
public class CarRider {
    private String name, phone;
    private int age;
    
    
    public CarRider(String name, int age, String phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getPhone(){
        return phone;
    }
   
}
