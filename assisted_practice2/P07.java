package practice_project.assisted_practice2;

import java.io.*;

public class P07 {
    public static void main(String[] args) {
        // Create a new file
        File file = new File("test.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

        // Write to the file
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Hello, world!");
            writer.flush();
            System.out.println("Data written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Read from the file
        try (FileReader reader = new FileReader(file)) {
            int character;
            StringBuilder content = new StringBuilder();
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }
            System.out.println("Content read from the file: " + content.toString());
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }

        // Update the file
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write("\nThis is an appended line.");
            writer.flush();
            System.out.println("Data appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while updating the file.");
            e.printStackTrace();
        }

        // Delete the file
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
