package vu.zoomanagementsystem;
public class Monkey extends Animal {
    public Monkey(String name, int age) {
        super(name, age);
    }

   
    public void makeSound() {
        System.out.println("Chatter chatter clow");
    }

    
    public void eat() {
        System.out.println("Eating bananas");
    }
}

