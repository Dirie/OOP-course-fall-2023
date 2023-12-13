public class Main {
    public static void main(String[] args) {

    Cars car1 = new Cars(2);
    Cars car2 = new Cars(4,2023,"bmw",16.4);
    Cars car3 = new Cars();


    car1.setModel(2023);
    car1.setMake("Toyoto");
    String make = findCarMake(car1);

    Cars car4 = new Cars();
    car4 = setData(car3);





//    System.out.println("this car1 has built in " + car1.getModel());
//    System.out.println("this car1 was made by " + make);
    System.out.println("car 4 made by  " + car4.getMake() + ", it has "+ car4.getDoors() + " doors.");


    }
    static String findCarMake(Cars c){
        c.setMilesPerHour(12.5);
        c.setMake("nissan");
        c.setModel(2021);
        return c.getMake();
    }
    static Cars setData(Cars c){
        c.setMake("lambergini");
        c.setModel(2024);
        c.setDoors(2);
        return c;
    }
}

