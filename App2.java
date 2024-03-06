import Aizoo.Animal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        System.out.println("\n\n Welcome to My Zoo Animal Report\n\n");

        // ArrayList of Animal objects
        ArrayList<Animal> animals = new ArrayList<>();

        // Open the external file, parse it line by line, and get age and species
        String filePath = "C:/2024 spring/midterm/arrivinganimals2.txt";

        File file = new File(filePath);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                // Split the line into parts using commas as separators
                String[] parts = line.split(",");

                // Check if there are at least two parts (name, age)
                if (parts.length >= 2) {
                    // Extract the name and age from the parts array
                    String name = parts[0].trim();
                    int age = Integer.parseInt(parts[1].trim());

                    // Concatenate the remaining parts as species
                    StringBuilder speciesBuilder = new StringBuilder();
                    for (int i = 2; i < parts.length; i++) {
                        speciesBuilder.append(parts[i].trim());
                        if (i < parts.length - 1) {
                            speciesBuilder.append(", ");
                        }
                    }
                    String species = speciesBuilder.toString();

                    // Create a new Animal object with the extracted information
                    Animal myAnimal = new Animal(name, species, age);

                    // Add the new animal object to the ArrayList of Animals
                    animals.add(myAnimal);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
            e.printStackTrace();
        }

        // Output the list of animals
        for (Animal animal : animals) {
            System.out.println("Animal name: " + animal.getname() + ", Age: " + animal.getAge() + ", Species: " + animal.getSpecies());
        }

        System.out.println("\n Number of animals is: " + Animal.numofAnimals);
    }
}
