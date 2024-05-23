
package vu.zoomanagementsystem;
public class ZooManagementSystem{
    private final Animal lion;
    private final Animal elephant;
    private final Animal monkey;

    public static void main(String[] args) {
        //this is an instance
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
    public ZooManagementSystem() {
        this.monkey = new Monkey("Mango", 3);
        this.elephant = new Elephant("Dumbo", 10);
        this.lion = new Lion("Simba", 5);
    }
}
