class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println(name + " makes a sound");
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Tweet");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Dog dog = new Dog("Jimmy", 5);
        Cat cat = new Cat("Whiskers", 7);
        Bird bird = new Bird("Tweety", 9);

        System.out.print("Animal Sounds: \n");
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}