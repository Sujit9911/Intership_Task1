package dao;

import java.io.*;
import java.util.Scanner;

// DAO layer – actual file operations
public class FileDAO {

    private final String fileName = "sample.txt";

    // create file
    public boolean createFile() {
        try {
            File file = new File(fileName);
            return file.createNewFile();
        } catch (IOException e) {
            System.out.println("Create Error: " + e.getMessage());
            return false;
        }
    }

    // write file (overwrite)
    public boolean writeFile(String text) {
        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write(text);
            fw.close();
            return true;
        } catch (IOException e) {
            System.out.println("Write Error: " + e.getMessage());
            return false;
        }
    }

    // read file
    public void readFile() {
        try {
            File file = new File(fileName);

            if (!file.exists()) {
                System.out.println("File not found");
                return;
            }

            Scanner reader = new Scanner(file);
            System.out.println("\n--- FILE CONTENT ---");

            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }

            reader.close();
        } catch (Exception e) {
            System.out.println("Read Error: " + e.getMessage());
        }
    }

    // update file (append)
    public boolean updateFile(String text) {
        try {
            FileWriter fw = new FileWriter(fileName, true);
            fw.write("\n" + text);
            fw.close();
            return true;
        } catch (IOException e) {
            System.out.println("Update Error: " + e.getMessage());
            return false;
        }
    }
}
