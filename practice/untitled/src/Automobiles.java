public class Automobiles  {
    private int model;
    private String make;
    private double milesPerHour;

    void setModel(int m){
        this.model = m;
    }

    int getModel(){
        return this.model;
    }
    void setMake(String m){
        this.make = m;
    }

    String getMake(){
        return this.make;
    }

    void setMilesPerHour(double m){
        this.milesPerHour = m;
    }

    double getMilesPerHour(){
        return this.milesPerHour;
    }

}
