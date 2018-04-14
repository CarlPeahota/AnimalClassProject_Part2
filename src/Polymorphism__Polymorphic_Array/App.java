package Polymorphism__Polymorphic_Array;

public class App {

    public static void main(String[] args) {
        
        Insect allInsects[] = new Insect[3]; //The "Insect[3]" referes to the superclass and use its method
        
        allInsects[0] = new Roach();
        allInsects[1] = new Beatle();
        allInsects[2] = new Spider();
        
    
        
/*        
        for (int i = 0; allInsects.length >= i; i++) {
            allInsects[i].eat();
        }
*/

        for (Insect allInsect : allInsects) {
                    allInsect.eat();

        }
    }
}
