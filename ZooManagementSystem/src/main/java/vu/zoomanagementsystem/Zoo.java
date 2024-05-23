package vu.zoomanagementsystem;
public class Zoo {
    final Animal lion = new Lion("Simba", 5);
    final Animal elephant = new Elephant("Dumbo", 10);
    final Animal monkey = new Monkey("Mango", 3);

    public static void main(String[] args) {
        Zoo zoo = new Zoo(); 

        zoo.lion.displayInfo();
        zoo.lion.makeSound();
        zoo.lion.eat("meat");
        zoo.lion.makeSound(3);
        zoo.lion.eat("grass");

        zoo.elephant.displayInfo();
        zoo.elephant.makeSound();
        zoo.elephant.eat("grass");
        zoo.elephant.makeSound(2);
        zoo.elephant.eat("leaves");

        zoo.monkey.displayInfo();
        zoo.monkey.makeSound();
        zoo.monkey.eat("bananas");
        zoo.monkey.makeSound(4);
        zoo.monkey.eat("fruits");
    }
}