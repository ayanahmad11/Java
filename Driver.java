
public class Driver {
    public static void main(String[] args)
    {
        Day4 myCar = new Day4();
        myCar.started().drive();
        myCar.color = "red";
        // myCar.drive();
        System.out.println(myCar.color);
        // due to car started in line 6 currentFUelinLitres
        // got decremented by 1;
        System.out.println(myCar.currentFuelInLitres);
        myCar.addFuel(7);
        System.out.println( myCar.getCurrentFuelLevel());

    }
}
