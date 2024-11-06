public class Animal {
    public static void main(String[] args) {
        Cat cat= new Cat();
        cat.color = "gray";
        cat.go();

       Dog dog = new Dog();
        dog.color = "brown";
        dog.digging();

        Pig pig = new Pig();
        pig.color = "pink";
        pig.eat();



    }
}
class Pig {
    String color;

    void eat() {
        System.out.println("사료를 먹었습니다.");
    }
}

class Dog extends Pig {
    Walk walk= new Walk();
    void digging() {
        System.out.println("땅을 팝니다.");
    }
}

class Cat extends Pig {
//    String color;
//
//    void eat() {
//        System.out.println("사료를 먹었습니다.");
//    }
    void go() {
        System.out.println("그루밍합니다.");
    }
}

class Walk {
    void pet() {
        System.out.println("반려동물이 되었습니다.");
    }
}