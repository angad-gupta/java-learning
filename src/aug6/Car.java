package aug6;

public class Car {

    String model;
    String color;
    String year;
    String type;

    Car(){

    }

    Car(String model){
        this.model=model;
    }

    Car(String model, String color){
        this.model=model;
        this.color=color;
    }

    Car(String model, String color, String year){
        this.model=model;
        this.color=color;
        this.year=year;
    }

    Car(String model, String color, String year, String type){
        this.model=model;
        this.color=color;
        this.year=year;
        this.type=type;
    }



    public static void main(String[] args) {

        Car car= new Car();
        Car car1 = new Car("Tesla");
        Car car2 = new Car("Tesla", "red");
        Car car3 = new Car("Tesla", "black","2024");
        Car car4 = new Car("Tesla","red","2024","sedan");
        System.out.println(car1.model);
        System.out.println(car2.model + car2.color);

    }


}
