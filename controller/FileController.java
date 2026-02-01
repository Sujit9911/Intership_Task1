package controller;

import service.FileService;
import java.util.Scanner;

// Controller layer – takes user input
public class FileController {

    FileService service = new FileService();
    Scanner sc = new Scanner(System.in);

    public void createFile() {
        if (service.createFile())
            System.out.println("File created successfully");
        else
            System.out.println("File already exists or error");
    }

    public void writeFile() {
        System.out.print("Enter text to write: ");
        String text = sc.nextLine();

        if (service.writeFile(text))
            System.out.println("Write successful");
        else
            System.out.println("Write failed");
    }

    public void readFile() {
        service.readFile();
    }

    public void updateFile() {
        System.out.print("Enter text to append: ");
        String text = sc.nextLine();

        if (service.updateFile(text))
            System.out.println("Update successful");
        else
            System.out.println("Update failed");
    }
}
