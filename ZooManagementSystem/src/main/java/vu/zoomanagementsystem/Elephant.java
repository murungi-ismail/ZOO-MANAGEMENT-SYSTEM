package vu.zoomanagementsystem;
public class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }

 
    public void makeSound() {
        System.out.println("Trumpet trumpettt");
    }

    
    public void eat() {
        System.out.println("Eating grass");
    }
}
