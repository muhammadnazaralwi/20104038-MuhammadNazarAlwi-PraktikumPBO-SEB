package modul6.tugas;

public class Main {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();

        chicken.setName("Jack");
        System.out.println(chicken.getName());
        chicken.breathe();
        chicken.eat();
        chicken.walk();

        Bird bird = new Bird();

        bird.setName("John");
        System.out.println(bird.getName());
        bird.breathe();
        bird.eat();
        bird.fly();

        Snake snake = new Snake();

        snake.setName("Luke");
        System.out.println(snake.getName());
        snake.breathe();
        snake.eat();
        snake.crawl();
    }
}

class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void breathe() {
        System.out.println(name + " sedang bernapas...");
    }

    void eat() {
        System.out.println(name + " sedang makan...");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println(getName() + " sedang berjalan...");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println(getName() + " sedang terbang...");
    }
}

class Snake extends Animal {
    void crawl() {
        System.out.println(getName() + " sedang melata...");
    }
}
