import controller.FileController;
import java.util.Scanner;

// Main entry point
public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FileController controller = new FileController();
        int choice;

        do {
            System.out.println("\n--- FILE HANDLING SYSTEM ---");
            System.out.println("1. Create File");
            System.out.println("2. Write File");
            System.out.println("3. Read File");
            System.out.println("4. Update File");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    controller.createFile();
                    break;
                case 2:
                    controller.writeFile();
                    break;
                case 3:
                    controller.readFile();
                    break;
                case 4:
                    controller.updateFile();
                    break;
                case 5:
                    System.out.println("Program Ended");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
