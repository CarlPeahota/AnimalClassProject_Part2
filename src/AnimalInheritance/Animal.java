//Inteelisense suggested using @Override, but I'm not clear as to why, since it ran fine w/o it before the change was made

//I am adding this new comment 1

package AnimalInheritance;

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
        
        a.makeSound();
        a.cuteness();
        b.makeSound();
        b.cuteness();
    }
}