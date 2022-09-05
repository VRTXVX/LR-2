import java.util.Scanner;
import com.house.House;
import com.house.HouseUtils;

public class Main {
    public static void main(String[] args) {
        House[] objects = choiceInputMethod();

        HouseUtils.printApartments(objects);
        HouseUtils.printApartmentsByRooms(objects);
        HouseUtils.printApartmentsByRoomsAndFloor(objects);
        HouseUtils.printApartmentsBySquare(objects);
    }

    private static House[] choiceInputMethod() {
        int choice;
        Scanner sc;
        do {
            System.out.print(" [1] - Enter data from keyboard\n [2] - Take test data\n >>> ");
            try {
                sc = new Scanner(System.in);
                choice = sc.nextInt();
                if (choice != 1 && choice != 2)
                    System.out.println("\n Wrong choice!");
                else
                    break;
            } catch (Exception e) {
                System.out.println(" value must be a number!");
            }

        } while (true);

        return choice == 1 ? inputData() : testData();
    }

    private static House[] inputData() {
        int kst;
        Scanner sc;
        do {
            System.out.print("\n Enter number of houses >>> ");
            try {
                sc = new Scanner(System.in);
                kst = sc.nextInt();
                if (kst > 0)
                    break;
            } catch (Exception e) {
                System.out.println("value is incorrect");
            }
        } while (true);

        House[] objects = new House[kst];

        int id;
        int number;
        int floor;
        int rooms;
        double square;
        String street;

        for (int i = 0; i < kst; i++) {
            System.out.println("\n\t Enter data for house №" + (i + 1));
            do {
                try {
                    System.out.print("\n Id >>> ");
                    id = sc.nextInt();

                    System.out.print(" Number >>> ");
                    number = sc.nextInt();

                    System.out.print(" Floor >>> ");
                    floor = sc.nextInt();

                    System.out.print(" Rooms >>> ");
                    rooms = sc.nextInt();

                    System.out.print(" Square >>> ");
                    square = sc.nextDouble();

                    System.out.print(" Street >>> ");
                    street = sc.nextLine();

                    if (id < 0 || number < 0 || floor < 0 || rooms < 0 || square < 0)
                        System.out.println("\n Invalid input!\n");
                    else {
                        objects[i] = new House(id, number, floor, rooms, square, street);
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("incorrect value");
                }

            } while (true);
        }
        return objects;
    }

    private static House[] testData() {
        House[] objects = new House[5];

        objects[0] = new House(9, 17, 1, 3, 100, "Zelena");
        objects[1] = new House(3, 33, 5, 5, 180, "Stryiska");
        objects[2] = new House(2, 21, 1, 2, 90, "Lychakivska");
        objects[3] = new House(7, 19, 3, 4, 115, "Horodotska");
        objects[4] = new House(6, 72, 9, 4, 120, "Shevchenka");

        return objects;
    }
}

