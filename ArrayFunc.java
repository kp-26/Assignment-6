import java.util.Scanner;
import java.util.ArrayList;

public class ArrayFunc {

    ArrayList<String> cars = new ArrayList<String>();

    public static void main(String[] args) {
        ArrayFunc obj = new ArrayFunc();
        obj.showMenu();
    }

    void showMenu() {

        int option = -1;
        Scanner sc = new Scanner(System.in);

        while (true) {

            showCars();

            System.out.println("\n======================");
            System.out.println("1. Add Element");
            System.out.println("2. Remove Element");
            System.out.println("3. Search Element");
            System.out.println("5. Sort");
            System.out.println("6. Reverse");
            System.out.println("7. Show Elements");
            System.out.println("0. Exit");
            System.out.println("======================");
            System.out.print("\nEnter option: ");
            option = sc.nextInt();

            switch (option) {

                // Add Element
                case 1:
                    System.out.print("\nEnter car name to add: ");
                    String element = sc.next();
                    cars.add(element);
                    break;

                // Remove Element
                case 2:
                    System.out.print("\nEnter car index to remove: ");
                    int index = sc.nextInt();
                    if (index < cars.size()) {
                        cars.remove(index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                //Search Element
                case 3:
                    System.out.print("\nEnter element to search: ");
                    String element2 = sc.next();
                    if(cars.contains(element2)) {
                        int pos = cars.indexOf(element2);
                        System.out.printf("Element exist at position: %d", pos);
                    }
                    break;

		    //Sort array
                case 6:
                    Collections.sort(cars);
                    System.out.println(cars);
                    break;

                default:
                    System.out.println("Invalid option. Try again!!!");
                    break;

            }

        }

    }

    void showCars() {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(i + " : " + cars.get(i));
        }
    }

}
