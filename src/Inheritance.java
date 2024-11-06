public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "red";
        car.start();
        car.openSunroof();


        Bike bike = new Bike();
        bike.color = "blue";
        bike.start();
        bike.backBreak();

    }
}
class Veicle {
    String color;

    void start() {
        System.out.println("차량이 출발합니다.");
    }
}

class Car extends Veicle {
    Engine engine= new Engine();
    void openSunroof() {
        System.out.println("선루프를 엽니다");
    }
}

class Bike extends Car {
    void backBreak() {
        System.out.println("Hold BackBreak");
    }
}

class Engine {
    void run() {
        System.out.println("엔진이 작동합니다");
    }
}