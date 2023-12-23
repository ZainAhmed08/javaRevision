//Types of inheritances :
// single inheritance
// Multi inheritance ( interface based)
// Multi Level inheritance
// Hierarchical inheritance
// Hybrid inheritance

class Animal{
    String name;

    public Animal(){
        // note if no args constructor is present in the super class then there is no need of super in the sub class constructor.
    }
    public Animal(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }
}

class Dog extends  Animal{
    public Dog(String name){
//        super(name);        no need of a super() here since the super class has a no arg constructor.
        // but if the super class constructor does not have a no args constructor and super method is not used to instiantate the super class then an error will occure
    }
    public void bark(){
        System.out.println(name + " is barking");
    }
}


public class Inheritance01 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");

        myDog.eat();
        myDog.bark();
    }
}