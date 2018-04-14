package AnimalInheritance;

import java.util.Scanner;

class Animal {
    public void makeSound() {}
    public void cuteness() {}
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
    @Override
    public void cuteness() {
        System.out.println("Very Cute!");
    }    
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
    @Override
    public void cuteness() {
        System.out.println("Cute!");
    }    
}

class Program {
    public static void main(String args[ ]) {
        Animal a = new Dog();
        Animal b = new Cat();
        
        Scanner myInput = new Scanner(System.in);
        
        String myName = myInput.nextLine().toUpperCase();
        System.out.println("You entered --->" + myName);
 
        switch (myName) {
            case "DOG": 
                System.out.println("It's a dog");
                a.makeSound();
                a.cuteness();                
                break;
            case "CAT": 
                System.out.println("It's a cat");
                b.makeSound();
                b.cuteness();                                
                break;            
            default:
                System.out.println("Not defined.");
                break;
        }

    }
}