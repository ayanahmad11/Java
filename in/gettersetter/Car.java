package in.gettersetter;

public class Car {
        private String color; // public
        private String model; // public
        private double fuelLevel;
        private long costOfPurchase; // default 

        public String getColor(){
            return color;
        }
        public String getModel(){
            return model;
        }
        void setColor(String color)
        {
            this.color = color;
        }
        public Car(){

        }
        public Car(String color,String model,double fuelLevel, long costOfPurchase)
        {
            this.color = color;
            this.model = model;
            this.fuelLevel = fuelLevel;
            this.costOfPurchase = costOfPurchase;
        }


}
