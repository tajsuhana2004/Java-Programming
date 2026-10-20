public class Inheritence {
    public static void main(String args[]){

    dog tom=new dog();
    tom.eat();
    tom.sleep();
    tom.legs=4;
    System.out.println(tom.legs);
    
    shark s1=new shark();
    s1.swim();
    s1.sleep();
    }
    
    
}
//Hybrid  Inheritence example
// Base class
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");

    }
    void sleep(){
        System.out.println("Sleep");
    }

}
//Derived class
class mammal extends Animal{
    int legs;
    void run(){
        System.out.println("sleep");
    }
}
class dog extends mammal{
    void bark(){
        System.out.println("Bark");
    }
}
class cow extends dog{
    void Smells(){
        System.out.println("Smells");
    }
}
class fish extends Animal{
    void swim(){
        System.out.println("Swim");
    }
}
class shark extends fish{
    void breathe(){
        System.out.println("Breath");
    }
}
class bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}
class Peacoack extends bird{
    void dance(){
        System.out.println("dance");
    }
}