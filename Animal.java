package Aizoo;

public class Animal {

    // Animal  class attribute
    private  String animalname;
    private int age;
    private String species;

    //  Create a static attributes that belongs to the Animal Class.
    public static int numofAnimals = 0;

    //Animal Class constructors.

    public Animal(String name, String aSpecies, int anAge) {
        System.out.println("\n A new Animal object was created.\n");

        // Create initial value for the class attributes.
        animalname = name;
        species = aSpecies;
        age = anAge;
        numofAnimals++;
    }

    public Animal(){
        System.out.println("\n A new Animals objects was created.\n");
        numofAnimals++;
    }
    // getters and setters for each attribute (optional, but recommened for good practice)
    public String getname() {
        return animalname;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species){
        this.species = species;
    }


}


