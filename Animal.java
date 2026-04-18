class Animal {
    String speciesName;
    Animal(String speciesName) {
        this.speciesName = speciesName;
    }
    void displaySpecies() {
        System.out.println("Species: " + speciesName);
    }
}
class Mammal extends Animal {
    boolean hasFur;
    Mammal(String speciesName, boolean hasFur) {
        super(speciesName); 
        this.hasFur = hasFur;
    }
    void displayHasFur() {
        System.out.println("Has Fur: " + hasFur);
    }
}
class Dog extends Mammal {
    String breed;
    Dog(String speciesName, boolean hasFur, String breed) {
        super(speciesName, hasFur);
        this.breed = breed;
    }
    void displayBreed() {
        System.out.println("Breed: " + breed);
    }
    void displayDetails() {
        displaySpecies();  
        displayHasFur();   
        displayBreed();    
    }
}
public class Main1 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Canine", true, "Golden Retriever");
        myDog.displayDetails();
    }
}
