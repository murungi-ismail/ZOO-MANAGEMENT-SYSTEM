package vu.zoomanagementsystem;
public class Lion extends Animal {
    public Lion(String name, int age) {
        
        super (name, age);
    }

    public void makeSound() {
        System.out.println("Roar roaaa");
    }

    public void eat() {
        System.out.println("Eating meat");
    }
}

