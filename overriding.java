class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
     public void makeSound() {
        System.out.println("Dog barks");
    }
}
class Overriding{
public static void main(String[] args) {
        Animal myAnimal = new Animal(); 
        Dog myDog = new Dog();         
        myAnimal.makeSound(); 
        myDog.makeSound();     
}
}


