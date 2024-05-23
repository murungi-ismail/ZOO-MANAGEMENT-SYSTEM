package vu.zoomanagementsystem;
public abstract class Animal {
    private final String name;
    private final int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void makeSound();
    public abstract void eat();
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            makeSound();
        }
    }

    public void eat(String foodType) {
        System.out.println("Eating " + foodType);
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void displayInfo() {
	System.out.println("Name: " + name + ", Age: " + age);
}}


