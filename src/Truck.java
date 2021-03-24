public class Truck extends Vehicle {

    private double Tweight;         // truck weight rating

    public Truck(String Xtag, String Xvin, double Xpprice, int Xpyear, double nTweight){

    }

    public Venum getType(){
        return Venum.truck;
    }

    // Truck tax is a $50.75 fee + basic vehicle tax + 100 for each ton over 2
    public double getTax(){
           return 50.75 + super.getTax() + ....;
    }

    public String toString(){
        return "????";
    }
}
