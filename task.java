import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * task
 */
public class task {

    public static void main(String[] args) {
        String [] names = new String []{"Mursey", "Fluffy", "Kitty", "Pirate", "Chip", "Casper", "Pancake", "Roxxy", "Peanut", "Elvis"};
        ArrayList<Cat> kitties = new ArrayList<>();
        Random random = new Random();
        for (String name : names) {
            kitties.add(new Cat(name, random.nextInt(3,10)));
        }
        Plate plate01 = new Plate(45);
        int choice = 0;
        Scanner input = new Scanner(System.in);

        for (Cat cat : kitties) {
            if(plate01.getTheRest() < cat.getAppetite()){
                System.out.println("\nThe plate is empty, but some kitties are still hugry\nFill the plate?\n\n1 - Fill the plate\n2 - Live them starving");
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        plate01.setFood(random.nextInt(10,20));
                        System.out.printf("You have filled the plate with %d food\n", plate01.getTheRest());
                        break;
                
                    default:
                    System.out.printf("%s is hungry and you are to blame\n", cat.getName());
                        break;
                }
            }
            plate01.setFood(cat.eat(plate01.getTheRest())); // котик ест из тарелки и возвращает в неё остаток
        }

        
    }
}