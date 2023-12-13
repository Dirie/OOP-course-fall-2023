public class Cars extends Automobiles {
    int doors;

    Cars(){}

    Cars(int d){
        this.doors = d;
    }
    Cars(int d,int md, String mk, double mph){
        this.doors = d;
        this.setMake(mk);
        this.setModel(md);
        this.setMilesPerHour(mph);
    }


    void setDoors(int d){
        this.doors = d;
    }

    int getDoors(){
        return  this.doors;
    }
}
