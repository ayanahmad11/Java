package kgcoding;
public class Car {

    public String color;
    public String model;
    private double fuelLevel;
    private long costOfPurchase;
    public Car(){
        
    }
    public Car(String color,String model,double fuellevel,long costOfPurchase){
        this.color = color;
        this.model = model;
        this.fuelLevel = fuellevel;
        this.costOfPurchase = costOfPurchase;
    }
}

