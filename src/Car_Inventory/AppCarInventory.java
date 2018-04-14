package Car_Inventory;

public class AppCarInventory {

    public static void main(String[] args) {
        
        Cars allCars[] = new Cars[3];
        
        allCars[0] = new Chevy();
        allCars[1] = new Dodge();
        allCars[2] = new Jeep();
        
        
        for (Cars allCar : allCars) {
            allCar.yr();
        }
        /* I was just playing with an enhanced FOR-LOOP
        for (insects : allInsects) {
        System.out.println(insects);
        }
         */
    }
    
}
